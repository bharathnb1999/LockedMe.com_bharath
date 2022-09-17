package packlockme;

import java.util.List;
import java.util.Scanner;

public class handleops {
	public static void handleWelcomeScreenInput() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				menuops.displayMenu();
				int input = sc.nextInt();

				switch (input) {
				case 1:
					fileops.displayAllFiles("main");
					break;
				case 2:
					handleops.handleFilemenuops();
					break;
				case 3:
					System.out.println("Application closed successfully.");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleWelcomeScreenInput();
			} 
		} while (running == true);
	}
	
	public static void handleFilemenuops() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				menuops.displayFilemenuops();
				fileops.createMainFolderIfNotPresent("main");
				
				int input = sc.nextInt();
				switch (input) {
				case 1:
					
					System.out.println("Enter the name of the file to be added to the folder");
					String fileToAdd = sc.next();
					
					fileops.createFile(fileToAdd, sc);
					
					break;
				case 2:
					
					System.out.println("Enter the name of the file to be deleted from folder");
					String fileToDelete = sc.next();
					
					fileops.createMainFolderIfNotPresent("main");
					List<String> filesToDelete = fileops.displayFileLocations(fileToDelete, "main");
					
					String deletionPrompt = "\nSelect index of which file to delete?"
							+ "\n(Enter 0 if you want to delete all elements)";
					System.out.println(deletionPrompt);
				
					int idx = sc.nextInt();
					
					if (idx != 0) {
						fileops.deleteFileRecursively(filesToDelete.get(idx - 1));
					} else {
						
						
						for (String path : filesToDelete) {
							fileops.deleteFileRecursively(path);
						}
					}
					

					break;
				case 3:
					
					System.out.println("Enter the name of the file to be searched from folder");
					String fileName = sc.next();
					
					fileops.createMainFolderIfNotPresent("main");
					fileops.displayFileLocations(fileName, "main");

					
					break;
				case 4:
					
					return;
				case 5:
					
					System.out.println("Application closed successfully.");
					running = false;
					sc.close();
					System.exit(0);
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleFilemenuops();
			}
		} while (running == true);
	}
}

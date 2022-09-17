package packlockme;

public class menuops {
	public static void printWelcomeScreen(String appName, String developerName) {
		String companyDetails = String.format("Welcome to %s.com \n" + "Lockers Pvt. Ltd. \n" + "\nDeveloped by %s\n", appName, developerName);
		String appFunction = "This application can: \n"
				+ "*Retrieve all files inside the folder\n"
				+ "*Search, add, or delete files in the folder\n";
		System.out.println(companyDetails);

		System.out.println(appFunction);
	}

	public static void displayMenu() {
		String menu = "\nSelect an option from below to: \n\n"
				+ "1) Retrieve all files inside the folder\n" + "2) Explore all the File operations\n"
				+ "3) Close the application\n";
		System.out.println(menu);

	}

	public static void displayFilemenuops() {
		String fileMenu = "\n\nSelect any option from below to:\n\n"
				+ "1) Add a file to the folder\n" + "2) Delete a file from the folder\n"
				+ "3) Search for a file present inside the folder\n" + "4) Show Previous Menu\n" + "5) Close the application\n";

		System.out.println(fileMenu);
	}

}

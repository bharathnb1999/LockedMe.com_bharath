package packlockme;

public class mainlockme {
	public static void main(String[] args) {
		
		fileops.createMainFolderIfNotPresent("main");
		
		menuops.printWelcomeScreen("LockedMe", "Bharath N B");
		
		handleops.handleWelcomeScreenInput();
}

}

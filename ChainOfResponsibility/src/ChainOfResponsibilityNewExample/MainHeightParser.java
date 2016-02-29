package ChainOfResponsibilityNewExample;

public class MainHeightParser {
	public static void main(String[] args) {
		//Create Chains
		LowHeightParser lowHeight = new LowHeightParser();
		AverageHeightParser avgHeight = new AverageHeightParser();
		HighHeightParser highHeight = new HighHeightParser();
		
		//Set Chains
		lowHeight.setHeightParser(avgHeight);
		avgHeight.setHeightParser(highHeight);
		
		//Create Height Manager Person 
		HeightManager Manager = new HeightManager();
		
		//Create Humans with different Heights
		Human lowHeighter = new Human("Bero","Lomsadze",159);
		Human avgHeighter = new Human("Baia","Lomsadze",170);
		Human highHeighter = new Human("Nia","Lomsadze",181);
		
		//Manage their Heights into categories
		Manager.ManageHeights(lowHeighter, lowHeight);
		Manager.ManageHeights(avgHeighter, lowHeight);
		Manager.ManageHeights(highHeighter, lowHeight);
		
	}
}

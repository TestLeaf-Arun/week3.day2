package week3.day2;

public class Desktop implements Hardware, Software {
	
	public void desktopModel(String name) {
		String modelName = name;
		System.out.println("Desktop Model is " + modelName);
	}

	public void softwareResources(int num) {
		int count = num;
		System.out.println("Number of Software Resources required are " + count);
	}

	public void hardwareResources(int num) {
		int count = num;
		System.out.println("Number of Hardware Resources required are " + count);
	}
	
	public static void main(String[] args) {
		Desktop objDesk = new Desktop();
		objDesk.desktopModel("Dell");
		objDesk.hardwareResources(50);
		objDesk.softwareResources(40);		
	}	
}
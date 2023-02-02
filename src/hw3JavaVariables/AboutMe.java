package hw3JavaVariables;
/*
 * Create a package name "hw3JavaVariables" inside the Homework project, Create a Class name "AboutMe". Declare one variable type (only one, so you know what is declared and what is initialized), and now initialize String and the other 8 types (for the variable name , you can try to give a different name from mine). Instantiate AboutMe class inside the main method body and call a few variables (not all, you can take 2 or 3 variables inside one sysout) by an object (you can use String concatenation to make it a more meaningful outcome). Give a single-line comment where a variable is declared and where is initialized (Example: // Variable declared). Follow indentation by Organizing the code and paste below.
 */

public class AboutMe {
	
	public int  myCellPhoneNumber; // Variable Declared
	public String name = "Muhammad A Mughnee";
	public byte age=35;// variable initialized
	public short myCarPrice =5000;
	public int myHouseNumber = 52152;
	public long myBankBalance = 452300000521l;
	public float myWeight = 170.25360f;
	public double myGrade = 3.562134554638;
	public char myShirtSize = 'M';
	public boolean raceHispanic = false;
	
	public static void main(String[] args) {
		AboutMe myInfo = new AboutMe();// Class is instantiated.
		System.out.println("My Name:"+ myInfo.name + "\nBank Balance:" + myInfo.myBankBalance + "\n My Grade:"+  myInfo.myGrade);
		
		
		
		
		
	}
	
		

}

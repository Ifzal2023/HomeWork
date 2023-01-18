package hw4JavaVariables;
/*
 Create another class AboutMeTest. Instantiate AboutMe class inside the main method. Initialize variables and call the method by the object. I expect print outcome for 2 people, one for you and another for your best friend Alex. give a single line comment where a variable is declared and initialized, the constructor is declared and initialized, and the method is implemented and initialized.
Follow indentation by Organizing the code and push to GitHub and paste the link of GitHub below. [Mark distribution (100): using variable --10, Create a method and constructor - 20, instantiate class - 10, initialize variables and call methods for you and Alex= 15  variable is declared and initialized, the constructor is declared and initialized, the method is implemented and initialized -- 10, organize code and other-- 25]. push your code to Git Hub -- 10. Share the package link below.
 
 */

public class AboutMeTest {
	public static void main(String[] args) {
		AboutMe ifzal = new AboutMe(); // Constructor is initialized here
		// variables are initialized below
		ifzal.name = "Muhammad A Mughnee";
		ifzal.myAge = 35;
		ifzal.myCarPayment = 600;
		ifzal.myHouseNumber = 3142;
		ifzal.myBankBalance = 123456213l;
		ifzal.myHeight = 5.5f;
		ifzal.myGrade = 3.894562;
		ifzal.myShirtSize = 'M';
		ifzal.vietnamWarVeteran = false;
		ifzal.aboutMe(); // Method is initialized here

		System.out.println("\n-----------------------------------------------------------------------\n");

		AboutMe alex = new AboutMe();// Constructor is initialized here
		// variables are initialized below
		alex.name = "Alex Rodriguez";
		alex.myAge = 55;
		alex.myCarPayment = 900;
		alex.myHouseNumber = 46523;
		alex.myBankBalance = 2356983l;
		alex.myHeight = 6.2f;
		alex.myGrade = 3.4562;
		alex.myShirtSize = 'L';
		alex.vietnamWarVeteran = true;
		alex.aboutMe(); // Method is initialized here

	}

}

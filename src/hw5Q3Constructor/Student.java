package hw5Q3Constructor;
/*
 Create a package name "hw5Q3Constructor" in your Home Work project. Inside the package,
a) Create a class "Student". Declare some variable -- stName, stID, sex, isProgrammer(as boolean), grade (as float). Declare the default constructor and only one parameterized constructor by using (hints: source -- generate constructor using fields-). Use only one System.out.println() in the parameterized constructor to declare the above variables.
b) Create another class StudentTest. Create object as many as you want under the main method. Initialize constructors. My expectation is to see in the console as --> This is from the default Constructor of Student class. in the next line, The second outcome -- > Student Name: <your name>, ID: <your id>, Sex: <your sex in char>, Grade: <your grade> and Java Programmer? Ans: true. Organize the code. Push in the GitHub. Paste your GitHub link below.
50 points

 */

public class Student {
	public String StName;
	public int stID;
	public char sex;
	public boolean programmer;
	public float grade;

	public Student() {
		System.out.println("This is from the default Constructor of Student class");

	}

	public Student(String StName, int stID, char sex, boolean programmer, float grade) {

		this.StName = StName;
		this.stID = stID;
		this.sex = sex;
		this.programmer = programmer;
		this.grade = grade;

		System.out.println("\nStudent name: " + StName + "\nStudent ID: " + stID + "\nSex: " + sex
				+ "\nIs Java Programmer? Ans: " + programmer + "\nGrade: " + grade);

	}
}

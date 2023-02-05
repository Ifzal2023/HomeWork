package hw8Abstraction;

public abstract class MedicalSchool {
	// --
	// -- Abstract Class: Contains both abstract and non abstract methods.
	// Abstract method can not be implemented, can be defined (declared) only
	// Non abstract methods can be implemented, but can not be defined (declared).

	// Example of a non Abstract Method.
	public void anatomyLab() {
		System.out.println("This method is from MedicalSchool Class");

	}

	// Example of an Abstract Method.
	public abstract void biochemistryLab();

	// Yes. Abstract classes can also have constructors just like any other normal
	// class.
	// The advantage of declaring a constructor within an abstract class is that it
	// can be called
	// from any subclass constructor using the super keyword to reuse the
	// initialization
	// logic when the subclass is being instantiated
	public MedicalSchool() {
		System.out.println("This default constructor is from MedicalSchool Class");

	}

}

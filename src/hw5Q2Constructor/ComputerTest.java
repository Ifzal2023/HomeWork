package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {

		// default Constructor initialized
		Computer computer = new Computer();
		System.out.println("-----------------------------------------------------------------------");
		// Parameterized Constructor initialized
		Computer computer1 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, 'A', false);
		System.out.println("-----------------------------------------------------------------------");
		// My Configuration
		Computer computer2 = new Computer("Windows", "Dell Inspiron 14", "Windows 11 Home", 989, 'A', true);

	}
}
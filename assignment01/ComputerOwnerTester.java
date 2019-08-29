package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
	public static void main(String[] args) {
		Person person = new Person("John", "Johnson", "987-65-4321", 
			new DateAndPlaceOfBirth(1999, 11, 30, "Toronto", "Canada"), 
			new StreetUSAddress("123 Main Street", "Apt B", "Manchester", "CT", "06042"));
		ComputerOwner owner = new ComputerOwner(person);
		
		owner.addComputer(new Computer("Lenovo", "Intel Core i5-7400", 16, 1100, true, 800.00));
		owner.addComputer(new Computer("Lenovo", "Intel Core i3-6100", 20, 800, false, 300.00));
		owner.addComputer(new Computer("Lenovo", "Intel Core i3-6100", 20, 800, true, 300.00));
		owner.addComputer(new Computer("Lenovo", "Intel Core i5-7400", 16, 1100, false, 800.00));
		
		System.out.println(owner.toString());
		
		owner.removeComputer(0);
		owner.removeComputer(1);
		
		System.out.println(owner.toString());
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");
			
			Person person2 = new Person("John", "Johnson", "987-65-4321", 
				new DateAndPlaceOfBirth(1999, 11, 30, "Toronto", "Canada"), 
				new StreetUSAddress("123 Main Street", "Apt B", "Manchester", "CT", "06042"));
			ComputerOwner owner2 = new ComputerOwner(person2);
		
			owner2.addComputer(new Computer("Lenovo", "Intel Core i5-7400", 16, 1100, true, 800.00));
			owner2.addComputer(new Computer("Lenovo", "Intel Core i3-6100", 20, 800, false, 300.00));
			owner2.addComputer(new Computer("Lenovo", "Intel Core i3-6100", 20, 800, true, 300.00));
			owner2.addComputer(new Computer("Lenovo", "Intel Core i5-7400", 16, 1100, false, 800.00));
		
			output.println(owner2.toString());
		
			owner2.removeComputer(0);
			owner2.removeComputer(1);
		
			output.println(owner2.toString());

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
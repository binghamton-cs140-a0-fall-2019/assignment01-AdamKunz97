package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
	public static void main(String[] args) {
		Person person = new Person("John", "Johnson", "987-65-4321", 
			new DateAndPlaceOfBirth(1999, 11, 30, "Toronto", "Canada"), 
			new StreetUSAddress("123 Main Street", "Apt B", "Manchester", "CT", "06042"));
		
		System.out.println(person.toString());
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");
			
			Person person2 = new Person("John", "Johnson", "987-65-4321", 
				new DateAndPlaceOfBirth(1999, 11, 30, "Toronto", "Canada"), 
				new StreetUSAddress("123 Main Street", "Apt B", "Manchester", "CT", "06042"));
			
			output.println(person2.toString());

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
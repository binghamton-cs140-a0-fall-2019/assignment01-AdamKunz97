package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth object1 = new DateAndPlaceOfBirth(1997, 9, 20, "Maine", "New York", "USA");
		DateAndPlaceOfBirth object2 = new DateAndPlaceOfBirth(1959, 3, 13, "Dunmore", "Pennsylvania", "USA");
		DateAndPlaceOfBirth object3 = new DateAndPlaceOfBirth(1959, 3, 13, "Endwell", "New York", "USA");
		DateAndPlaceOfBirth object4 = new DateAndPlaceOfBirth(1989, 11, 30, "Berlin", "Germany");
		DateAndPlaceOfBirth object5 = new DateAndPlaceOfBirth(1999, 11, 30, "Toronto", "Canada");
		
		System.out.println(object1.toString());
		System.out.println(object2.toString());
		System.out.println(object3.toString());
		System.out.println(object4.toString());
		System.out.println(object5.toString());
		System.out.println(object1.olderThan(object2));
		System.out.println(object1.youngerThan(object5));
		System.out.println(object2.hasSameBirthDateAs(object3));
		System.out.println(object4.hasSameBirthDayAs(object5));
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");
			
			DateAndPlaceOfBirth object12 = new DateAndPlaceOfBirth(1997, 9, 20, "Maine", "New York", "USA");
			DateAndPlaceOfBirth object22 = new DateAndPlaceOfBirth(1959, 3, 13, "Dunmore", "Pennsylvania", "USA");
			DateAndPlaceOfBirth object32 = new DateAndPlaceOfBirth(1959, 3, 13, "Endwell", "New York", "USA");
			DateAndPlaceOfBirth object42 = new DateAndPlaceOfBirth(1989, 11, 30, "Berlin", "Germany");
			DateAndPlaceOfBirth object52 = new DateAndPlaceOfBirth(1999, 11, 30, "Toronto", "Canada");
			
			output.println(object12.toString());
			output.println(object22.toString());
			output.println(object32.toString());
			output.println(object42.toString());
			output.println(object52.toString());
			output.println(object12.olderThan(object22));
			output.println(object12.youngerThan(object52));
			output.println(object22.hasSameBirthDateAs(object32));
			output.println(object42.hasSameBirthDayAs(object52));

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
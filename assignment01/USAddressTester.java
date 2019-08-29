package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester {
	public static void main(String[] args) {
		StreetUSAddress object1 = new StreetUSAddress("454 Ashley Road", " ", "Maine", "NY", "13802");
		StreetUSAddress object2 = new StreetUSAddress("123 Main Street", "Apt B", "Manchester", "CT", "06042");
		
		System.out.println(object1.toString());
		System.out.println(object2.toString());
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");
			
			StreetUSAddress object12 = new StreetUSAddress("454 Ashley Road", "", "Maine", "NY", "13802");
			StreetUSAddress object22 = new StreetUSAddress("123 Main Street", "Apt B", "Manchester", "CT", "06042");
			
			output.println(object12.toString());
			output.println(object22.toString());

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
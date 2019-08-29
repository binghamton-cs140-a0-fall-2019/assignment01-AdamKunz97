package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different 
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
		Computer comp1 = new Computer("Lenovo", "Intel Core i5-7400", 16, 1100, true, 800.00);
		Computer comp2 = new Computer("Lenovo", "Intel Core i3-6100", 20, 800, false, 300.00);
		Computer comp3 = new Computer("Lenovo", "Intel Core i3-6100", 20, 800, true, 300.00);
		Computer comp4 = new Computer("Lenovo", "Intel Core i5-7400", 16, 1100, false, 800.00);
		
		System.out.println(comp1.toString());
		System.out.println(comp2.toString());
		System.out.println(comp3.toString());
		System.out.println(comp4.toString());
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");
			
			
			
			output.println(comp1.toString());
			output.println(comp2.toString());
			output.println(comp3.toString());
			output.println(comp4.toString());

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
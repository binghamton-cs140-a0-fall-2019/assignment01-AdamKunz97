package assignment01;
/**
 * Class to store information about a personal computer with the
 * basic information stored in an advertisement for a computer.
 * 
 * @author CS 140
 *
 */
public class Computer {
	private String brand;
	private String cpuDescription;
	private int ramGB;
	private int diskGB;
	private boolean SSD;
	private double purchasePrice;

	/**
	 * Initialization constructor used to give initial values to all the fields 
	 * @param aBrand the brand name of this computer
	 * @param cpuDesc brief description of the cpu of this computer
	 * @param ram amount of ram in GB in this computer
	 * @param disk size of hard drive in GB in this computer
	 * @param ssd true if the hard drive is solid state
	 * @param purchPrice the purchase price of this computer
	 */
	public Computer(String aBrand, String cpuDesc, int ram, int disk, boolean ssd, double purchPrice) {
		brand = aBrand;
		cpuDescription = cpuDesc;
		ramGB = ram;
		diskGB = disk;
		SSD = ssd;
		purchasePrice = purchPrice;
	}
	/**
	 * Getter method for the brand name of this computer
	 * @return the brand of this computer
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * Getter method for the cpu description of this computer
	 * @return the cpu description of this computer
	 */
	public String getCpuDescription() {
		return cpuDescription;
	}
	/**
	 * Getter method for the ram in this computer 
	 * @return the ram in this computer in GB
	 */
	public int getRamGB() {
		return ramGB;
	}
	/**
	 * Getter method for the disk capacity in this computer 
	 * @return the disk capacity in this computer in GB
	 */
	public int getDiskGB() {
		return diskGB;
	}
	/**
	 * Getter method for the purchase price of this computer 
	 * @return the purchase price of this computer
	 */
	public double getPurchasePrice() {
		return purchasePrice;
	}
	/**
	 * Returns true if the hard drive of this computer is solid state 
	 * @return true if the hard drive is solid state
	 */
	public boolean isSSD() {
		return SSD;
	}
	
	/**
	 * The toString method is overridden to provide a summary of this computer. If the hard drive
	 * is larger than one terabyte, the String contains the disk size in terabytes. The purchase price
	 * is formatted as the expected dollars-and-cents. The description changes when the disk is 
	 * solid state or a normal hard drive. 
	 */
	@Override
	public String toString() {
		String diskStr = diskGB + "GB ";
		if (diskGB >= 1000) {
			diskStr = String.format("%.1fTB ", diskGB/1000.0);
		}
		if(SSD) {
			diskStr += "Solid State Drive, ";
		} else {
			diskStr += "Hard Drive, ";
		}
		return String.format(brand + ", " + cpuDescription + ", " + ramGB + "GB Memory, "
					+ diskStr + "Price: $%.2f ", purchasePrice); 
	}
}

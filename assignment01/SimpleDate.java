package assignment01;

public class SimpleDate {
	private int year;
	private int month;
	private int day;
	
	public static SimpleDate of(int yr, int m, int d) {
		var returnValue = new SimpleDate();
		returnValue.year = yr;
		returnValue.month = m;
		returnValue.day = d;
		return returnValue;
	}
	
	public boolean before(SimpleDate other) {
		//return (this.year < other.year && this.month < other.month && this.day < other.day);
		
		if (this.year <= other.year) {
			if (this.month <= other.month) {
				if (this.day < other.day) {
					return true;
				}
			}
		}
		
		return false;
	}
}
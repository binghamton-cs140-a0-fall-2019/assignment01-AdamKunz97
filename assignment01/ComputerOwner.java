package assignment01;

import java.util.ArrayList;
import java.util.List;
/**
 * Class ComputerOwner is a composite of a Person, the owner, and a list
 * of Computers that the Person owns. Operations are available to add to, 
 * query, and delete from the list.
 * @author CS 140
 *
 */
public class ComputerOwner {
	private Person owner;
	private List<Computer> computers = new ArrayList<>();
	/**
	 * Partial initialization constructor that sets the owner of this
	 * ComputerOwner
	 * @param owner the owner for this ComputerOwner
	 */
	public ComputerOwner(Person owner) {
		this.owner = owner;
	}
	/**
	 * Getter method for the owner field
	 * @return the owner of this ComputerOwner
	 */
	public Person getOwner() {
		return owner;
	}
	/**
	 * Getter method for the list of computers 
	 * @return the list of computers of this ComputerOwner
	 */
	public List<Computer> getComputers() {
		return computers;
	}
	
	/**
	 * Adds a Computer to the list of Computers of this ComputerOwner
	 * @param comp a Computer to add to the list of Computers
	 */
	public void addComputer(Computer comp) {
		computers.add(comp);
	}

	/**
	 * Removes Computer at index i from the list of Computers.
	 * Note that the index in the list starts at 0.
	 * @param i index in the list of Computers for removal
	 */
	public void removeComputer(int i) {
		computers.remove(i);
	}
	
	@Override
	public String toString() {
		return "Computer List, Owner: " + owner + "\nComputers: " + computers;
	}
}

/**
 * Process class with Comparable & Priority interfaces implemented
 * 
 * @author Ashleigh's Laptop
 *
 *Version 1.0
 *
 */
public class Process implements Comparable<Process>, Priority {

	//Instance variables
	private final String processID;
	private int priority;
	
	//Constructor
	public Process() {
		processID = "";
	} //end of empty-argument constructor
	
	public Process (String processID) {
		this.processID = processID;
	} //end of preferred constructor

	//Getters & Setters
	public int getPriority() {
		return priority;
	} //end of getPriority

	public void setPriority(int priority) {
		this.priority = priority;
	} //end of setPriority

	public String getProcessID() {
		return processID;
	} //end of getProcessID

	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	} //end of toString


	// compareTo method implemented from Comparable interface
	//Used to compare priorities of varying processes
	@Override
	public int compareTo(Process o) {
		
		if (this.priority == (o.getPriority())) {
			return 0;
		} else if (this.priority < (o.getPriority())) {
			return -1;
		} else {
			return 1;
		}
	
	} // end of compareTo
	
	
} //end of Process class

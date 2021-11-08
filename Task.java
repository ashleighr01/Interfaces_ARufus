/**
 * Task Class with the Comparable & Priority interfaces implemented
 * 
 * @author Ashleigh's Laptop
 *
 *Version 1.0
 *
 */
public class Task implements Comparable <Task>, Priority {

	//Instance variables
	private final String name;
	private int priority;
	private Status Status;
	
	//Enumerated Type for Status
	enum Status {
		
		//instance variables
		NOT_STARTED,
		IN_PROCESS,
		COMPLETE;
		
		Status() {
			
		} //end of Status constructor
	} //end of Status enumerated type
	
	//Constructors
	public Task() {
		name = "";
	} //end of empty-argument constructor
	
	public Task (String name) {
		this.name = name;
	} //end of preferred constructor

	//Getters & setters
	public String getName() {
		return name;
	} //end of getName
	
	public Status getStatus() {
		return Status;
	} //end of getStatus
	
	public void setStatus(Status Status) {
		this.Status = Status;
	} //end of setStatus


	public int getPriority() {
		return priority;
	} //end of getPriority

	public void setPriority(int priority) {
		this.priority = priority;
	} //end of setPriority

	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + ", Status=" + Status + "]";
	} //end of toString


	//compareTo method from Comparable interface
	//Used to compare the priorities of varying tasks
	@Override
	public int compareTo(Task o) {
		if (this.priority == (o.getPriority())) {
			return 0;
		} else if (this.priority > (o.getPriority())) {
			return 1;
		} else {
			return -1;
		}
	
	} //end of compareTo
	
} // end of Task class

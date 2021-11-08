/**
 * Priority interface created to be incorporated by the Task & Process classes
 * 
 * @author Ashleigh's Laptop
 *
 *Version 1.0
 *
 */
public interface Priority {

	//Instance variables also static
	static int MED_PRIORITY = 5;
	static int MAX_PRIORITY = 10;
	static int MIN_PRIORITY = 1;
	
	//Methods that will be implemented in the Task & Process classes
	public void setPriority(int priority);
	public int getPriority();
	
} //end of Priority Interface

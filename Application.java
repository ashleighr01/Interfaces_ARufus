
/**
 * Application class used to test the RationalNumber code, Task code, & Process code
 * 
 * @author Ashleigh's Laptop
 *
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Program 1 testing
		RationalNumber num1 = new RationalNumber(21, 25);
		RationalNumber num2 = new RationalNumber (17, 19);
		
		System.out.println(num1.toString());
		System.out.println(num2.reciprocal());
		System.out.println(num1.compareTo(num2));
		


		RationalNumber num3 = new RationalNumber(1, 10);
		RationalNumber num4 = new RationalNumber(100,10);
		
		System.out.println(num3.isLike(num4));
		System.out.println(num4.add(num3));
		System.out.println(num4.compareTo(num3));
		
		//Program 2 testing
		
		//Task Testing
		Task clean = new Task ("Clean up");
		clean.setPriority(5);
		clean.setStatus(Task.Status.COMPLETE);
		Task read = new Task ("Read the paper");
		read.setPriority(5);
		read.setStatus(Task.Status.IN_PROCESS);
		
		
		System.out.println(clean.toString());
		System.out.println(read.toString());
		System.out.println(clean.compareTo(read));
		
		//Process Testing
		Process pro1 = new Process ("PRO12123");
		pro1.setPriority(10);
		Process pro2 = new Process ("PROOO122");
		pro2.setPriority(5);
		
		System.out.println(pro1.toString());
		System.out.println(pro2.toString());
		System.out.println(pro2.compareTo(pro1));
 	}

}

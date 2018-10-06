import java.util.*;

/* This class is client code that uses the the quadratic class to perform calculations to describe characteristics of quadratic graph
 * author@Eric Ding
 * version@10-1-18
 */

public class QuadraticClient {	

	public static void main(String[] args) {
		boolean done=true;
		while(done==true) {
			System.out.println("Please enter the coefficients of a quadratic function and press enter.");
			Scanner console = new Scanner (System.in);
			System.out.println("a:");
			double a = console.nextDouble();
			System.out.println("b:");
			double b = console.nextDouble();
			System.out.println("c:");
			double c = console.nextDouble();
			System.out.println(Quadratic.quadrDescriber(a, b, c));
			System.out.println("Do want to continue? If you want to quit, type quit.");
			String d = console.nextLine();
			if(d=="quit") {
				done=false;
				console.close();
			} else {
				done=true;
			}	
	}
}
}

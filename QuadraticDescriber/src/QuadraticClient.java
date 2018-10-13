import java.util.*;

/* This class is client code that uses the the quadratic class to perform calculations to describe characteristics of quadratic graph
 * author@Eric Ding
 * version@10-1-18
 */

public class QuadraticClient {	

	public static void main(String[] args) {
		boolean done=false;
		while (done==false) {
			System.out.println("Please enter the coefficients of a quadratic function.");
			Scanner console = new Scanner (System.in);
			System.out.print("a=");
			double a = console.nextDouble();
			while (a==0) {
				System.out.println("a=0 is not a quadratic function, enter a new value for a");
				a = console.nextDouble();
			}
			System.out.print("b=");
			double b = console.nextDouble();
			System.out.print("c=");
			double c = console.nextDouble();
			System.out.println(Quadratic.quadrDescriber(a, b, c));
			System.out.println("If you want to continue, type any letter. If you want to quit, type quit.");
			String d = console.next();
			if(d.equals("quit")) {
				done=true;
				console.close();
				System.out.println("Thanks for playing! Smash that like button! Subscribe for more content every time Ms. Dreyer assigns it!");
			} else {
				done=false;
			} 
	}	
}
}
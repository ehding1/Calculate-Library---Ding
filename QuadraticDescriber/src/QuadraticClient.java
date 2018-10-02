import java.util.*;

/* This class is client code that uses the the quadratic class to perform calculations to describe characteristics of quadratic graph
 * version@10-1-18
 */

public class QuadraticClient {

	public static void main(String[] args) {
		System.out.println("Please enter the coefficients off a quadratic function in order of a, b, and c.");
		Scanner console = new Scanner (System.in);
		double a = console.nextDouble();
		double b = console.nextDouble();
		double c = console.nextDouble();
		console.close();
		System.out.println(Quadratic.quadrDescriber(a, b, c));
		//add throw exception for a=0
	}

}

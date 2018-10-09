/* Performs calculations that describe opening direction, vertex, and x-intercepts of quadratic graph
 * author@Eric Ding
 * version@10-1-18
 */
public class Quadratic {

	//provides coefficients of quadratic equation in standard form and returns value of discriminant
	public static double discriminant (double a, double b, double c) {
		return b*b-4*a*c;
	}
	
	//returns absolute value of number passed
	public static double absValue (double num) {
		if (num<0) {
			return -num;
		} else {
			return num;
		}
	}
	
	//rounds double correctly to two decimal places 
	public static double round2 (double num) {
		int timesthousand = (int) (num*1000);
		int timeshundred = (int) (num*100);
		if(timesthousand%10<5) {
			return (timeshundred)/100.0;
		} else {
			return (timeshundred+1)/100.0;
		}
	}
	
	//returns approximation of square root of value passed rounded to two decimal places
	public static double sqrt (double num) {
		if (num<0) {
			return 0.0;
		} if (num==0) {
			return 0.0;
		} else {
		double estimate=1;
		double difference=1;
		while(absValue(difference)>=.005) {
			estimate=((num/estimate)+estimate)/2;
			difference=num-estimate*estimate;
		}
		return round2(estimate);
	}
	}
	
	//uses coefficients of quadratic equation in standard form and quadratic formula to approximate real roots
	public static String quadForm (double a, double b, double c) {
		double root1=round2((-b-(sqrt(discriminant(a, b, c))))/(2*a));
		double root2=round2((-b+(sqrt(discriminant(a, b, c))))/(2*a));
		if (discriminant(a, b, c)<0) {
			return "no real roots" ;
		} if (discriminant(a, b, c)==0) {
			return root1+" ";
		} else {
			if (root1<root2) {
				return root1+" and "+root2;
			} else {
				return root2+" and "+root1;
			}
		}	
	}

public static String quadrDescriber (double a, double b, double c) {
	// describes direction graph opens
	String open;
	if (a<0) {
		open="downwards";
	} else { 
		open = "upwards";
	}
	
	//describes vertex of graph
	double x = round2((-1*b)/(2*a));
	double y = round2((a*x*x)+(b*x)+c);
	String vert = "("+x+", "+y+")";
	
	//describes intercepts of graph
	String roots = quadForm(a, b, c);
	
	return "Description of graph of y="+a+"x^2+"+b+"x+"+c+":\n"+"Opens: "+open+"\nAxis of symmetry: "+x+"\nVertex: "+vert+"\nX-intercepts: "+roots+"\nY-intercept: "+c;	
}
}

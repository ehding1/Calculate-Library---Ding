/*This class contains methods that perform various math operations
 *author@Eric Ding
 *version@9-6-18
 */

public class Calculate {

//returns square of number
public static int square (int number) {
	return number*number;
}

//returns cube of number
public static int cube (int number) {
	return number*number*number;
}

//returns average of two values
public static double average (double number1, double number2) {
	return (number1 + number2)/2;
}

//returns average of three values
public static double average (double num1, double num2, double num3) {
	return (num1+num2+num3)/3;
}

//converts angle measure given in radians to degrees
public static double toDegrees (double radians) {
	return radians*180/3.14159;
}

//converts angle measure given in degrees to radians
public static double toRadians (double degrees) {
	return degrees*3.14159/180;
}

//provides coefficients of quadratic equation in standard form and returns value of discriminant
public static double discriminant (double a, double b, double c) {
	return b*b-4*a*c;
}

//converts mixed number into improper fraction
public static String toImproperFrac (int wholenum, int numerator, int denominator) {
	return wholenum*denominator+numerator+"/"+denominator;
}

//converts improper fraction into mixed numbers
public static String toMixedNum (int numerator, int denominator) {
	return numerator/denominator+"_"+numerator%denominator+"/"+denominator;
}

//converts binomial multiplication of form (ax+b)(cx+d) into quadratic equation of form ax^2+bx+c
public static String foil (int a, int b, int c, int d, String n) {
	return a*c+"n^2+"+(a*d+b*c)+"n+"+b*d; 
}

//determines whether or not one integer is evenly divisible by another
public static boolean isDivisibleBy (int dividend, int divisor) {
	if (divisor==0) {
		throw new IllegalArgumentException("Cannot divide by zero");
	} 
	if (dividend%divisor==0) {
		return true;
	} else {
		return false;
	}
}

//returns absolute value of number passed
public static double absValue (double num) {
	if (num<0) {
		return -num;
	} else {
		return num;
	}
}

//returns larger of two values
public static double max (double num1, double num2) {
	if (num1>=num2) {
		return num1;
	} else {
		return num2;
	}
}

//returns largest of three values
public static double max (double num1, double num2, double num3) {
	if (num1>=num2 && num1>=num3) {
		return num1;
	} if (num2>=num1 && num2>=num3) {
		return num2;
	} else {
		return num3;
	}
}

//return smaller of two values
public static int min (int num1, int num2) {
	if (num1<=num2) {
		return num1;
	} else {
		return num2;
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

//raises value to positive integer power
public static double exponent (double base, int exponent) {
	if (exponent<=0) {
		throw new IllegalArgumentException("Integer power must be positive");
	}
	double answer=base;
	for (int i=1; i<exponent; i++) {
		answer=answer*base;
	}
		return answer;
}

//returns factorial of value passed
public static int factorial (int num) {
	if (num<0) {
		throw new IllegalArgumentException("Cannot take factorial of negative number");
	}
	if (num==0) {
		return 1;
	}
	int answer=1;
	for (int i=1; i<=num; i++) {
		answer=answer*i;
	}
		return answer;
}

//determines whether or not an integer is prime
public static boolean isPrime (int num) {
	boolean noprime=true;
	for (int i=2; i<num; i++) {
		if(isDivisibleBy(num, i)) {
			noprime=false;
		}
	}
	return noprime;
}

//finds greatest common factor of two integers
public static int gcf (int num1, int num2) {
	int answer=1;
	for (int i=num1; i>=1; i--) {
		if(isDivisibleBy(num1, i)&&(isDivisibleBy(num2, i))) {
			answer=i;
			i=0;
		}
	}
	return answer;
}

//returns approximation of square root of value passed rounded to two decimal places
public static double sqrt (double num) {
	if (num<0) {
		throw new IllegalArgumentException("Cannot take square root of negative number");
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
public static String quadForm (int a, int b, int c) {
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
}

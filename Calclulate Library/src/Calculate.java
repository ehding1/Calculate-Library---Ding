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
public static double toDegrees (double number) {
	return number*180/3.14159;
}

//converts angle measure given in degrees to radians
public static double toRadians (double number) {
	return number*3.14159/180;
}

//provides coefficients of quadratic equation in standard form and returns value of discriminant
public static double discriminant (double a, double b, double c) {
	return b*b-4*a*c;
}

//converts mixed number into improper fraction
public static String toImproperFrac (int num1, int num2, int num3) {
	return num1*num3+num2+"/"+num3;
}

//converts improper fraction into mixed numbers
public static String toMixedNum (int num1, int num2) {
	return num1/num2+"_"+7%2+"/"+num2;
}

//converts binomial multiplication of form (ax+b)(cx+d) into quadratic equation of form ax^2+bx+c
public static String foil (int num1, int num2, int num3, int num4, String n) {
	return num1*num3+"n^2+"+(num1*num4+num2*num3)+"n+"+num2*num4; 
}

//determines whether or not one integer is evenly divisible by another
public static boolean isDivisibleBy (int num1, int num2) {
	if (num1%num2==0) {
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
public static double exponent (double num1, int num2) {
	double answer=num1;
	for (int i=1; i<num2; i++) {
		answer=answer*num1;
	}
		return answer;
}

//returns factorial of value passed
public static int factorial (int num) {
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
	double estimate=1;
	double difference=1;
	while(absValue(difference)>=.005) {
		estimate=((num/estimate)+estimate)/2;
		difference=num-estimate*estimate;
	}
	return round2(estimate);
}
}	


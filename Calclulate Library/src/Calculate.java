/*This class contains methods that perform various math operations
 *author@Eric Ding
 *version@9-6-18
 */

public class Calculate {
	//returns square of number
public static int square (int number) {
	return number*number;
	}
public static int cube (int number) {
	return number*number*number;
	}
public static double average (double number1, double number2) {
	return (number1 + number2)/2;
	}
public static double toDegrees (double number) {
	return number*180/3.14159;
	}
public static double toRadians (double number) {
	return number*3.14159/180;
	}
public static double discriminant (double a, double b, double c) {
	return b*b-4*a*c;
	}
public static String toImproperFrac (int num1, int num2, int num3) {
	return num1*num3+num2+"/"+num3;
	}
public static String toMixedNum (int num1, int num2) {
	return num1/num2+"_"+7%2+"/"+num2;
	}
public static String foil (int num1, int num2, int num3, int num4, String n) {
	return num1*num3+"n^2+"+(num1*num4+num2*num3)+"n+"+num2*num4; 
	}	
}



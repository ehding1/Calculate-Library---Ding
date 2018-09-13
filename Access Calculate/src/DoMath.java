/*This class is client code that uses the calculate library to perform various mathematical tasks
 *author@Eric Ding
 *version@9-6-18 
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(5));
		System.out.println(Calculate.average(5.0, 6.3));
		System.out.println(Calculate.toDegrees(3.14159));
		System.out.println(Calculate.toRadians(180));
		System.out.println(Calculate.discriminant(1, 2, 3));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println(Calculate.isDivisibleBy(50, 3));
		System.out.println(Calculate.absValue(-3.5));
		System.out.println(Calculate.max(9, 5));
		System.out.println(Calculate.max(8, 55, 8));
		System.out.println(Calculate.min(5, 22));
	}

}

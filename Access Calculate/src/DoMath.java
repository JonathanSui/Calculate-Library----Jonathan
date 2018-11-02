/*This class is client code that uses  Calculate Library
 * to perform various mathematical tasks.
 * @author Jonathan Sui
 * @version September 6, 2018
 */
public class DoMath {

	public static void main(String[]args) {
		
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(5));
		System.out.println(Calculate.average(1,2));
		System.out.println(Calculate.average(1,2,3));
		System.out.println(Calculate.toDegrees(2));
		System.out.println(Calculate.toRadians(180));
		System.out.println(Calculate.discriminant(3,4, 5));
		System.out.println(Calculate.toImproperFrac(3,1,2));
		System.out.println(Calculate.toMixedNum(5,2));
		System.out.println(Calculate.foil(4,2,1,3,"n"));
		System.out.println(Calculate.isDivisibleBy(6,3));
		System.out.println(Calculate.absValue(-7));
		System.out.println(Calculate.max(7, 8));
		System.out.println(Calculate.max(7, 8, 9));
		System.out.println(Calculate.min(7, 8));
		System.out.println(Calculate.round2(4.6457));
		System.out.println(Calculate.exponent(4,3));
		System.out.println(Calculate.factorial(4));
		System.out.println(Calculate.isPrime(7));
		System.out.println(Calculate.gcf(12, 16));
		System.out.println(Calculate.sqrt(9));
	}
}

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
		System.out.println(Calculate.discriminant(3,4,5));
		System.out.println(Calculate.toImproperFrac(3,1,2));
		System.out.println(Calculate.toMixedNum(5,2));
	}
}

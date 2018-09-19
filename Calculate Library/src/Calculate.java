/*This class contains methods that perform various math operations."
 * @author Jonathan Sui
 * @version September 6, 2018
 */
public class Calculate {

	//returns the square of the input
	public static int square(int number) {
		int answer;
		answer = number*number*number;
		return answer;
		// returns number*number;
	}
	
	// write cube. returns the cube of the input
	public static int cube(int number) {
		int answer;
		answer = number*number*number;
		return answer;
	}
	
	//returns the average of two doubles
	public static double average(double num1, double num2) {
		double average;
		average = num1+num2;
		return average/2;
	}
	
	//return the average of three doubles
	public static double average(double num1, double num2, double num3) {
		double average; 
		average = num1+num2;
		return average/2;
	}
	
	//returns a double
	public static double toDegrees(double number) {
		double degrees = number*180/3.14159;
		return degrees;
	}
	
	//returns a double
	public static double toRadians(double number) {
		double radians = number*3.14159/180;
		return radians;
	}
	
	//returns value of discriminant. returns a double
	public static double discriminant(double a,double b,double c) {
		return b*b-4*a*c;
	}
	
	//returns a String
	public static String toImproperFrac(int a,int b,int c) {
		int numerator= a*c+b;
		return numerator+"/"+c;
	}
}

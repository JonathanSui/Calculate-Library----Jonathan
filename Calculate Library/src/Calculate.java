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
	
	//returns a String
	public static String toMixedNum(int a,int b) {
		int wholeNum=a/b;
		int numerator=a%b;
		return wholeNum+ " "+ numerator + "/" + b;
	}
	
	//converts binomial multiplication (ax+b)(cx+d) into quadratic equation ax^2+bx+c returns a string
	public static String foil(int a,int b,int c,int d,String n) {
		String quadratic = "(ax+b)+(cx+d)";
		quadratic = (a*c+n + "^2"+ "+" + (a*d+c*b+n)+ "+" +b*d);
		return quadratic;
	}
	
	//determines if an integer is evenly divisible by another. accepts two integers. returns boolean
	public static boolean isDivisibleBy(int a,int b) {
		if(a/b==0) {
			return true;
		}else {
			return false;
	}
}	
	//returns absolute value of number passed. accepts double, returns double
	public static double absValue(int a) {
		if(a<0) {
			return -a;
		}else {
			return a;
	}
}	
	//returns larger values passed. accepts two doubles and returns a double
	public static double max(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
	}
}		
	//accepts three doubles. returns a double
	public static double max(int a,int b,int c) {
		if(a>b) {
			if(a>c) {
				return a;
			}else {
				return c;
			}
		}else {
				if(b>c) {
					return b;
				}else {
					return c;	
				}
		}
}
	
	//returns smaller value. accepts two integers. returns one integer
	public static double min(int a, int b) {
		if(a>b) {
			return b;
		}else {
			return a;
		}
}		
	//rounds double two decimal places. returns a double
	public static double round2(double a) {
		if(a>0) {
			a += 0.005;
		}else {
			a -= 0.005;
		}
		a *= 100;
		double round = (int)a;
		round /= 100;
		return round;
	}
	
	//raises value to positive integer power. accepts a double and integer and returns a double
	public static double exponent(double base,int exponent) {
		double ans=1; {	
		}
		if(exponent > 0) { 
			for(int i=1;i<=exponent;i++) {
				ans *= base;
		}
		}else {
			ans = 1;
		}
		return ans;
	}
}
	
/*This class contains methods that perform various math operations."
 * @author Jonathan Sui
 * @version September 6, 2018
 */
public class Calculate {
	//returns the square of the input
	public static int square(int number) {
		int answer;
		answer = number*number;
		return answer;
		// returns number*number;
	}
	public static double square(double number) {
		double answer;
		answer = number*number;
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
		if(b==0)
			throw new IllegalArgumentException("You can't divide by 0");
		if(a%b==0) {
			return true;
		}else {
			return false;
	}
}	
	//returns absolute value of number passed. accepts double, returns double
	public static double absValue(double a) {
		if(a<0) {
			return -a;
		}else {
			return a;
	}
}	
	//returns larger values passed. accepts two doubles and returns a double
	public static int max(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
	}
}		
	public static double max(double a, double b) {
		if(a>b) {
			return a;
		}else {
			return b;
	}
}		
	//accepts three doubles. returns a double
	public static int max(int a,int b,int c) {
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
	public static int min(int a, int b) {
		if(a>b) {
			return b;
		}else {
			return a;
		}
}		
	public static double min(double a, double b) {
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
		if(exponent<0)
			throw new IllegalArgumentException("You can't have a negative exponent");
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
	
	//returns factorial. it accepts an integer and returns an integer, exponent is positive
	public static int factorial(int n) {
		if(n<0)
			throw new IllegalArgumentException("You can't find the factorial of negative numbers");
		if(n==0)
			return 1;
		return n*factorial(n-1);
	}
	//determines if an integer is prime or not. accepts an integer and returns a boolean
	public static boolean isPrime(int n) {
		boolean answer = true;
		for(int a=2; a<n; a++) {
			if(isDivisibleBy(n,a)) {
			answer = false;
			} 
		}
		return answer;
	}
	//gcf will find the largest factor of two different integers. It will accept two positive integers and return an integer
	public static int gcf(int num1, int num2) {
		int gcf = 0;
		if (num1>num2) {
			for(int i=num2; i>= 1; i--) {
				if(isDivisibleBy(num1, i) && isDivisibleBy(num2, i)) {
					return i;
				}
			}
		}else {
			for(int j=num1; j>=1; j--) {
				if(isDivisibleBy(num1, j) && isDivisibleBy(num2, j)) {
					return j;
				}
			}
		}
		return gcf;
	}
	//sqrt returns an approximation of square root. it accepts a doouble and returns a double
	public static double sqrt(double num) {
		if(num < 0) {
			throw new IllegalArgumentException("You can't sqrt a negative number, it isn't possible");
		}
			double value=1;
			
			while(!(absValue(num-square(value))<0.001)) {
				value = 0.5 * (num / value + value);
			}
			return round2(value);
		}
	//quadForm will 
	public static String quadForm(int a, int b, int c) {
		String answer = "no real roots";
		
			if(discriminant(a,b,c)>0) {
				double root1 = round2((-1*b + sqrt(discriminant(a,b,c))) / (2*a));
				double root2 = round2((-1*b - sqrt(discriminant(a,b,c))) / (2*a));
				answer = min(root1,root2)+" and "+ max(root1,root2);
			}else {
				if(discriminant(a,b,c)==0) {
					answer = round2((-1*b)/(2*a)) +"";
				}
		}
			return answer;
	}
	}
	
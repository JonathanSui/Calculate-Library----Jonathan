
public class Quadratic {
	public static String quadDescriber (double a, double b, double c) {
		
		String output = "";
		String equation = a+"x^2 + "+b+"x + "+c+"\n" ;
		String direction = "";
		if(a>0) {
			direction = "Opens: up";	
		}else {
			direction = "Opens: down";
		}
		double xvalue=-b/(2*a);
		String axisOfSymmetry = "Axis of symmetry: " + xvalue; 
		String xIntercept ="x intercept: "+ quadForm(a,b,c);
		double yvalue= a*xvalue*xvalue + b*xvalue + c;
		String vertex = "Vertex: ("+xvalue+","+ yvalue + ")";;
		String yIntercept = "y intercept: " + c;
		output += equation+"\n";
		output += direction+"\n";
		output += axisOfSymmetry+"\n";
		output += xIntercept+"\n";
		output += vertex+"\n";
		output += yIntercept+"\n";
		//output += yIntercept;
		return output;
	}
	public static double sqrt(double y) {
		if(y < 0) {
			throw new IllegalArgumentException("You can't sqrt a negative number, it isn't possible");
		}
			double value=1;
			
			while(!(absValue(y-square(value))<0.001)) {
				value = 0.5 * (y / value + value);
			}
			return round2(value);
		}
	public static double absValue(double a) {
		if(a<0) {
			return -a;
		}else {
			return a;
	}
}	
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
	public static double square(double number) {
		double answer;
		answer = number*number;
		return answer;
		// returns number*number;
	}
	public static double min(double a, double b) {
		if(a>b) {
			return b;
		}else {
			return a;
		}
	}
	public static double max(double a, double b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	public static String quadForm(double a, double b, double c) {
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
	public static double discriminant(double a,double b,double c) {
		return b*b-4*a*c;
	}
	
}

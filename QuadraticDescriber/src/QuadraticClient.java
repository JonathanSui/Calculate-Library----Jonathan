import java.util.*;

public class QuadraticClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Welcome to the Quadratic Describer");
		System.out.println("Provide values for coefficient a, b, and c");
		System.out.print("a: ");
		double a= sc.nextDouble();
		System.out.print("b: ");
		double b= sc.nextDouble();
		System.out.print("c: ");
		double c= sc.nextDouble();
		System.out.println("Description of the graph of: ");
		System.out.print(Quadratic.quadDescriber(a,b,c));
	}
}

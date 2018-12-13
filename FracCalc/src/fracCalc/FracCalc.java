package fracCalc;

import java.io.InputStream;
import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) 
    {
    	Scanner userInput= new Scanner(System.in);
    	System.out.println("Give me input");
    	String expression = userInput.nextLine();
    	System.out.print(produceAnswer(expression));
        // TODO: Read the input from the user and call produceAnswer with an equation

   	}

	// ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
    	String [] splitExpression = input.split("fraction1, fraction2");
    	String operator = splitExpression[2];
    	int [] operand1 = fraction1(splitExpression[0]);
    	int [] operand2 = fraction2(splitExpression[2]);
        return splitExpression[2];
    }
    public static int [] fraction1 (String operand) {
    	int fraction1 = (0,0,1);
    	return fraction1;
    }
    public static int [] fraction2 (String operand) {
    	int fraction2 = denominator()
    	return fraction2;
    }
    }
    // TODO: Fill in the space below with any helper methods that you think you will need
    

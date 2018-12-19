package fracCalc;

import java.io.InputStream;
import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) 
    {
    	Scanner userInput= new Scanner(System.in);
    	System.out.println("Give me input");
    	String expression = userInput.nextLine();
    	
    	while(!expression.equals("quit")) {
    		System.out.println(produceAnswer(expression));
    		System.out.println("Give me input");
        	expression = userInput.nextLine();
        	
    	}
    	
    	
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
    	String [] splitExpression = input.split(" ");
    	String operator = splitExpression[1];
    	int [] operand1 = fraction(splitExpression[0]);
    	int [] operand2 = fraction(splitExpression[2]);
    	int [] answer = calculator(operand1, operand2, operator);
    	return answer[0] +"_"+answer[1] +"/"+answer[2];
      //return "whole:" + operand2[0] + " numerator:" + operand2[1] + " denominator:" + operand2[2];
    }
    public static int [] fraction (String operand) {
    	int[] fraction = {0,0,1};
    	if(operand.contains("_")) {
    		String [] underscore = operand.split("_");
    		String [] slash = underscore[1].split("/");
    		fraction[0] = Integer.parseInt(underscore[0]);
    		fraction[1] = Integer.parseInt(slash[0]);
    		fraction[2] = Integer.parseInt(slash[1]);
    	}else {
    		if(operand.contains("/")) {
    			String [] slash = operand.split("/");
    			fraction[1] = Integer.parseInt(slash[0]);
    			fraction[2] = Integer.parseInt(slash[1]);
    		}else {
    			fraction[0] = Integer.parseInt(operand);
    		}
    	}
    	fraction [1] = fraction [0] * fraction [2] + fraction [1];
    	fraction [0] = 0;
    	return fraction;
    }
   public static int [] calculator (int [] fraction1, int [] fraction2, String operator) {
	   int [] calculator = {0,0,1};
	   if(operator.equals("+")) {
	   calculator [2] = fraction1 [2] * fraction2 [2];
	   calculator [1] = fraction1 [1] * fraction2 [2] + fraction2 [1] * fraction1 [2];
	   }else {
		   if(operator.equals("-")){
			  calculator [2] = fraction1 [2] * fraction2 [2];
			  calculator [1] = fraction1 [1] * fraction2 [2] - fraction2 [1] * fraction1 [2]; 
		   }
		   else {
			   if(operator.equals("*")) {
				   calculator [2] = fraction1 [2] * fraction2 [2];
				   calculator [1] = fraction1 [1] * fraction2 [1];
			   }
			   else {
				   if(operator.equals("/")) {
					   calculator [1] = fraction1 [1] * fraction2 [2];
					   calculator [2] = fraction1 [2] * fraction2 [1];
				   }
			   }
		   }
	   }
	return calculator;
	      
   }
}
    // TODO: Fill in the space below with any helper methods that you think you will need
    

package calculator;

import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		
		Computation computation = new Computation();
		while (true) {
		computation.getFirstNumbers();
		computation.getSecondtNumbers();
					
		switch (computation.getOperation()) {
			case "+":
				System.out.println("Result: " + computation.getSum());
				break;
			case "-":
				System.out.println("Result: " + computation.getSubtraction());
				break;
			case "/":
				System.out.println("Result: " + computation.getDivision());
				break;
			case "*":
				System.out.println("Result:" + computation.getMultiplication());
				break;
			default:
				System.out.println("Operation is not correct");
				break;			
		}
				
		switch (computation.getMemory()) {
			case "M+":
				computation.getMemorySum();
				break;
			case "M-":
				computation.getMemorySubtraction();
				break;
			case "MR":
				computation.getMemoryClear();
			case "Recall":
				computation.getMemoryRecall();
				break;
			case "Skip":
				break;
			default:
				System.out.println("Operation is not correct");
				break;	
			
		}
		
		if (computation.getExit().equals("Exit")) {
			break;
		}

		}
		
	}
}

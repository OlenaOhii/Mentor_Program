package calculator;

import java.util.Scanner;

public class Computation {
	private static double result;
	private static String operation = new String();
	private static String operationMemory = new String();
	private static double a;
	private static double b;
	private static Scanner in;
	private double memory;
	private static String  exit;
	public static double getFirstNumbers ( ) {
	in = new Scanner(System.in);
	System.out.println("Enter any first number");
	a = in.nextDouble();
	return a;
	}
	
	public static double getSecondtNumbers ( ) {
		in = new Scanner(System.in);
		System.out.println("Enter any second number");
		b = in.nextDouble();
		return b;
		}
	
	public static String getOperation () {
		in = new Scanner(System.in);
		System.out.println("Enter operation which you want to perfom.");
		System.out.println("+");
		System.out.println("-");
		System.out.println("/");
		System.out.println("*");
		operation = in.next();
		return operation;
	}
	
	public static String getExit () {
		in = new Scanner(System.in);
		System.out.println("Enter any symbol for continue or 'Exit' for finishing work");
		exit = in.next();
		return exit;
	}
	
	public static String getMemory () {
		in = new Scanner(System.in);
		System.out.println("Enter operation with memory which you want to perfom.");
		System.out.println("M+");
		System.out.println("M-");
		System.out.println("MR");
		System.out.println("Recall");
		System.out.println("Skip");
		operationMemory = in.next();
		return operationMemory;
	}
	
	public static double getSum() {
		result = a + b;
		return result;
	}
	
	public static double getSubtraction() {
		result = a - b;
		return result;
	}
	
	public static double getDivision () {
		result = a/b;
		return result;
	}
	
	public static double getMultiplication () {
		result = a*b;
		return result;
	}
	
	public void getMemorySum() {
		memory += result;
		
	}
	
	public void getMemorySubtraction() {
		memory -= result;
		
	}
	
	public void getMemoryClear() {
		memory = 0;
		
	}
	
	public void getMemoryRecall() {
		memory += 0;
		System.out.println(memory);
	}
}

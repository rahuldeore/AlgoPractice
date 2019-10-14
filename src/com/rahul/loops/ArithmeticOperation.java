/**
 *
 */
package com.rahul.loops;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author rahuldeore
 *
 */
public class ArithmeticOperation {
	
	static void add(int a, int b) {
		System.out.println(a+b);
		
	}
	void add() {
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		/*
		 * Scanner scanner = new Scanner(new InputStreamReader(System.in));
		 * System.out.print("Enter value for a: "); a =
		 * Integer.valueOf(scanner.nextLine());
		 * 
		 * System.out.print("Enter value for b: "); b =
		 * Integer.valueOf(scanner.nextLine());
		 */
		
		add(Integer.valueOf(args[0]), Integer.valueOf(args[1]));
		
	}

}

// Integer.valueOf(String)

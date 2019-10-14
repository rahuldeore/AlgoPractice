/**
 *
 */
package com.rahul.algos;

/**
 * @author rahuldeore
 *
 */
public class NumberExchange {

	void numExchangeUsingTemp(int a, int b) {
		System.out.println("a = "+a+" b = "+b);
		
		// Logic to exchange values
		int temp = a;
		a = b;
		b = temp;	
		
		System.out.println("a = "+a+" b = "+b);		
	}
	
	void numExchange(int a, int b) {
		System.out.println("a = "+a+" b = "+b);
		
		//Number exchange logic here
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a = "+a+" b = "+b);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		NumberExchange exchange = new NumberExchange();
		exchange.numExchangeUsingTemp(a, b);
		
		System.out.println("Value exchange without using third variable");
		exchange.numExchange(a, b);
	}

}

/**
 *
 */
package com.rahul.loops;

/**
 * @author rahuldeore
 *
 */
public class LoopsDemo {


	private void patternUsingFor() {
		
		/*
		 * This program prints the pattern *	*	*	*	*
		 * */
		
		for (int i=0; i<5; i++) {
			System.out.print("*\t");
		}
		
	}
	
	/*
	 * This program prints the below pattern
	 
	 * * * * 
	 * * * 
	 * * 
	 * 
	 * 
	 * * 
	 * * * 
	 * * * * 
	 
	 * */
	private void flagPatternUsingFor(int length) {
		
		System.out.println();		
		for (int i=length; i>0; i--) {
			for (int j=i-1; j>=0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i=length; i>0; i--) {
			for (int j=0; j<=length-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i=0; i<length; i++) {
			for (int j=length-i; j>0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=0; i<length; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void printArrow(int length) {
		
		for (int i=0; i<length; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i=0; i<length; i++) {
			for (int j=length-i; j>0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	/*
	 * This program prints the tree pattern of * separated by two tabs
	 *  			*				three tabs 
	 *  		*		*			two tabs
	 *  	*		*		*		one tab
	 *  *		*		*		*	0 tab
	 * 
	 * */
	private void treePatternUsingFor(int height) {
		
		int tab=height-1;
		for (int i=0; i<height; i++) {
			int tabInner = tab;
			for (int j=0; j<height; j++) {
				if (tabInner > 0) {
					System.out.print("\t");
					tabInner--;
				} else {
					System.out.print("*\t\t");
				}				
			}			
			tab--;
			System.out.println();
		}	
	}
	
	private int fiboSequenceRecursion(int index) {
		if (index == 0) {
			return 0;
		}
		if (index == 1 || index == 2) {
			return 1;
		}
		else {
			int fib = fiboSequenceRecursion(index - 2) + fiboSequenceRecursion(index - 1);
			return fib;
		}
	}
	
	private void printFiboSequence(int num) {
		
		int a=0, b=1;
		
		System.out.print("0 1 ");
		for (int i=0; i<num; i++) {
			b = a + b;
			a = b - a;
			System.out.print(b + " ");
		}
	}
	
	private int printFiboSequenceRecursion(int num) {
		if (num == 0) {
			return 0;
		}
		if (num == 1 || num == 2) {
			return 1;
		} else {
			return printFiboSequenceRecursion(num - 2) + printFiboSequenceRecursion(num - 1);
		}
	}
	
	private void pascalsTriangle(int height) {
	
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LoopsDemo demo = new LoopsDemo();
		
		
		
		/*
		 * System.out.println(); demo.patternUsingFor();
		 * 
		 * System.out.println();
		 * demo.flagPatternUsingFor((int)Integer.valueOf(args[0]));
		 */
		  
		
		System.out.println();
		demo.treePatternUsingFor((int)Integer.valueOf(args[0]));
		  
		/*
		 * System.out.println(); demo.pascalsTriangle((int)Integer.valueOf(args[0]));
		 * 
		 * System.out.println();
		 * System.out.println(demo.printFiboSequenceRecursion((int)Integer.valueOf(args[
		 * 0])));
		 * 
		 * System.out.println(); demo.printFiboSequence(10);
		 * 
		 * System.out.println(); demo.printArrow(10);
		 */
	}
}

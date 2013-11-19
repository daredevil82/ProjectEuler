/**
*	Author: Jason
*	Date : Nov 18, 2013
*	Description : 
*
*	Project Euler Problem 6
*	http://projecteuler.net/problem=6
*
*	Find the difference between the sum of the squares of individual numbers 
*	and the square of the sum of a set of numbers.
*/

package com.jason.euler.implementation;

import com.jason.euler.EulerInterface;

public class Euler6 implements EulerInterface {

	@Override
	public void eulerInit() {
		
		int 	limit = 100,
				sumSet = 0,
				sumSquare = 0,
				result = 0;
		
		long start = System.nanoTime();
		
		for (int i = 1; i <= limit; i++) {
			sumSet += i;
			sumSquare += (int)Math.pow(i, 2);
		}
		
		int sumSetSquare = (int)Math.pow(sumSet, 2);
		result = sumSetSquare - sumSquare;
		
		long elapsed = System.nanoTime() - start;
		
		System.out.println("Square of the set is: " + sumSetSquare + 
							"\nSum of individual squares: " + sumSquare + 
							"\nDifference: " + result + 
							"\nElapsed time : " + elapsed + " nanoseconds");	
	}

}


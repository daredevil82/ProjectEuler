/**
*	Author: Jason
*	Date : Nov 19, 2013
*	Description : 
*
*	Project Euler Problem 9
*	http://projecteuler.net/problem=9
*
*	A Pythagorean Triplet is a set of numbers a < b < c
*	where a^2 + b^2 = c^2.
*
*	Find the triplet for which a + b + c = 1000
*	Report the product of abc
*/

package com.jason.euler.implementation;

import com.jason.euler.EulerInterface;

public class Euler9 implements EulerInterface {

	@Override
	public void eulerInit() {
		int 	limit = 1000,
				a = 0,
				b = 0,
				c = 0;
		
		boolean found = false;
		
		long start = System.nanoTime();
		
		for (a = 1; a < limit / 3; a++) {
			for (b = a; b < limit / 2; b++) {
				c = limit - a - b;
				
				if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
					found = true;
					break;
				}
			}
			
			if (found)
				break;
		}
		int 	sum = a + b + c,
				product = a * b * c;
		
		long elapsed = (System.nanoTime() - start) / 1000000;
		System.out.printf("Triplets are: %d, %d and %d\nwhich sum to %d\nThe Product is %d\nElapsed Time is %d milliseconds"
							, a, b, c, sum, product, elapsed);
		
		
		
		
	}

}


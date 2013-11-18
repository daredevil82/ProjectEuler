/**
*	Author: Jason
*	Date : Nov 17, 2013
*	Description : 
*	
*	Project Euler problem  1
*	http://projecteuler.net/problem=1
*
*	Calculate the sum of all multiples of 3 or 5 for all numbers below 1000.
*	Basic alternative of the FizzBuzz problem.
*/

package com.jason.euler.implementation;

import com.jason.euler.EulerInterface;

public class Euler1 implements EulerInterface{

	public void eulerInit() {
		
		int 	limit = 1000,
				sum = 0;
		
		for (int i = 0; i < limit; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		
		System.out.println("Sum of multiples: " + sum);
		
	}

}


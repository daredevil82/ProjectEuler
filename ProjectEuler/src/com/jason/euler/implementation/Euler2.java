/**
*	Author: Jason
*	Date : Nov 17, 2013
*	Description : 
*
*	Project Euler Problem Two
*	http://projecteuler.net/problem=2
*
*	Find the sum of all even fibonacci numbers that are less than four million.
*	Uses memoization and five integer variables rather than recursion and data 
*	structures, resulting in a very low resource usage application
*
*	If code is run with a loop counter variable, expect the answer to show in
*	30 executions of the while loop.
*/

package com.jason.euler.implementation;

import com.jason.euler.EulerInterface;

public class Euler2 implements EulerInterface {

	@Override
	public void eulerInit() {
		
		//declare variables, need to prime fibSum to be 2 since that is the 
		//first even fibonacci number
		int 	limit = 4000000,
				termOne = 1,
				termTwo = 2,
				termThree = 0,
				fibSum = termTwo,
				loopCount = 0;
		
		while ((termThree = termOne + termTwo) < limit) {

			
			if (termThree % 2 == 0)
				fibSum += termThree;
			
			termOne = termTwo;
			termTwo = termThree;
			loopCount++;
		}
		
		System.out.println("Fibonacci sum of all even numbers < " + limit + ":\t" + fibSum + 
							"\n\nAll numbers were calculated in " + loopCount + " loops");
		
	}

}


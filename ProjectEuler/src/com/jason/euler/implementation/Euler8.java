/**
*	Author: Jason
*	Date : Nov 19, 2013
*	Description : 
*
*	Project Euler Problem 8
*	http://projecteuler.net/problem=8
*
*	Given the provided 1000 digit number, find the largest product
*	from any five-digit sequence inside said number.
*/

package com.jason.euler.implementation;

import com.jason.euler.EulerInterface;

import java.util.ArrayList;

public class Euler8 implements EulerInterface {

	@Override
	public void eulerInit() {
		
		long start = System.currentTimeMillis();
		
		//Create a String with the number values and convert to a Char array
		char[] num = new String("7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450").toCharArray();
		
		//initialize array list to hold all substring values in forward and reverse directions
		ArrayList<int[]> numListForward = new ArrayList<int[]>(996);
		ArrayList<int[]> numListReverse = new ArrayList<int[]>(996);
		
		int 	forwardMax = 0,
				reverseMax = 0;
		
		//break up string into chunks of 5 values starting from the beginning.
		//Means the last four numbers will not be used
		for (int i = 0; i < num.length - 4; i++) {
			int[] tempInt = new int[5];
			for (int j = 0; j < 5; j++) 
				tempInt[j] = Character.getNumericValue(num[i + j]);
			
			numListForward.add(tempInt);
		}
		
		//break up the string into chunks of 5 values starting from the end.
		//means the first four numbers will not be used.
		for (int i = num.length - 1; i > 4; i--) {
			int[] tempInt = new int[5];
			for (int j = 4; j >= 0; j--) 
				tempInt[j] = Character.getNumericValue(num[i - j]);
			
			numListReverse.add(tempInt);
		}
		
		//find the max value of all integer array products
		forwardMax = getMax(numListForward);
		reverseMax = getMax(numListReverse);
		
		long elapsed = System.currentTimeMillis() - start;
		
		System.out.println("Forward Max Value:\t" + forwardMax + "\nReverse Max Value:\t" + 
							reverseMax + "\nElapsed Time:\t" + elapsed + " milliseconds");
	}
	
	//Iterate over the provided ArrayList and find the largest product from the 
	//internal integer arrays.
	private int getMax(ArrayList<int[]> numList) {
		int 	max = 0,
				currentProduct;
		
		for (int[] nums : numList) {
			currentProduct = nums[0] * nums[1] * nums[2] * nums[3] * nums[4];
			if (currentProduct > max)
				max = currentProduct;
		}
		
		return max;
		
	}

}


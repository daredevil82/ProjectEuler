/**
*	Author: Jason
*	Date : Nov 17, 2013
*	Description : 
*
*	Project Euler controller class.  Since all solutions implement the EulerInterface,
*	calling the individual solution simply requires changing the class name inside
*	the main method
*/

package com.jason.euler;

import com.jason.euler.implementation.*;

public class EulerImplementation {

	public static void main(String[] args) {
		
		EulerInterface impl = new Euler4();
		impl.eulerInit();
		
	}

}


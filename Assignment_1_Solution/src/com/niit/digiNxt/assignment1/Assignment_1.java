package com.niit.digiNxt.assignment1;

import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {
	
		
		
		NumberOperations numberOperations= new NumberOperations();
		int number=numberOperations.inputNumber();
		int[] numberArray = numberOperations.getNumberInArray(number);
		numberOperations.display(numberArray);
		numberOperations.displayInAscendingOrder(numberArray);
		
		
		numberOperations.findSumofOddDigits(numberArray);
		numberOperations.findSumofEvenDigits(numberArray);

	}
	
}

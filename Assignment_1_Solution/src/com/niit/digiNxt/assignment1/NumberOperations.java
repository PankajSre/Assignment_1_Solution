package com.niit.digiNxt.assignment1;

import java.util.Scanner;

public class NumberOperations {

	public  int inputNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int number = scanner.nextInt();
		return number;
	}
	public int[] displayInAscendingOrder(int[] numberArray) {
		int length = numberArray.length;
		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				if (numberArray[i] > numberArray[j]) {
					int temp = numberArray[i];
					numberArray[i] = numberArray[j];
					numberArray[j] = temp;
				}
			}
		}
		
		return numberArray;
	}

	public void display(int[] numberArray) {
		int length = numberArray.length;

		for (int i = length - 1; i >= 0; i--) {
			System.out.print(numberArray[i] + "   ");
		}
		System.out.println("");

	}

	public int[] getNumberInArray(int number) {
		int reverseArray[] = new int[5];
		int temp;
		int i = 0;
		while (number > 0) {
			temp = number % 10;
			number = number / 10;
			reverseArray[i] = temp;
			i++;
		}
		return reverseArray;
	}
	public int findSumofOddDigits(int[] numberArray) {
		int oddSum=0;
		int length=numberArray.length;
		for(int i=0;i<length;i++)
		{
			if(numberArray[i]%2 !=0)
			{
				oddSum=oddSum+numberArray[i];
			}
		}
		
		return oddSum;
	}
	public int findSumofEvenDigits(int[] numberArray) {
		int evenDigitSum=0;
		int length=numberArray.length;
		for(int i=0;i<length;i++)
		{
			if(numberArray[i]%2 == 0)
			{
				evenDigitSum=evenDigitSum+numberArray[i];
			}
		}
		
		return evenDigitSum;
	}


}

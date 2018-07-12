package com.stm;

import java.util.Scanner;

public class Paindrome {

	public static void main(String[] args) {
		String Original,Reverse="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String/number to check if it is palindrome");
		Original=in.nextLine();
		int length=Original.length();
		for(int i =length-1;i>=0;i--)
		{
			Reverse=Reverse+Original.charAt(i);

		}
		if(Original.equals(Reverse)) {
			System.out.println("Entered String/number is palindrome");

		}
		else {
			System.out.println("Enterd String/number is not palindrome");
		}



	}

}

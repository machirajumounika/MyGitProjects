package com.stm;

public class Largestno {

	public static void main(String[] args) {
	int[] arr= {10,20,30,50,60};
	int val=arr[4];
	for (int i=0;i<arr.length;i++) {
		if(arr[i]>val)
			val=arr[i];	
	}
	System.out.println("The largest no in the given array is "+val);
}
}


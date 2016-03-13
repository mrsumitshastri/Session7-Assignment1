package com.Session7.Assignment1;

public class MainClass {

	/*
	 * Handle ArrayIndexOutOfBounds Exception. For example if array is having only 5 elements and
	 * we are trying to display 7th element then it should throw exception.
	 */
	public static void main(String[] args) {
		int[] arr =  {1,2,3,4,5};
		
		for(int i= 0; i <= arr.length; i++)
		{
			try {
				System.out.println("Array item no("+(i+1)+") is : "+ arr[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("This Array has maxium "+arr.length+" items. So you cannot get deta form "+(i+1)+"th index");
			}
		}
	}
}

package com.Session7.Assignment1;

public class MainClass {

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

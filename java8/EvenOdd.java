package com.java8;

public class EvenOdd {

	
	 public static void EvenOdd(int arr[], int arr_size)
	    {
	        int even_count = 0;
	        int odd_count = 0;
	 
	        for (int i = 0; i < arr_size; i++) {
	             
	              
	            if ((arr[i] & 1) == 1)
	                odd_count++;
	            else
	                even_count++;
	        }
	 
	        System.out.println("Even Element ="  + "  " + even_count +"   "
	                           + " Odd elements = " + odd_count);
	    }
	 
}

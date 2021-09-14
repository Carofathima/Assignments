package week1day1;

import java.util.Arrays;

public class ArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr1[] = {3,2,11,4,6,7};
       int arr2[] = {1,2,8,4,9,7};
       int newarr[] = new int[6];
       
       for(int i=0; i<arr1.length; i++)
       {
    	   for(int j=0; j<arr2.length;j++)
    	   {
    		   int a = arr1[i];
    		   int b =arr2[j];
    		   if (a == b)
    		   {
    			   
    			   newarr[j]  = a;
    			   			    			   
    		   }
    		   			   
    	   }
    	  
       }
       System.out.println("Initial Array:\n"+ Arrays.toString(newarr));
	}

}

package week1day1;
import java.util.Arrays;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String str = "We learn java basics as part of java sessions in java week1";
	        String[] new1 = new String[12];
			int count =0;
			
			String[] arr = str.split(" ");
			
			
			  for(int i=0; i<arr.length; i++)
		       {
				 
				  
				for(int j=0;j<arr.length;j++)
				  {		
					
					boolean result = arr[i].equals(arr[j]);
					
					if((i!=j)&&(result == true))
					{
					  count++;
					 
					}
					
					  
				  }
				if(count>=1)
				{
					 arr[i]= " ";
				}
				  
				count=0;
		    	  	    	  
		       }
			  System.out.println("Initial Array:\n"+ Arrays.toString(arr));
		}

	}

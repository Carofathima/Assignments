package week1day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a software tester";
		String[] arr = test.split(" ");
		String rev ="";
		String evenwords1 = " ";
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				
				
				 evenwords1 = arr[i].toString();
					
					System.out.print(" " +evenwords1);
				
				
				
			}
			else
			{
				String evenwords = arr[i].toString();
				int j =evenwords.length();
				
				for(  j= evenwords.length()-1;j>=0;j--)
				{
					 rev = rev + evenwords.charAt(j);
					 
				}
				
			}
			
			System.out.print(rev);	
			rev = " ";
			
		}		
		
	}

}

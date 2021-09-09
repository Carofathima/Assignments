package weekDay1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number= 13;
		boolean flag = false;
		int m =0;
		
		for (int i = 2; i < number/2; i++) 
		{
			m = number % i;
			
			if (m==0)
			{
				flag = true;
				break;
			}
			
			
		}
		if(!flag)
			System.out.println(number + " is a Prime Number.");
		else
			System.out.println(number + " is not a Prime Number.");
	

	}

}

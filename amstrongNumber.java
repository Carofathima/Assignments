package weekDay1;

public class amstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int number = 153;
    int original , calculated = 0 ,remainder = 0;
    
    original = number;
     while (original!= 0) {
    	 
    	 remainder = original % 10 ;
    	 System.out.println(remainder);
    	 calculated += Math.pow(remainder,3);
    	 System.out.println(calculated);
    	 original /= 10;
    	 System.out.println(original);
    	 
    	 
     }
     
     if(calculated == number)
     {
    	 System.out.println(number + " is an Armstrong number ");
     }
     else
     {
    	 System.out.println(number + " is not an Armstrong number ");
     }
    
	}

}

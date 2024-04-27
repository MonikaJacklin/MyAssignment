package week1.day1;

public class IsPrimeNumber {
	
	public static void main(String[] args) {
		
		int n = 11 ;
		// int i = 2;
		
		for( int i = 2 ; i <= n-1; i++) {
			
			System.out.println(n); 
						
			if (n%i == 0 ){
				
				System.out.println("The given number is not prime Number");
				break;
				
			}
			
			else 
				System.out.println("The given number is prime Number");
			
			}
		
		}
}
	



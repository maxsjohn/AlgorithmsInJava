package hackerrank;

import java.util.Scanner;

public class PrimeValidator {

	
	
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int N = scan.nextInt();
    	
    	for(int i=0; i<N ;i++){
    		
    		int num = scan.nextInt();
    		
    		long now = System.nanoTime();
    		isBruteForcePrimeNumber(num);    		
    		long then = System.nanoTime();
    		long oldAlgo = then-now;

    	
    		 now = System.nanoTime();
    		isPrime(num);    		
    		 then = System.nanoTime();
    		 
     		long newAlgo = then-now;
    		System.out.println(((float)oldAlgo/(float)newAlgo)+"X Faster ");   		
    		System.out.println();    		
    		
    	}
    }

	private static boolean isBruteForcePrimeNumber(int num) {
		// TODO Auto-generated method stub
		
		if(num==1)
			return false;
		
		if(num == 2)
			return true;
		
        int limit = (int)Math.ceil(num/2);
		for(int i=2 ; i<= limit;i++){
			if(num%i == 0){
				return false;		
			}

		}
		return true;
	}
	
    public static boolean isPrime(int n){
        // check lower boundaries on primality
        if( n == 2 ){ 
            return true;
        } // 1 is not prime, even numbers > 2 are not prime
        else if( n == 1 || (n & 1) == 0){
            return false;
        }

        // Check for primality using odd numbers from 3 to sqrt(n)
        for(int i = 3; i <= Math.sqrt(n); i += 2){
            // n is not prime if it is evenly divisible by some 'i' in this range
            if( n % i == 0 ){ 
                return false;
            }
        }
        // n is prime
        return true;
    }
	
	
}

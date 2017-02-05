package hackerearcth.sauba;

import java.math.BigInteger;
import java.util.Scanner;

import hackerearcth.sauba.lexiSort.QuickSort;

public class prodDevisors {
	
	
	
	
	public static int divisors(long myNum) {
		long limit = myNum;
	    int divisorCount = 0;
	    if (myNum == 1) 
	        return 1;
	    for (int i = 1; i < limit; ++i) {
	        if (myNum % i == 0) {
	            limit = myNum / i;
	            if (limit != i)
	                divisorCount++;
	            divisorCount++;
	        }
	    }
	    return divisorCount;
	}
	
	public static void main(String[] args){


		Scanner scan = new Scanner(System.in);

		int arraySize = scan.nextInt();
		int Queries = scan.nextInt();		

		int [] input =  new int[arraySize];
		
		for(int i=0 ; i< input.length ;i++)
		{
			input[i] = scan.nextInt();
		}

		for(int i=0 ; i< Queries ;i++)
		{
			int l = scan.nextInt();
			int r = scan.nextInt();
			long  product = productLeftToRight(input,l,r); 
			System.out.println(divisors(product));
		}
		
		
	}

	private static long  productLeftToRight(int[] input, int l, int r) {
		// TODO Auto-generated method stub
		if(l == r)
			return input[l];
		
		if(l>r)
			return 0;
		
		long prod = 1;
		
		int i_l = l-1;
		int i_r = r-1;		
		
		for(int i=i_l ;i<=i_r;i++)
			prod = (long)(prod * input[i]); 
		
		return prod;
		
	}	

}

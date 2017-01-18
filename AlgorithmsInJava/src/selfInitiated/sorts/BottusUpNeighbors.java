package selfInitiated.sorts;

public class BottusUpNeighbors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] a = {0,1,2,3,4,5,6,7,8,9,10};
		
		bottumsUpTheArray(a);

	}
	
	private static void bottumsUpTheArray(Integer[] a) {
		
		int N = a.length  ;
		//Need to fix the case when there are Odd number of Array entries
		for(int i=1 ; i< N;i= i+i){
			for(int lo=0 ; lo < N-i; lo+=i+i){
				int Max = Math.min(lo+i+i-1, N-1);
				for(int index=lo;index <=Max;index++){
					System.out.print("a["+index+"] "); 				
				}
				
				System.out.println();
			
			}
			
			
		}
		 
		
	}

}

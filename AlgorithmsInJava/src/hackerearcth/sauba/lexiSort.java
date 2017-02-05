package hackerearcth.sauba;

import java.util.Scanner;

import sedgewick.Sorter;

public class lexiSort {
	
	
	public static class QuickSort {
		
		public static void sort(String[] a ){
			
//			java.util.Collections.shuffle(a);	
			quickSort(a ,0 , a.length-1);
		}

		
		
		protected static void exch(String[] a, int i, int j) {
			// TODO Auto-generated method stub
			
			String temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			
		}

		protected static boolean less(String a, String b) {
			// TODO Auto-generated method stub
			char[] first  = a.toCharArray();
			char[] second = b.toCharArray();
			
			char[] firstTemp  = a.toLowerCase().toCharArray();
			char[] secondTemp = b.toLowerCase().toCharArray();		

			for(int i = 0; i < first.length &&  i < second.length ; i++)
			{		
					
				
			        if (first[i] != second[i])
			        {
			        	if(first[i] == ' ')
			        		return true;
			        
			        	if(second[i] == ' ')
			        		return false;			        	
 	
			        	if( firstTemp[i] ==  secondTemp[i])
			        	{    
				        	if(((int)('z') - (int)(first[i])) > ((int)('z') -(int)(second[i])))
				        		return false;
				        	else if(((int)('z') - (int)(first[i])) < ((int)('z') -(int)(second[i])))
				        		return true;
				        	else
				        		continue;
			        	}
			        	
			        	else if((firstTemp[i] < secondTemp[i]))
			        		return true;
			        	else if((firstTemp[i] > secondTemp[i]))
			        		return false;
			        		

			        	
			        }
		
			        
			        
			}
			
			if(first.length <= second.length )		
			return true;
			else
				return false;
		}
		
		
		private static void quickSort(String[] a ,int low , int high) {
		
			if(high <= low){
				return;
			}

			int p = partition(a,low, high);

	
			quickSort(a, low, p-1);

			quickSort(a, p+1, high);		

		}

		private static int partition(String[] a, int low, int high) {
			
			
			@SuppressWarnings("rawtypes")
			String aux = a[low];
			
			int i = low;
			int j= high+1;
			
			while(true){
				
				while(less(a[++i],aux))
					if(i == high) break;
				
				while(less(aux , a[--j]))
					if(j == low) break;			
				
				if(i >= j)
					break;	
				
				//j is the prominence for the exchange because its last verified against the aux in the loop
				exch(a,i,j);
			}
			
			exch(a,low,j);	
			return j;
		}
	}
	
	
	public static void main(String[] args){


		Scanner scan = new Scanner(System.in);

		int testCase = Integer.parseInt(scan.nextLine());
		String[][] inputStr = new String[testCase][];

		for (int i = 0; i < testCase; i++) {
			int N = Integer.parseInt(scan.nextLine());
			inputStr[i] = new String[N];
			for (int j = 0; j < inputStr[i].length; j++) {
				inputStr[i][j] = scan.nextLine();
			}
		}

		for (int i = 0; i < inputStr.length; i++) {
			
			QuickSort.sort(inputStr[i]);
			
		}		
		
		for (int i = 0; i < inputStr.length; i++) {
		
			Display(inputStr[i]);
			
		}
		
	
	}


	private static void Display(String[] strings) {
		// TODO Auto-generated method stub
		for(int i= 0 ; i < strings.length ;i++){
			System.out.println(strings[i]);
		}
	}

}

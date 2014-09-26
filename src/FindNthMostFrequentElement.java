import java.io.*;
public class FindNthMostFrequentElement {
	int array[];
	int count = 0;
	public void start_quicksort(int x[]){
		array= x;
		quicksort(0, x.length-1, 0);
		
	}
	
	public void quicksort(int left, int right, int n){
		
		for(int value:array){
			System.out.print(value);
		}
		
		System.out.println("Quick"+left+""+right);
		if(left<0 || right > array.length || right<left){
			return;
		}
		System.out.println();
		System.out.println(left+""+ right+" "+ n);

	
		int pivot = partition(left, right, n);
		quicksort(left, pivot-1, n);
		quicksort(pivot+1, right, n);
		
		}
		
	
	public int partition(int left, int right, int n){
		
		for(int value:array){
			System.out.print(value);
		}
		System.out.println();
		System.out.println("partition"+array+" "+ left+" "+ right);
		int pivot_element = array[right];
		int store_value=left-1;
		for(int index = left; index<right; index++){
			
			if (array[index]<pivot_element){
			store_value++;
			System.out.println("Exchanging "+array[store_value]+"with "+array[index]);
			int temp = array[store_value];
			array[store_value]=array[index];
			array[index]=temp;
			}
				
		}
		store_value++;
		int temp = array[store_value];
		array[store_value]=array[right];
		array[right]=temp;
		
		System.out.println("Returning Store value"+ store_value);
		for(int value:array){
			System.out.print(value);
		}
		return store_value;

	}
	
}

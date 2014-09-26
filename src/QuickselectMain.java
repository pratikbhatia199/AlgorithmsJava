import java.io.*;
public class QuickselectMain {

	public static void main(String args[])throws IOException{
		int x[] = {5,1,3,2,4};
		
		FindNthMostFrequentElement fq_obj = new FindNthMostFrequentElement();
		fq_obj.start_quicksort(x);
		for(int value:fq_obj.array){
			System.out.println(value);
		}
		
	}
}

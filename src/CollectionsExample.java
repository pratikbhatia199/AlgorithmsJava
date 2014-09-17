import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
public class CollectionsExample {
	public static void main(String args[])throws IOException{
		int x[]={1, 3, 4, 5, 6, 7};
		ArrayList<Integer> arr_list = new ArrayList<Integer>();
		for(int value:x){
			arr_list.add(value);
		}
		for (int arr_list_value: arr_list){
			System.out.println(arr_list_value);
		}
		arr_list.remove(4);
		Iterator it = arr_list.iterator();		
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}

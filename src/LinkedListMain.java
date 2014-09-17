import java.io.*;
public class LinkedListMain {
	public static void main(String args[]) throws IOException{
		int inserts[] = {1,2,3,5,6,7};
		LinkedList ll = new LinkedList();
			for(int value: inserts){
				Node n = new Node(value);
				ll.insert_last(n);
				ll.display_list();
		}
			
	}

}

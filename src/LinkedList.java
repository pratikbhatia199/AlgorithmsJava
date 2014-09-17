
public class LinkedList {
	Node first;
	Node last;
	
	public void insert_last(Node n){
		if (first==null){
			first = n;
			last = n ;
			return;
		}
		Node previous =first;
		Node current = first;
		if (first == last){
			first.next = n;
			last=n;
			return;
		}
		else{
			last.next = n;
			last=last.next;
		}		
	}
	public void display_list(){
		if (first==null){
			System.out.println("Empty list");
			
		}
		else{
			Node current=first;
			while(current!=null){
				System.out.println(current.data);
				current=current.next;
			}
		}
	}
	
}

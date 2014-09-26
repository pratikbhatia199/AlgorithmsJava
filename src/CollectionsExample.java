import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionsExample {
	public static void main(String args[])throws IOException{
		int x[]={1, 3, 4, 5, 6, 7};
		System.out.println("ArrayList:");
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
		System.out.println("Reverse Sorting");
		Collections.sort(arr_list, Collections.reverseOrder());
		Iterator rit = arr_list.iterator();
		while(rit.hasNext()){
			System.out.println(rit.next());
		}
		System.out.println("HashMap");
		HashMap<Integer, ArrayList<Integer>> hm = new HashMap <Integer,ArrayList<Integer>>();
		for (int key:x){
			hm.put(key, arr_list);			
		}
		
		Set key_set = hm.keySet();
		Iterator sit = key_set.iterator();
		int total_sum = 0;
		while(sit.hasNext()){
			int value = (int)sit.next();
			System.out.println(value);
			total_sum = total_sum + value;
			System.out.println("Total sum:"+total_sum);	
			System.out.println(hm.get(value));
		}
		
		for(Map.Entry<Integer, ArrayList<Integer>> entry : hm.entrySet()){
			Integer key = entry.getKey();
			ArrayList<Integer> value = entry.getValue();
			System.out.println("Key: "+key+" Value: "+value);			
		}
		System.out.println("TreeMap");
		TreeMap<Integer, ArrayList<Integer>> tm = new TreeMap<Integer, ArrayList<Integer>>(Collections.reverseOrder());
		for(int value: arr_list){
			tm.put(value, arr_list);
		}
		for(Map.Entry<Integer, ArrayList<Integer>> entry:tm.entrySet()){
			int key = entry.getKey();
			ArrayList<Integer> val_arr_list = entry.getValue();
			System.out.println("Key: "+key+" value: "+val_arr_list);			
		}
		System.out.println("LinkedList");
		LinkedList<Integer> linked_list_queue = new LinkedList();
		for(int value: arr_list){
			linked_list_queue.addLast(value);
		}
		System.out.println(linked_list_queue);
		Iterator lit = linked_list_queue.iterator();
		while(lit.hasNext()){
			System.out.println(lit.next());
		}
		System.out.println("Stack");
		Stack<Integer> s = new Stack<Integer>();		
		for(int value: arr_list){
			s.push(value);
		}
		System.out.println(s);
		System.out.println("HashSet");
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.addAll(arr_list);
		Iterator hsit = hs.iterator();
		while(hsit.hasNext()){
			System.out.println(hsit.next());
		}
		System.out.println("PriorityQueue");
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(10, Collections.reverseOrder());
		for(int value: arr_list){
			pq.offer(value);
		}
		while(!pq.isEmpty()){
			System.out.println(pq.poll());
		}
	}

}

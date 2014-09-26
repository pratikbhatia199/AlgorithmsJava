//a=1, b=2, c=3, d=4, e=5, f=6, g=7, h=8, i=9
//{1:[2,3],2:[6],3:[5,6],4:[3],5:[8,9],6:[7,8],7[2],8:[5],9:[8]}
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class BFS {
	private LinkedList<Integer> queue = new LinkedList<Integer>();
	private HashMap <Integer, int[]> hm_graph;
	private HashSet<Integer> visited = new HashSet<Integer>();
	private HashSet<Integer> visiting = new HashSet<Integer>();
	public void intialize(){
	hm_graph = new HashMap<Integer, int[]>();
	int edges_1[] = {2,3};
	int edges_2[] = {6};
	int edges_3[] = {5,6};
	int edges_4[] = {3,10,11};
	int edges_5[] = {8,9};
	int edges_6[] = {7,8};
	int edges_7[] = {2};
	int edges_8[] = {5};
	int edges_9[] = {8};
	int edges_10[] = {11};
	int edges_11[] = {};
	
	hm_graph.put(1, edges_1);
	hm_graph.put(2, edges_2);
	hm_graph.put(3, edges_3);
	hm_graph.put(4, edges_4);
	hm_graph.put(5, edges_5);
	hm_graph.put(6, edges_6);
	hm_graph.put(7, edges_7);
	hm_graph.put(8, edges_8);
	hm_graph.put(9, edges_9);
	hm_graph.put(10, edges_10);
	hm_graph.put(11, edges_11);
	queue.add(1);
	}
	public void bfs(){
		while(!queue.isEmpty()){
			System.out.println(hm_graph.keySet());
			int element = queue.removeFirst();
			System.out.println(element);
			System.out.println("Element: "+element);
			visited.add(element);
			for(int value:hm_graph.get(element)){
				if(!visited.contains(value)){
					if(!visiting.contains(value)){
						queue.addLast(value);
						visiting.add(value);			
					
					}
				}					
			}
			bfs();		
		}
		if(queue.isEmpty()){
			ArrayList<Integer> not_connected_keys = new ArrayList<Integer>();
			for(int value:hm_graph.keySet()){
				if(!visited.contains(value)){
				not_connected_keys.add(value);
				break;
				}
			}
			if (not_connected_keys.size()>0){
				queue.addLast(not_connected_keys.get(0));	
				bfs();
			}		
		}
	}
}
	

	


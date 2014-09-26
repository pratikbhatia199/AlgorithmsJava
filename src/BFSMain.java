import java.io.*;
//a=1, b=2, c=3, d=4, e=5, f=6, g=7, h=8, i=9
//{1:[2,3],2:[6],3:[5,6],4:[3],5:[8,9],6:[7,8],7[2],8:[5],9:[8]}
public class BFSMain {
	public static void main(String args[])throws IOException{
		System.out.println("Creating the Graph");
		BFS obj_bfs = new BFS();
		obj_bfs.intialize();
		obj_bfs.bfs();
		
		
	}
}

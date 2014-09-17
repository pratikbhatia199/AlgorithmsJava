import java.io.*;
public class TreeMain {
	public static void main(String args[])throws IOException{
		int inserts[] = {5,3,7,2,1,8,9};
		Tree tree = new Tree();
		for(int value:inserts){
			TreeNode n = new TreeNode(value);
			tree.insert(n);
		}
		TreeNode root = tree.get_root();
		tree.inorder(root);		
	}
}

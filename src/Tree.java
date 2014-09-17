import java.io.*;
public class Tree {

	TreeNode root;
	public TreeNode get_root(){
		return root;
	}
	
	public void inorder(TreeNode n){
		if (n==null){
			return;
		}
		this.inorder(n.left);
		System.out.println(n.data);
		this.inorder(n.right);
		
	}
	public void insert(TreeNode n){
		System.out.println("inserting "+n);
		if(root==null){
			System.out.println("Inserted Root");
			root=n;
			return;
		}
		TreeNode current_node=root;
		TreeNode parent_node=root;
		while(current_node!=null){
			System.out.println("Current: "+current_node.data);
			System.out.println("Parent: "+parent_node.data);
			if ( n.data < current_node.data){
				parent_node=current_node;
				current_node=current_node.left;
				System.out.println("Parent: "+parent_node.data);
				System.out.println("In left of the above parent");
			}
			else{
				parent_node=current_node;
				current_node=current_node.right;
				System.out.println("Parent: "+parent_node.data);
				System.out.println("In right of above parent");
			}
		}
	
		if(n.data < parent_node.data){
			parent_node.left=n;
			System.out.println("left"+n.data);
			System.out.println("Parent:"+ parent_node.data);
		}
		else{
			parent_node.right=n;
			System.out.println("right"+n.data);
			System.out.println("Parent:"+ parent_node.data);
		}
		//this.inorder(root);
	}

}

package dataStructure;


//in Order binary tree 
//formula is first go to left node the root node then right node of that rootnode then go to 

public class tree {

	
public static class Treenode{
	
	int data;
	Treenode right;
	Treenode left;
	Treenode(int data){
		this.data=data;
	}
}
	
	
	


	public static Treenode  createBinaryTree() {
		
		Treenode rootNode= new Treenode(40) ;
		Treenode node20= new Treenode(20) ;
		Treenode node10= new Treenode(10) ;
		Treenode node30= new Treenode(30) ;
		Treenode node60= new Treenode(60) ;
		Treenode node50= new Treenode(50) ;
		
		Treenode node70= new Treenode(70) ;
		
	
		
		rootNode.left=node20;
		rootNode.right=node60;
		
		node20.left=node10;
		node20.right=node30;
		
		node60=node50;
		node60=node70;
		
		
		
		return rootNode;
			}
	


   public void inOrderTraverseRecursive(Treenode root) {
	   
	   
	   if (root!=null) {
		   
		
		   
	     }
   }

		
	
	
	
	public static void main(String[] args) {
		
		tree t=new tree();
		Treenode node=createBinaryTree();
		
		t.inOrderTraverseRecursive(node);
		
	}

}

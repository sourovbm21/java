package dataStructure;

import dataStructure.tree.Treenode;

public class BTPreOrderEx {

	
	
	public static class TreeNode{
		
		int data;
		TreeNode left ;
		TreeNode right ;
		
		TreeNode(int data){
			
			this.data=data;
			
		}
	}
	
	
	public static Treenode createBinaryTree() {
		

		Treenode rootNode= new Treenode(100) ;
		Treenode node80= new Treenode(80) ;
		Treenode node70= new Treenode(70) ;
		Treenode node60= new Treenode(60) ;
		
		Treenode node50= new Treenode(50) ;
		Treenode node40= new Treenode(40) ;
		Treenode node30= new Treenode(30) ;
		Treenode node20= new Treenode(20) ;
		Treenode node10= new Treenode(10) ;
		
		rootNode.left=node80;
		rootNode.right=node70;
		
		node80.left=node60;
		node80.right=node50;
		
		node70=node40;
		node70=node30;
		
		node60.left=node20;
		node60.right=node10;
		
		
		return rootNode;
		
		
	
		
	}
	
	//pre order recursive solution
	 public void preOrderTraverse(Treenode rootNode) {
		 
		 
		 if (rootNode !=null) {
			 
			 System.out.println(rootNode.data);
			 preOrderTraverse(rootNode.left);
			 preOrderTraverse(rootNode.right);
			 
			 
		 }
	 }
	
	 public static void main(String[]args) {
		 
		 BTPreOrderEx bt=new BTPreOrderEx();
		 
		Treenode rootNode= createBinaryTree();
		bt.preOrderTraverse(rootNode);
		 
	 }
	
}

package s30precourse1exercises;

import java.util.Arrays;
import java.util.HashMap;


public class BSTConstruction {
	
	int rootValue;
	

	public TreeNode constructTree(int[] preOrder, int[] inOrder) {
		
		//null check
		if (preOrder.length == 0 || inOrder.length == 0) {
			return null;
		}
		//find the root in Order using pre-order
		rootValue= preOrder[0];
		
		HashMap<Integer, Integer> inOrderMap = new HashMap<Integer,Integer>();
		
		for (int i=0; i<inOrder.length; i++) {
			inOrderMap.put(inOrder[i], i);
		}
		TreeNode rootNode = new TreeNode(rootValue);
		int rootIndex = inOrderMap.get(rootValue);
		int[] inOrderLeft = Arrays.copyOfRange(inOrder, 0, rootIndex);
		int[] inOrderRight = Arrays.copyOfRange(inOrder,rootIndex+1, inOrder.length);
		int[] preOrderLeft = Arrays.copyOfRange(preOrder, 1, inOrderLeft.length+1);
		int[] preOrderRight = Arrays.copyOfRange(preOrder,inOrderLeft.length+1, preOrder.length);
		
		System.out.println(rootNode.value);
		rootNode.left = constructTree(preOrderLeft, inOrderLeft);
		rootNode.right = constructTree(preOrderRight, inOrderRight);
		
		
	
		return rootNode;
		
		
	} 
	
	public static void main(String[] args) 
    { 
		//declare a pre-order array
		int[] preOrder = {3,9,20,15,7};
		//declare a in-order array
		int[] inOrder = {9,3,15,20,7};
		BSTConstruction bst = new BSTConstruction(); 
		bst.constructTree(preOrder, inOrder);
		
    } 



	

}

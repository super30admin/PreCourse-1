import java.util.LinkedList;

import java.util.Queue;
public class GFG {

    /* A binary tree node has key, pointer to
    left child and a pointer to right child */
    static class Node {
        int key;
        Node left, right;

        // constructor
        Node(int key){
            this.key = key;
            left = null;
            right = null;
        }
    }
    static Node root;
    static Node temp = root;

    /* Inorder traversal of a binary tree*/
    static void inorder(Node temp)
    {
        if (temp == null)
            return;

        inorder(temp.left);
        System.out.print(temp.key+" ");
        inorder(temp.right);
    }

    /*function to insert element in binary tree */
    static void insert(Node temp, int key)
    {
    	Node n1 = new Node(key);
    	if(root==null)
    	{

    		root=n1;
    		return;

    	}

    	Queue<Node> qn = new LinkedList<Node>();
    	qn.add(temp);
    	Node temp1;
    	while(true)
    	{
    		temp1=qn.remove();

	    	if(temp1.left==null)
	    	{
	    		temp1.left=n1;
	    		return;
	    	}
	    	if(temp1.right==null)
	    	{
	    		temp1.right=n1;
	    		return;
	    	}

	    	qn.add(temp1.left);
	    	qn.add(temp1.right);


    	}

    	/*
    	Node n1 = new Node(key);
    	Node temp1;
    	temp1=temp;
    	if(temp==null)
    	{
    		root=n1;
    		return;
    	}


    	while(true)
    	{
    		if(temp1.left==null)
    		{
    			temp1.left=n1;
    		}
    		if(temp1.right==null)
    		{
    			temp1.right=n1;
    		}


    	}

    	while(true)
    	{
    		if(temp1.key>key) {
    			if(temp1.left!=null)
    			{
    				temp1=temp1.left;
    			}
    			else {
    				temp1.left=n1;
    				break;
    			}
    		}
    		else {

    			if(temp1.right!=null)
    			{
    				temp1=temp1.right;
    			}
    			else {
    				temp1.right=n1;
    				break;
    			}

}

    		}
*/


        // Do level order traversal until we find
        // an empty place and add the node.
    }



     Node cehckNull(Node t1)
    {
    	 if(t1.left==null)
    	 {

    	 }

		return t1;

    }
    // Driver code
    public static void main(String args[])
    {
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.print( "Inorder traversal before insertion:");
        inorder(root);

        int key = 12;
        insert(root, key);

        System.out.print("\nInorder traversal after insertion:");
        inorder(root);
    }
}
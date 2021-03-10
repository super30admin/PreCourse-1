// Time Complexity : O(N) where N is the number of nodes in the binary tree
// Space Complexity : O(N) where N is the number of nodes in the binary tree
// Did this code successfully run on Leetcode : Not there on Leetcode
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


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
    // If binary tree is empty, current node is the root node else There is a BFS level order traversal to find a ode with a null left or right child. And at that position the Node is inserted
    /*function to insert element in binary tree */
    static void insert(Node temp, int key)
    {
        if(temp == null){
            root = new Node(key);
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(temp);
        while(!queue.isEmpty()){
            Node ele = queue.poll();
            if(ele.left == null) {
                ele.left = new Node(key);
                return;
            }else{
                queue.add(ele.left);
            }
            if(ele.right == null) {
                ele.right = new Node(key);
                return;
            }else{
                queue.add(ele.right);
            }
        }

        // Do level order traversal until we find
        // an empty place and add the node.
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

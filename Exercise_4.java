/* Time Complexity : The overal time complexity is O(n).
Inorder traversal takes O(n) time as all the nodes are processed. The level order traversal also takes O(n) time as all the nodes are visited.
Hence, O(n)+O(n) = 2O(n) ~ O(n)
 Space Complexity : As queue is used to process and store the  all the nodes in the worst case, the space complexity is O(n)
 */
// Did this code successfully run on Leetcode : Ran in an IDE successfully
// Any problem you faced while coding this : I ahd a problem with the level order traversal.
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

    /*function to insert element in binary tree */
    static void insert(Node temp, int key)
    {
        Node new_node = new Node(key);
        if(temp == null){
            root = new_node;
            return;
        }
        // Do level order traversal until we find
        // an empty place and add the node.
        Queue<Node> que = new LinkedList<Node>();
        que.offer(temp);
        while(!que.isEmpty()){
            temp = que.peek();
            que.remove();
            if(temp.left!=null){
                que.offer(temp.left);
            }
            else{
                temp.left = new_node;
                return;
            }
            if(temp.right!=null){
                que.offer(temp.right);
            }
            else{
                temp.right = new_node;
                return;
            }
        }
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

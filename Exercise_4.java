import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class GFG {

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
        Node inserted = new Node(key);
        // Do level order traversal until we find
        // an empty place and add the node.
        if(temp == null){
            inorder(inserted);
        }
        ArrayList q = new ArrayList<Node>();
        q.add(temp);
        boolean flag = false;
        while( !q.isEmpty() ){
            if (flag){
                break;
            }
            for (int i=0; i<q.size(); i++){
                Node curr = (Node) q.remove(0);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
                if(curr.left == null || curr.right == null){
                    if(curr.left == null){
                        curr.left = inserted;
                        flag = true;
                    }
                    if(curr.right == null && !flag){
                        curr.right = inserted;
                        flag = true;
                    }
                }
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

        int key1 = 12;
        insert(root, key1);

        System.out.print("\nInorder traversal after insertion:");
        inorder(root);

        int key2 = 17;
        insert(root, key2);

        System.out.print("\nInorder traversal after insertion:");
        inorder(root);

        int key3 = 21;
        insert(root, key3);

        System.out.print("\nInorder traversal after insertion:");
        inorder(root);

        int key4 = 19;
        insert(root, key4);

        System.out.print("\nInorder traversal after insertion:");
        inorder(root);

        int key5 = 13;
        insert(root, key5);

        System.out.print("\nInorder traversal after insertion:");
        inorder(root);
    }
}
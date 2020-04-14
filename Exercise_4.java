import java.util.LinkedList;
import java.util.Queue;

/**
 *  Insert an element in a Binary Tree whenever you find the node is empty.It could be at root.
 *  or left child or right child of any node
 */
 class GFG {

    /**
     * A binary tree node has key, pointer to left child and a pointer to right child
     * */
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

    /**
     * Inorder traversal of the tree(left subtree-root-right subtree)
     * @param root: root of the tree
     */
    static void inorder(Node root)
    {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.key+" ");
        inorder(root.right);
    }

    /*function to insert element in binary tree */

    /**
     * Insert the element in a tree at first free place
     * @param root root is the rrot elemnt of the tree
     * @param key: this is the data we want to insert in a tree
     */
    static void insert(Node root, int key)
    {

        // Do level order traversal until we find
        // an empty place and add the node.
        Queue<Node> que=new LinkedList<>();
        que.add(root);
        Node temp=new Node(key);
        if(root==null){
            GFG.root=temp;
        }else{
            while(!que.isEmpty()){
                Node curr=que.remove();

                //check for left child
                if(curr.left==null){
                    curr.left=temp;
                    break;
                }else{
                    que.add(curr.left);
                }
                //check for right child
                if(curr.right==null){
                    curr.right=temp;
                    break;
                }else{
                    que.add(curr.right);
                }
            }
        }
    }

    // Driver code
    public static void main(String args[])
    {
        // when tree is empty
        root=null;
        System.out.print( "Inorder traversal before insertion:");
        inorder(root);
        int key = 12;
        insert(root, key);
        System.out.print("\nInorder traversal after insertion:");
        inorder(root);
        System.out.println();

        //when tree is not empty
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.print( "Inorder traversal before insertion:");
        inorder(root);

        insert(root, key);

        System.out.print("\nInorder traversal after insertion:");
        inorder(root);
    }
}
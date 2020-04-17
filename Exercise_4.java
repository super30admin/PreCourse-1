import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
    //Time Complexity:o(n) where n is number on nodes in tree
    //Space complexity:o(n) where n is number on nodes in tree(in worst case all nodes could be at just one side)
    static void inorderRecursive(Node root)
    {
        if (root == null)
            return;

        inorderRecursive(root.left);
        System.out.print(root.key+" ");
        inorderRecursive(root.right);
    }

    /**
     * Function to travere the tree in inorder(left subtree- root-right subtree) using iterative approach
     * @param root: root of the binary tree
     */
    //Time complexity:o(n) where n is number of nodes in a tree
    //Space complexity:
    static void inorderIterative(Node root)
    {
        if (root == null)
            return;
        Stack<Node> stack =new Stack<>();
        Node curr=root;
        while(!stack.isEmpty()|| curr!=null){

            if(curr!=null) {
                stack.push( curr );
                curr = curr.left;
            }else{
                curr=stack.pop();
                System.out.print(curr.key+" ");
                curr=curr.right;
            }
        }
        System.out.println();

        
    }

    /**
     * Level order traversal of the tree
     * @param root: root of the tree
     */
    //Time complexity:o(n) where n is number of nodes in a tree
    //Space complexity: 0(2)^h : where h is the height of the tree
    static void levelOrderTraversal(Node root)
    {
        if (root == null)
            return;
        Queue<Node> que=new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()){
            Node curr=que.remove();
            System.out.print(curr.key+", ");
            if(curr.left!=null){
                que.add(curr.left);
            }
            if(curr.right!=null){
                que.add(curr.right);
            }
        }
        System.out.println();


    }

    /**
     * Insert the element in a tree at first free place
     * @param root root is the rrot elemnt of the tree
     * @param key: this is the data we want to insert in a tree
     */
    //Time complexity:o(n) where n is number of nodes in a tree
    //Space complexity: 0(2)^h : where h is the height of the tree
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
        inorderRecursive(root);
        int key = 12;
        insert(root, key);
        System.out.print("\nInorder traversal after insertion:");
        inorderRecursive(root);
        System.out.println();

        //when tree is not empty
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.print( "Inorder traversal before insertion:");
        inorderRecursive(root);
        System.out.println();
        System.out.print( "Inorder traversal before insertion:");
        inorderIterative(root);

        System.out.print( "Level order traversal before insertion:");
        levelOrderTraversal(root);

        insert(root, key);

        System.out.print("Inorder traversal after insertion:");
        inorderRecursive(root);
    }
}
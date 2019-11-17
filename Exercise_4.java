package com.company;
import java.util.Queue;
import java.util.LinkedList;
public class BinaryTree {

    static class Node {
        int key;
        Node left, right;

        Node(int key){
            this.key = key;
            left = null;
            right = null;
        }
    }
    static Node root;

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
    static void insert(Node temp, int key) {
        Queue<Node> q = new LinkedList<>();
        q.add(temp);
        Node toInsert = new Node(key);
        while (!q.isEmpty()) {
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                Node root = q.poll();
                if (root.left == null) {
                    root.left = toInsert;
                    return;
                }
                if (root.right == null) {
                    root.right = toInsert;
                    return;
                }
                if (root.left != null) q.add(root.left);
                if (root.right != null) q.add(root.left);
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




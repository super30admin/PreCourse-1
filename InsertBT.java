package com.tree;

import java.util.Queue;
import java.util.LinkedList;

class Node {

    int data;
    Node right;
    Node left;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class InsertBT {


    void inorder(Node temp){
        if(temp == null){
            return;
        }
        inorder(temp.left);
        System.out.print(temp.data + " ");
        inorder(temp.right);
    }

    void insert(Node temp, int key){
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);

        while(!q.isEmpty()){
            temp = q.peek();
            q.remove();

            if(temp.left == null){
                temp.left = new Node(key);
                break;
            }
            else{
                q.add(temp.left);
            }

            if(temp.right == null){
                temp.right = new Node(key);
                break;
            }
            else{
                q.add(temp.right);
            }
        }

    }

    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);

        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        InsertBT b = new InsertBT();

        System.out.println("Before insertion");
        b.inorder(root);

        int key = 12;

        b.insert(root, key);

        System.out.println();
        System.out.println("After insertion");
        b.inorder(root);


    }
}

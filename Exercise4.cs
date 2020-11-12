using System;
using System.ComponentModel.Design.Serialization;
using System.Security.Cryptography.X509Certificates;

namespace Exercise4
{
    class BinaryTree
    {
        
       internal class Node
        {
           internal  int key;
            internal Node left, right;

             public Node(int key)
            {
                this.key = key;
                left = null;
                right = null;
            }
        }
        static Node root;
        static Node temp = root;

        static void inorder(Node temp)
        {
            if(temp==null)
            {
                return;
            }
            else
            {
                inorder(temp.left);
                Console.WriteLine(temp.key);
                inorder(temp.right);
            }
        }

        static void insert(Node temp,int key)
        {
            Node _node = new Node(key);

            Node pointerNode = root;

            Node pointerY = null;

            while(pointerNode !=null)
            {
                pointerY = pointerNode;
                if(key< pointerNode.key)
                {
                    pointerNode = pointerNode.left;
                }
                else
                {
                    pointerNode = pointerNode.right;
                }
            }

            if(pointerY == null)
            {
                pointerY = _node;
            }

            else if(key < pointerY.key)
            {
                pointerY.left = _node;
            }
            else
            {
                pointerY.right = _node;
            }
        }
        static void Main(string[] args)
        {
            root = new Node(10);
            root.left = new Node(11);
            root.left.left = new Node(7);
            root.right = new Node(9);
            root.right.left = new Node(15);
            root.right.right = new Node(8);

            Console.WriteLine("inorder traversal before insertion");
            inorder(root);

            int key = 12;
            insert(root, key);

            Console.WriteLine("inorder traversal after insertion");
            inorder(root);

            Console.WriteLine("Hello World!");
        }
    }
}

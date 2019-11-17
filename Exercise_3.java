Time Complexity-Insertion-O(n)
Space Complexity-O(n)

package com.company;

public class LinkedList {
    Node head;
    static class Node {
        int key;
        Node next;

        Node(int d) {
            this.key = d;
            this.next = null;

        }
    }

        LinkedList(){
            this.head=null;
        }
        public static LinkedList insert(LinkedList list, int data)
        {
            Node temp=new Node(data);
            if(list.head==null)
                list.head=temp;
            else {
                Node curr = list.head;
                while (curr.next != null) {
                    curr = curr.next;
                }
                curr.next = temp;
            }

            return list;
        }


        public static void printList(LinkedList list)
        {
           Node curr= list.head;
           while(curr!=null)
           {
               System.out.println(curr.key);
               curr=curr.next;
           }
        }


        public static void main(String[] args)
        {
            LinkedList list = new LinkedList();

            // Insert the values
            list = insert(list, 331);
            list = insert(list, 212);
            list = insert(list, 312);
            list = insert(list, 423);
            list = insert(list, 53);
            list = insert(list, 3142);
            list = insert(list, 4253);
            list = insert(list, 532);

            // Print the LinkedList
            printList(list);
        }

    }

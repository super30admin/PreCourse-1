// Time Complexity : insert - O(1), delete - O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.*; 
  
// Java program to implement 
// a Singly Linked List 
class LinkedList { 
  
    static Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            //Write your code here 
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node newnode = new Node(data);
        if(list.head==null){
            head = newnode; 
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    } 

    public static LinkedList deleteByKey(LinkedList list,int key){
        Node cur = list.head;
        Node prev=null;
        
        if(cur!=null && cur.data==key){
            list.head=cur.next;
            return list;
        }
            
        while(cur!=null && cur.data!=key){
                prev=cur;
                cur=cur.next;
        }
        if(cur !=null ){
            prev.next=cur.next;
        }
        
        if(cur == null){
            System.out.println("not found");
        }

        return list;
        }
    
    
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        deleteByKey(list,4);
  
        // Print the LinkedList 
        printList(list); 
    } 
}
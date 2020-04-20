
import java.io.*; 
public class LinkedList { 
  
    Node head; 
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) 
        { 
            data=d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        if(list.head==null){
           list.head=new Node(data);
           list.head.next=null;
           
        }
        else{
            Node temp= list.head;
            while(temp.next!=null){
            temp=temp.next;
            }
            
            Node newNode=new Node(data);
            temp.next = newNode;
            temp=temp.next;
            temp.next=null;
         }
         return list;
     } 
   
     // Method to print the LinkedList. 
     public static void printList(LinkedList list) 
     {  
         while(list.head!=null){
             System.out.print(list.head.data + " -> ");
             list.head=list.head.next;
         }
         System.out.print("(null)");
     } 
    
     // Driver code 
     public static void main(String[] args) 
     { 
         /* Start with the empty list. */
         LinkedList list = new LinkedList(); 
   
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}
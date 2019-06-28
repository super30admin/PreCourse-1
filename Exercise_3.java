import java.io.*; 

//Java program to implement 
//a Singly Linked List 
public class LinkedList { 

 Node head = null; 

 static class Node { 

     int data; 
     Node next; 

     // Constructor 
     Node(int d) 
     { 
         this.data=d;
         //Write your code here 
     } 
 } 

 // Method to insert a new node 
 public static LinkedList insert(LinkedList list, int data) 
 { 
       Node temp = new Node(data);

     if(list.head == null){
         temp.next = list.head;
         list.head = temp;
     }else{
         Node currentNode = list.head;
         while(currentNode.next!=null){
             currentNode = currentNode.next;
         }
         currentNode.next = temp;

     }
     return list;
        
     
 } 

 // Method to print the LinkedList. 
 public static void printList(LinkedList list) 
 {  
     // Traverse through the LinkedList 
              if (list.head == null) { 
         System.out.printf("Empty List"); 

     } 
     else { 
         Node temp = list.head; 
         while (temp != null) { 

           
             System.out.printf("%d->", temp.data); 

            
             temp = temp.next; 
         } 
     }
   
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

     // Print the LinkedList 
     printList(list); 
 } 
}

//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : Got confused on how to pass the head.

  
public class LinkedList_1 { 
  
    Node head; // head of list 
  
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            //Write your code here 
            data = d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList_1 insert(LinkedList_1 list, int data) 
    { 
        Node n = new Node(data);
        if(list.head == null){
            list.head = n;
        }
        else{
            Node curr_head = list.head;
            while(curr_head.next != null){
                curr_head = curr_head.next;
            }
            curr_head.next = n;
        }
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList_1 list) 
    {  
        Node curr_node = list.head;
        while(curr_node != null){
            System.out.println(curr_node.data);
            curr_node = curr_node.next;
        }
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList_1 list = new LinkedList_1(); 
  
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
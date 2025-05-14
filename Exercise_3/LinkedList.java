package Exercise_3;
// Time Complexity : insert - O(n), where n is the number of nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : had a little problem figuring out the list part  but eventually understood how to do it
public class LinkedList { 
  
    Node head;

    static class Node { 
  
        int data; 
        Node next; 

        Node(int d) 
        { 
            data = d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // A new node with given data
        Node temp = new Node(data);

        if(list.head == null) {
            list.head = temp;
        } else {
            Node node = list.head;
            while(node.next != null) {
                node = node.next;
            }
            node.next = temp;
        }

        return list;
    } 
  
    // Method to print the Exercise_3.LinkedList.
    public static void printList(LinkedList list) 
    {  
        Node temp = list.head;

        while(temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if(temp != null) System.out.print("  ->  ");
        }
        System.out.println();
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
        System.out.println("Print Linked List");
        printList(list); 
    } 
}
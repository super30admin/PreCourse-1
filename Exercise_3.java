// Time Complexity : O(n)
// Space Complexity : O(n)
  
// Java program to implement 
// a Singly Linked List 
class LinkedList {
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        {
            data = d;
            next = null;
        }
    }

    public boolean isEmpty()
    {
        return head == null;
    }
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    {
        if(list.isEmpty())  list.head = new LinkedList.Node(data);
        else{
            LinkedList.Node temp = list.head;
            while(temp.next != null)    temp = temp.next;
            temp.next = new LinkedList.Node(data);
        }
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {
        LinkedList.Node temp = list.head;
        while(temp != null){
            System.out.print(temp.data + "\n");
            temp = temp.next;
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
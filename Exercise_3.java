// Java program to implement
// a Singly Linked List

// Time Complexity : O(1)
// Space Complexity : O(n)
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
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data)
    { 
        // Create a new node with given data
        Node node = new Node(data);

        if(list.head == null) {
            list.head = node;
            return list;
        } else {
            Node tempNode = list.head;
            while(tempNode != null && tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = node;
        }
        return list;
    }
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList
        Node tmpNode = list.head;
        while(tmpNode != null) {
            System.out.print(tmpNode.data+" -> ");
            tmpNode = tmpNode.next;
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
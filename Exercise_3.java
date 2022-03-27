// Java program to implement
// a Singly Linked List
/**
 * Space complexity of this solution is O(n)
 */
class LinkedList {
  
    Node head; // head of list
    Node tail; // To maintain the end of the list
  
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
            this.data = d; // next is by default initialized to null
        }
    } 
  
    /**
     * Method to insert a new node.
     * Time complexity of printList() operation is O(n)
     */
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node newNode = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if(list.head == null){
            list.head = newNode;
            list.tail = newNode;
        }
        else{
            // Else traverse till the last node
            // and insert the new_node there
            //Insert the new_node at last node
            /*Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;*/
            list.tail.next = newNode;
            list.tail = newNode;
        }
        // Return the list by head
        return list;
    } 
  
    /**
     * Method to print the LinkedList.
     * Time complexity of printList() operation is O(n)
     */
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        // Print the data at current node
        // Go to next node
        Node currentNode = list.head;
        System.out.println("Printing Linked List");
        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
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
        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        insert(list, 5);
  
        // Print the LinkedList 
        printList(list); 
    } 
}
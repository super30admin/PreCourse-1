public class LinkedList { 

    Node head; // head of list 

    // Linked list Node. 
    static class Node { 
        int data; 
        Node next; 
  
        // Constructor 
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } 
  
    // Method to insert a new node 
    // Time Complexity: O(n), where n is the number of nodes in the list
    // Space Complexity: O(1), only a single new node is created irrespective of the size of the LinkedList
    public static LinkedList insert(LinkedList list, int data) { 
        Node newNode = new Node(data); 

        if (list.head == null) { 
            list.head = newNode; 
        } else { 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
            last.next = newNode; 
        } 

        return list; 
    } 
  
    // Method to print the LinkedList. 
    // Time Complexity: O(n), where n is the number of nodes in the list
    // Space Complexity: O(1), no extra space is used
    public static void printList(LinkedList list) {  
        Node currentNode = list.head; 

        System.out.print("LinkedList: "); 

        while (currentNode != null) { 
            System.out.print(currentNode.data + " "); 

            currentNode = currentNode.next; 
        } 

        System.out.println(); 
    } 
   
    // Driver code 
    // Time Complexity: O(n), where n is the number of insert operations
    // Space Complexity: O(1), only a single new node is created for each insert operation 
    public static void main(String[] args) { 
        LinkedList list = new LinkedList(); 

        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 

        printList(list); 
    } 
}

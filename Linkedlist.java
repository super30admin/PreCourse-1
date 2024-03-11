/* TC: insert: O(N)
 SC: O(1)
*/

// Java program to implement 
// a Singly Linked List 
class Linkedlist { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next =null; 
  
        // Constructor 
        Node(int d) 
        { 
            this.data = d;
            //Write your code here 
        } 
    } 
  
    // Method to insert a new node 
    public static Linkedlist insert(Linkedlist list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data);
        Node temp = list.head;
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null){
            list.head = new_node;
            return list;
        }
        else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new_node;
        }
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        return list;
        
    } 
  
    // Method to print the Linkedlist. 
    public static void printList(Linkedlist list) 
    {  
        // Traverse through the Linkedlist 
        Node temp1 = list.head;
            // Print the data at current node 
        while(temp1 != null){
            System.out.println(temp1.data);
            temp1=temp1.next;
            // Go to next node 
        }
    }

    public static void main(String args[]) 
    { 
        // 
        Linkedlist list = new Linkedlist(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = Linkedlist.insert(list, 1); 
        list = Linkedlist.insert(list, 2); 
        list = Linkedlist.insert(list, 3); 
        list = Linkedlist.insert(list, 4); 
        list = Linkedlist.insert(list, 5);

        // Print the Linkedlist 
        Linkedlist.printList(list); 
    } 
}
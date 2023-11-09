 
// C# program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node Head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    class Node { 
  
        public int Data; 
        public Node Next; 
  
        // Constructor 
        public Node(int d) 
        { 
            //Write your code here
            Data = d;
        } 
    } 
  
    // Method to insert a new node 
    // Time Complexity : O(n) 
    // Space Complexity : O(1)
    static LinkedList insert(LinkedList list, int data) 
    {
        // Create a new node with given data 
        Node n = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.Head == null){
            list.Head = n;
        }
        // Else traverse till the last node 
        // and insert the new_node there
        else{
            Node cur = list.Head;
            while(cur.Next!=null){
                cur = cur.Next;
            }
            // Insert the new_node at last node 
            cur.Next = n;
        }
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    // Time Complexity : O(n) 
    // Space Complexity : O(1)
    static void printList(LinkedList list) 
    {  
        if(list.Head != null){
            // Traverse through the LinkedList 
            var cur = list.Head;
            while(cur!=null){
                // Print the data at current node 
                Console.WriteLine(cur.Data);
                // Go to next node 
                cur = cur.Next;
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

// Java program to implement 
// a Singly Linked List 

    class LinkedList { 
  
        static Node head; // head of list 
        // Linked list Node.  
        private class Node { 
      
            int data; 
            Node next; 
            // Constructor 
            Node(int d) 
            { 
                this.data = d;
                this.next = null;
            }
        } 
            Node tail;
            int size;
   
       
        // TC : O(1)   SC : O(1)
        public void insert(int data) 
        { 
            // Create a new node with given data 
    
            Node newNode = new Node(data);
    
       
            // If the Linked List is empty, 
            // then make the new node as head 
            if(this.size == 0 ){
                LinkedList.head = newNode;
                this.tail = newNode;
                this.size++;
            }
            else{
                this.tail.next = newNode;
                this.tail = newNode;
                this.size++;
            }
          
        } 
      
        // Method to print the LinkedList. 
        // TC : O(n)   SC : O(1)
        public static void print() 
        {  
               // Traverse through the LinkedList  
               // Print the data at current node 
                Node temp = LinkedList.head;
                 while(temp != null){
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
 
               }
            
           // Go to next node 

            }
 
        public class Exercise_3{
       
        // Driver code 
        public static void main(String[] args) 
        { 
            /* Start with the empty list. */
            LinkedList list = new LinkedList(); 
            // Insert the values 
            list.insert(100); 
            list.insert(2); 
            list.insert(3); 
            list.insert(4); 
            list.insert(5); 
            list.insert(6); 

            LinkedList.print();
          
        }

}





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
            data=d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node temp = new Node(data);
        if(head==null){
            head=temp;
            return head;
            
        }
        temp.next=null;
        Node curr = head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=temp;
        return head;
            
    }
       
   
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node curr = head;
        while(curr.next!=null)
        {
            System.out.println(cur.data);
            curr=curr.next;
        }
        
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}/* package codechef; // don't place package name! */


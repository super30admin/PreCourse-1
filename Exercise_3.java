/*
Time Complexity : O(n) since everything is done after traversing the entire arraylist.
Space Complexity : O(n) since we create memory when stacknode is added

Did this code successfully run on Leetcode :
Finished in 70 ms
[ 1, 2, 3, 4, 5 ]

Any problem you faced while coding this :
None.

Your code here along with comments explaining your approach :
Brute Force Straight forward approach.
*/

// Java program to implement 
// a Singly Linked List 
class CustomLinkedList { 
  
    private CustomNode head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class CustomNode { 
  
        int data; 
        CustomNode next; 
  
        // Constructor 
        CustomNode(int d) 
        { 
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static CustomLinkedList insert(CustomLinkedList list, int data) 
    { 
        if(list.head == null){
            list.head = new CustomNode(data);
        } else {
            CustomNode current = list.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = new CustomNode(data);
        }
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(CustomLinkedList list) 
    {  
        StringBuilder printStr = new StringBuilder("[ ");
        String print="";
        if(list.head != null){
            CustomNode current = list.head;
            while(current.next != null){
                printStr.append(current.data).append(", ");
                current = current.next;
            }
            printStr.append(current.data).append(", ");
            if(printStr.length()!= 2)
                print = printStr.substring(0, printStr.length()-2);
            print+=" ]";
        }
        System.out.println(print);
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        CustomLinkedList list = new CustomLinkedList(); 
  
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
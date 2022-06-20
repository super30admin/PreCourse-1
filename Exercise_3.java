//Time Complexity: O(n)
//Space Complexity: O(n)

class LinkedList { 
  
    static Node head; // head of list 

    static class Node { 
  
        int data; 
        Node next; 
        Node(){};
 
        Node(int d) 
        { 
        	this.data = d;
			this.next = null;
        } 
    } 
    LinkedList(){
    	head = null;
    }
    public static LinkedList insert(LinkedList list, int data) 
    { 
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		
		if(head == null) {
			head = temp;
			return list;
		}
		
		Node p = head;
		while(p.next != null)
			p = p.next;
		
		p.next = temp;
		
		return list;
        
    } 
  
    
    public static void printList(LinkedList list) 
    {  
    	Node p = head;
		while(p != null) {
			System.out.println(p.data);
			p = p.next;
		}	
    } 
}

    class DriverCode{
    	
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = LinkedList.insert(list, 1); 
        list = LinkedList.insert(list, 2); 
        list = LinkedList.insert(list, 3); 
        list = LinkedList.insert(list, 4); 
        list = LinkedList.insert(list, 5); 
  
        // Print the LinkedList 
        LinkedList.printList(list); 
    } 
}

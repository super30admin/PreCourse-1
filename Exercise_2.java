//Time Complexity: O(1) -> all operations execute in O(1) complexity
                        //push, pop, peek, isEmpty
//Space Complexity: O(n) -> worst case all elements are stored in the list
                        //occupying linear space


public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
        //initiallizing data in constructor
        StackNode(int data) 
        { 
            this.data = data;
        } 
    } 
    
    public boolean isEmpty() 
    { 
        //if no elements; return true
        if(root == null){
            return true;
        } else {
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //if no node is present in the list -> add node as root
        StackNode node = new StackNode(data);
        if(root == null){
            root = node;
        } else {
            //insert node before root; node.next-> root
            StackNode tempNode = root;
            root = node;
            node.next = tempNode;
        }
        System.out.println("Element added successfully to the list!");
    } 
  
    public int pop() 
    { 	//if no node to pop; return empty stack message
        //else pop root and point next element as the root
        int poppedElement = Integer.MIN_VALUE;
        if(root == null){
            System.out.println("No element to pop. List Empty!");
        } else {
            poppedElement = root.data;
            root = root.next;
        }
        return poppedElement;
    } 
  
    public int peek() 
    {   
        //return -1 if no element to peek
        //else return root
        if(root == null){
            System.out.println("No element to peek. Empty list!");
            return Integer.MIN_VALUE;
        } else {
            return root.data;
        }
    } 
}

class Main { 
	//Driver code
    public static void main(String[] args) 
    { 
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from list"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 

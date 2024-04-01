// Time Complexity : Push - O(1), Search - O(N), Pop - O(1)
// Space Complexity : O(N) - size of the LinkedList
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
// Error : Class StackAsLinkedList is public, should be declared in a file name StackAsLinkedList.java
// To fix above error, removed the public access specifier for class

// Your code here along with comments explaining your approach

class StackAsLinkedList {

    // Head of the LinkedList
    static StackNode root;

    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            // Initialize data
            this.data = data;
        } 
    }

    StackAsLinkedList(){
        //Initialize root to null. Initially head will be null and we keep adding elements to the head
        root = null;
    }
    
	
    public boolean isEmpty() 
    { 
        // if root is null means no elements in the list
        return root == null;
    } 
  
    public void push(int data) 
    {
       // Create a temporary node with new element to insert
       StackNode temp = new StackNode(data);
       // check if it is null or not for overflow condition
       if(temp == null) {
           System.out.println("Heap Overflow");
       }
       // set the next node of temp element to root
       temp.next = root;
       //set root to current element to insert
       root = temp;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        // need to pop the root element, so store root in a temp node.
        StackNode temp = root;
        // unlink the root element by setting root to the next element
        root = root.next;
        // return the root element data for poping
        return temp.data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        // if linked list is not empty, returning the data of root element
        if(!isEmpty()){
            return root.data;
        }
        return -1;
    }


	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10);
        System.out.println("Top element is " + sll.peek());
        sll.push(20);
        System.out.println("Top element is " + sll.peek());
        sll.push(30);
        System.out.println("Top element is " + sll.peek());

        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek());
        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
        sll.push(40);
        System.out.println("Top element is " + sll.peek());
    }
} 

 /*
 Time Complexity:
    isEmpty(), peek(), pop(),push() - O(1) constant time
 Space Complexity: O(n) to store all n elements in n StackNodes.
*/

 /*
Stack is a LIFO data structure. So push() and pop() operations should happen on the same end.
As elements in linked list can be accessed only by traversing from head. If elements are added at the end of linkedlist,
it would take O(n) operations to push and pop. In order to do these operations in O(1) constant time, pushing elements to
start of linkedlist & making the new added element as head .Also popping elements from start and readjusting root/head node 
to the next element.
Peek - Head/root node gives the most last inputted element.
*/
 class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data; 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return root == null;
    } 
  
    public void push(int data) 
    { 
       var newElement = new StackNode(data); 
       newElement.next = root;
       root = newElement;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            StackNode poppedElement = root;
            root = root.next;
            return poppedElement.data;
        }
    } 
  
    public int peek() 
    { 
        if(!isEmpty()) return root.data;
        else return 0;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 

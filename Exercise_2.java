// Time Complexity : For each operation, O(1)
// Space Complexity : Constant space complexity O(1)
/* Did this code successfully run on Leetcode : Ran on sample test cases including 
 
1. Checking if stack is empty
2. Popping from empty stack
3. Push elements into stack and then popping elements

*/
// Any problem you faced while coding this : The crux was to construct a linked list in reverse order


public class StackAsLinkedList { 
  
    StackNode root; 
    int size;
    
    public StackAsLinkedList() {
        size = 0;
        root = null;
    }
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
            
            
        } 
    } 
    
    
    public boolean isEmpty() 
    { 
        return size == 0;
    } 
  
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data);
        if(isEmpty()) {
            root = newNode;
        }
        newNode.next = root;
        root = newNode;
        root.next = newNode.next;
        size++;
    } 
  
    public int pop() 
    {   
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int poppedInt = root.data;
        StackNode temp = root;
        root=root.next;
        size--;
        return poppedInt;
    } 
  
    public int peek() 
    { 
        return root.data;
        //Write code to just return the topmost element without removing it.
    } 
  
    //Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
        System.out.println(sll.isEmpty());
        System.out.println(sll.pop() + " popped from stack"); 
        sll.push(10);   
        sll.push(20); 
        sll.push(30); 
  
        sll.push(40);
        sll.push(50);
        
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.isEmpty());
        
       
    } 
} 
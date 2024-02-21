public class Exercise_2 { 

    /*Time Complexity:
     * isEmpty(), push(), pop(), peek() : O(1) since every method got run in one iteration
     * Space Complexity:
     * It is O(n); where, n is the number of elements in the stack
     * 
     * Couldn't able to find the exact same problem in leetcode. However it worked in my local.
     * Output :30 popped from stack ; Top element is 20
     * 
     * 
     */
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
            this.next =null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data);
        if (root ==null){
            root = newNode;
        }else{
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
    } 
  
    public int pop() 
    { 	
        if (root == null){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int popped = root.data;
            root = root.next;
            return popped;
        }
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (root ==null){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            return root.data;
        }

    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        Exercise_2 sll = new Exercise_2(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 

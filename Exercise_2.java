public class Exercise_2 {
  
    StackNode root; 
  
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
        if(root == null){
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        if(root == null){
            root = new StackNode(data);
        }else{
            StackNode node = root;
            while(node.next != null){
                node = node.next;
            }
            node.next = new StackNode(data);
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            StackNode node = root;
            if(node.next == null){
                int val = node.data;
                node = null;
                return val;
            }else{
                while(node.next.next != null){
                    node = node.next;
                }
                int val = node.next.data;
                node.next = null;
                return val;
            }
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null){
            return 0;
        }else{
            StackNode node = root;
            while(node.next != null){
                node = node.next;
            }
            return node.data;
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

// Time Complexity :Push O(n) Pop O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Not attempted
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// Always have the root pointer as base and increment/decrement on root pointer.


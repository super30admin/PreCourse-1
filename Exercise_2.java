/*
Time Complexity : O(n) since everything is done after traversing the  entire arraylist.
        It can be done using pointers for last and second last but this is the brute force approach
Space Complexity : O(n) since we create memory when stacknode is added

Did this code successfully run on Leetcode :
Finished in 81 ms
Stack Underflow
0 Peeked from stack
40 Peeked from stack
40 Popped from stack
30 Popped from stack
20 Popped from stack
10 Popped from stack
Stack Underflow
0 Peeked from stack

Any problem you faced while coding this :
None.

Your code here along with comments explaining your approach :
Brute Force Straight forward approach.
Can be optimized by keeping last node to reduce time complexity of push n peek and second last node as well for pop
*/
class StackAsLinkedList { 
  
    StackNode root; 
  
    StackAsLinkedList(){
    }

    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) { 
            this.data = data;
            next = null;
        } 
    } 
	
    public boolean isEmpty() 
    { 
        return (root.next == null);
    } 
  
    public void push(int data) 
    { 
        if(root == null) {
            root =  new StackNode(data);
        } else {
            StackNode current = root;
            while(current.next != null){
                current = current.next;
            }
            current.next = new StackNode(data);
        }
        
    } 
  
    public int pop() 
    { 	
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element 
        StackNode current = root;
        if(current == null){
            System.out.println("Stack Underflow");
            return 0;
        }
        StackNode prev = null;
        while(current.next != null){
            prev = current;
            current = current.next;
        }
        if(prev == null){
            root = null;
        } else {
            prev.next = null;
        }
        return current.data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
         StackNode current = root;
        if(current == null){
            System.out.println("Stack Underflow");
            return 0;
        }
        while(current.next != null){
            current = current.next;
        }
        return current.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList s = new StackAsLinkedList(); 
        
        System.out.println(s.peek() + " Peeked from stack"); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        s.push(40); 
        System.out.println(s.peek() + " Peeked from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.peek() + " Peeked from stack"); 
    } 
} 

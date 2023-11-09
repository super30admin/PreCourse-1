/** 
// Time Complexity : O(1)
// Space Complexity : O(N)
//Author: Shubhangi Srivastava
*/
import javax.sound.sampled.DataLine;
public class StackAsLinkedList { 
  
    StackNode root = null; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data= data;
            this.next = null;

        } 
    } 
    
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root == null){
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        StackNode node = new StackNode(data);
        node.data = data;
        node.next = root;
        root = node;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    if(root == null){
        return 0;
        System.out.println("Stack Underflow!!");
    } else {
        int pop = root.data;
        root = root.next;
        return pop;
    }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            return root.data;
        }
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

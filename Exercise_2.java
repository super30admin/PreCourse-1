/**
 * Time Complexity:
 * isEmpty() : O(1)
 * push() : O(1)
 * pop() : O(1)
 * peek() : O(1)
 * 
 */

public class Exercise_2 {

    static StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            next=null;
        }
    }

    public boolean isEmpty() {
        return root==null;
    }

    public void push(int data) {
        StackNode node = new StackNode(data);
        node.data = data;
        node.next = root;
        root = node;
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
        
            int result = root.data;
            root=root.next;
            return result;
        }
        
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return root.data;
        }
    }

    // Driver code
    public static void main(String[] args) {

        Exercise_2 sll = new Exercise_2();
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 

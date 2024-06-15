/*
 * Time Complexity:
 * - isEmpty: O(1)
 * - push: O(1)
 * - pop: O(1)
 * - peek: O(1)
 * 
 * Space Complexity: O(n) where n is the number of elements in the stack.
 */

 public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) { 
            this.data = data; 
            this.next = null;
        } 
    } 
    
    public boolean isEmpty() { 
        return root == null; 
    } 
  
    public void push(int data) { 
        StackNode newNode = new StackNode(data); 
        newNode.next = root; 
        root = newNode; 
    } 
  
    public int pop() { 
        // If Stack Empty Return 0 and print "Stack Underflow"
        if (isEmpty()) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } else { 
            int popped = root.data; 
            root = root.next; 
            return popped; 
        } 
    } 
  
    public int peek() { 
        // Return the topmost element without removing it
        if (isEmpty()) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } else { 
            return root.data; 
        } 
    } 
  
    // Driver code
    public static void main(String[] args) { 
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println("Top element is " + sll.peek()); 
    } 
}

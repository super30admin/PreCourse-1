public class StackAsLinkedList { 

    StackNode root; 

    static class StackNode { 
        int data; 
        StackNode next; 

        // Constructor 
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        StackNode(int data) { 
            this.data = data; 
            next = null; 
        } 
    } 
    
    // Method to check if the stack is empty
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public boolean isEmpty() { 
        if (root == null) {
            return true;
        }
        else {
            return false;
        }
    } 
  
    // Method to push data onto the stack
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public void push(int data) { 
        StackNode newNode = new StackNode(data);
        if (root == null) {
            root = newNode;
        }
        else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack"); 
    } 
  
    // Method to pop data from the stack
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public int pop() {   
        int popped = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    } 
  
    // Method to get the top element of the stack
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public int peek() { 
        if (root == null) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return root.data;
        }
    } 
  
    // Driver code
    // Time Complexity: O(1) for each push operation
    // Space Complexity: O(1) for each push operation
    public static void main(String[] args) { 

        StackAsLinkedList sll = new StackAsLinkedList(); 

        sll.push(10); 
        sll.push(20); 
        sll.push(30); 

        System.out.println(sll.pop() + " popped from stack"); 

        System.out.println("Top element is " + sll.peek()); 
    } 
}
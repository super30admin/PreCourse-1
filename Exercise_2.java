//Time Complexity : o(1)
//Space Complexity : o(n)
//Did this code successfully run on Leetcode : Haven't tried
//Any problem you faced while coding this : No

public class StackAsLinkedList { 
  
    StackNode root;
    int size;
    
    public StackAsLinkedList() {
        root = null;
        size = 0;
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
        if(size == 0) {
            root = new StackNode(data);
            size++;
        } else {
            StackNode top = new StackNode(data);
            top.next = root;
            root  = top;
            size++;
        }
    } 
  
    public int pop() 
    { 
        if(size == 0) {
            System.out.println("\nStack Underflow");
            return 0;
        }
        StackNode top = root;
        root = top.next;
        size--;
        return top.data;

    } 
  
    public int peek() 
    { 
        if(size == 0) {
            System.out.println("\nStack Underflow");
            return 0;
        }
        return root.data;
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
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
    } 
} 

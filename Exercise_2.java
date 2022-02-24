/*
 Time Complexity:
 isEmpty: O(1), push: O(1), pop: O(1), peek: O(1)
 Space Complexity: O(n)
 Did this code successfully run on Leetcode : Yes
 Any problem you faced while coding this : No
 */

public class StackAsLinkedList {
  
    StackNode root; //considering it as the latest element added
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data=data;
        } 
    } 
    
    
    public boolean isEmpty() {
        return root==null;
    } 
  
    public void push(int data) {
        StackNode newNode=new StackNode(data);
        if(root==null)
            root=newNode;
        else {
            newNode.next=root;
            root=newNode;
        }
    } 
  
    public int pop() {
        if(root==null) {
        System.out.println("Stack Underflow-pop");
        return 0;
       } else {
            int remove=root.data;
            root=root.next;
            return remove;
        }
    } 
  
    public int peek() {
        if (root == null) {
            System.out.println("Stack Underflow-peek");
            return 0;
        } else {
            return root.data;
        }

    }
  
    //Driver code
    public static void main(String[] args) {
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 

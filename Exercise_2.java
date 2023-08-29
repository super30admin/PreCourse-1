//Time Complexity : O(1)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : Had to change parameter name in StackNode as it was matching the data object in StackNode


public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data_num) 
        { 
            data = data_num;   //assigning data number
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if(root == null){
            return true;      //checking if root is null to verify empty stack
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        StackNode s = new StackNode(data);
        s.next = root;         //assigning initail root value to new node
        root = s;              //updating root with the new head
    } 
  
    public int pop() 
    { 	

        if(isEmpty()){
            System.out.println("Stack Underflow");   //verify if root is null for empty stack
            return 0;
        }
        int result = root.data;
        root = root.next;       //assigning the next in stack address to root so now root points to the next value
        return result;
    } 
  
    public int peek() 
    { 
        if(isEmpty()){
            System.out.println("Stack Underflow");  //verify if root is null for empty stack
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
    } 
} 

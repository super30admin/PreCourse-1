/*
 * Time Complexity:
 *      isEmpty()->O(1)
 *      push(data)->O(1)
 *      pop()->O(1)
 *      peek()->O(1)
 * 
 * Space Complexity:(doubt)
 *      isEmpty()->O(1)
 *      push(data)->O(1)
 *      pop()->O(1)
 *      peek()->O(1)
 * 
 * Leetcode-> Unable to find the same problem in leetcode but executed well on local terminal
 * 
 * Approach-> Assign two reference variables root and temp for storing the nodes dynamically.
 * isEmpty()-> check if root is null. If root is null return the stack as empty else return the stack to be not empty.
 * push(data)-> Assign a new node to the data. Check if the list is empty then assign the root to be the new Node or else make the new Node point to the root and make the new node as root node.
 * pop()-> Check if root is null then return 0 or the stack is underflow or if there elements existing in the stack pop the top most element by deferencing the top element and the next element.
 * peek()-> Check if the list is having elements if yes then return the top most value of the list else return -1.
 */

public class Exercise_2 { 
  
    StackNode root; 
    StackNode temp;
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        {
            this.data=data;
            this.next=null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if(root==null)
            return true;
        return false;
    } 
  
    public void push(int data) 
    { 
        temp=new StackNode(data);
        if(root!=null){
            temp.next=root;
            root=temp;
        }
        else if(root==null){
            root=temp;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if(root==null){
        System.out.println("Stack Underflow");
        return 0;
    }
    else if(root!=null){
        temp=root;
        root=root.next;
        temp.next=null;
        return temp.data;
    }
    return 0;
    
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root!=null){
            return root.data;
        }
        else{
            return -1;
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

// Time Complexity :Insertion,Deletion,Search :O(1)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :N/A
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

class StackAsLinkedList {
  
    StackNode root;
    static class StackNode { 
        int data; 
        StackNode next;
  
        StackNode(int data) 
        {
            this.data = data;
            next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty
        return (root == null);
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack

        StackNode newNode = new StackNode(data);
        if( newNode == null){
            return;
        }
        else{
            newNode.next = root;
            root = newNode ;
        }

    } 
  public void printlist(){
      StackNode temp = root;
      System.out.print("List is : ");
      while(temp != null){
          System.out.print(temp.data + " ");
          temp = temp.next;
      }
      System.out.println();
  }
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty()== true){
            System.out.println("Stack Underflow");
            return -1;
        }
        //Write code to pop the topmost element of stack.
        StackNode prev = root;
        root = root.next;
	   //Also return the popped element
        return prev.data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(!isEmpty()){
            return root.data;
        }
        else
        {
            return -1;
        }
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30);
        sll.printlist();
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek());
        sll.push(40);
        sll.push(50);
        sll.printlist();
        System.out.println("Top element is " + sll.peek());

    } 
} 

public class StackAsLinkedList { 
  //time complexity O(1)
  
    StackNode root; 
  
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
        return root == null;
    } 
  
    public void push(int data) 
    { 
        StackNode node= new StackNode(data);
        node.next=root;
        root=node;
        
       
    } 
  
    public int pop() 
    { 	
        if(isEmpty()){
            System.out.println("Underflow"); 
        return 0;
        }
        else{
        int temp= root.data;
        root=root.next;
        return temp;
        }
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        return root.data;//Write code to just return the topmost element without removing it.
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack\n"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
}

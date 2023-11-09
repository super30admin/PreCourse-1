public class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data = data;
            next = null;
        } 
    }

    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        if(root == null){
            return true;
        }
        else{
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode toAdd = new StackNode(data);
        //StackNode temp = root;
        
        if(root == null){
            root = toAdd;
        }
        else{
            StackNode temp = root;
            root = toAdd;
            toAdd.next = temp;
        }
        System.out.println("Pushed the element "+data);


    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"

        int toRemove = Integer.MIN_VALUE;

        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(root == null){
            System.out.println("Stack Underflow!");
            return 0;
        }
        else{
            toRemove = root.data;
            root = root.next;
            System.out.println("Popped the element "+toRemove);
            return toRemove;
        }



    }
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        else{
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

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        {
            this.data=data;
        }
    }

    //Time Complexity=O(1)
    //Space Complexity=O(1)
    public boolean isEmpty() 
    { 
        return root==null;
        //Write your code here for the condition if stack is empty.

    }

    //Time Complexity=O(1)
    //Space Complexity=O(1)
    public void push(int data) 
    {
        //Write code to push data to the stack.
        StackNode newNode=new StackNode(data);
        if(root==null){
            root=newNode;
        }else{
            //Inserting before the head and updating the head
            newNode.next=root;
            root=newNode;
        }

    }

    //Time Complexity=O(1)
    //Space Complexity=O(1)
    public int pop() 
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(root==null){
            System.out.println("Stack Underflow");
            return 0;
        }
        int temp=root.data;
        root=root.next;
        return temp;

    }
    //Time Complexity=O(1)
    //Space Complexity=O(1)
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
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

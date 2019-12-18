public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data=data;
            this.next=null;
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if(root==null)
        {
            System.out.println("Stack is empty");
            return true;
        }
        else
            return false;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        if(root==null)
        {
            root=new StackNode(data);
        }
        else
        {
            StackNode nodes=root;
            StackNode first=nodes;
            while(nodes.next!=null)
            {
                nodes=nodes.next;
            }
            StackNode node=new StackNode(data);
            nodes.next=node;
            root=first;
        }
        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
        if(root==null)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            StackNode nodes=root;
            StackNode prev=root;
            StackNode first=prev;
            while(root.next!=null)
            {
                prev=root;
                root=root.next;
            }
            int num=root.data;
            prev.next=null;
            root=first;
            return num;
        }
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        if(root==null)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            StackNode nodes=root;
            StackNode first=nodes;
            while(root.next!=null)
            {
                root=root.next;
            }
            int num=root.data;
            root=first;
            return num;
        }
        //Write code to just return the topmost element without removing it.
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
         System.out.println("IS mthoed empty"+sll.isEmpty());
        sll.push(50);
         System.out.println(sll.pop() + " popped from stack"); 
    } 
} 

// Time Complexity: Here, I am using 1 for loop 2 times, so time complexity is O(n), where n is number of elements.

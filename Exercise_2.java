public class StackAsLinkedList { 
    //Time Complexity :- O(1)
    //Space Complexity :- O(n) 
    StackNode root; 
  
    int length;
    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data;
        }
    }

    StackNode head;
    StackNode tail;
    StackNode prev;
    
    public Main(){
        this.length = 0;
        this.head = null;
        this.tail = null;
        this.prev=null;
    }
    public boolean isEmpty() 
    {
        //Write your code here for the condition if stack is empty.
        return head==null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode newnode = new StackNode(data);
        //If you need to push it 2 condition you need to follow
        //1.Check it is empty first
        if(head == null){
            head = newnode;
            tail = newnode;
            prev = tail;
            length++;
        }
        //2.So it is not empty so point the tail to the new node
        else{
            tail.next = newnode;
            prev = tail;
            tail=newnode;
            length++;
        }
    } 
  
    public int pop() 
    { 	
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(head==null){
            System.out.println("Stack Underflow");
            return 0;
        }
        //keeping the tail data in the variable you created and assigning the previous node as tail and
        // pointing the previous pointer as null;
        int temp = tail.data;
        prev.next = null;
        tail = prev;
        length --;
        return temp;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        return tail.data;
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

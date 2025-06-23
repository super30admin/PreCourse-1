//Time Complexity: O(1)
//Space Complexity: O(n)
public class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Assigning the data
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Check if the the root it null, then stack is empty
        return this.root == null;
    } 
  
    public void push(int data) 
    { 
        //So the pushed data should always be at the starting of the linkedList as it will be O(1) to pop it
        //So create new StackNode with data and assigns its next to root
        //Then update the root value with newNode

        StackNode newNode = new StackNode(data);
        newNode.next = this.root;
        this.root = newNode;

    } 
  
    public int pop() 
    { 	
	//If Stack is empty then 0
    //Else store the value of root and update root to root.next, this removes the actual root

    if(isEmpty()){
        System.out.println("Stack Underflow");
        return 0;
    }

    int val = root.data;
    this.root = root.next;
    return val;
    
    } 
  
    public int peek() 
    { 
        //Just returning the value of root
        return this.root.data;
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

/*===== Submission Details ======
Student Name: Pavan Kumar K. N.
Email       : pavan1011@gmail.com
S30 SlackID : RN32MAY2021
=================================
*/
public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return (root == null);
    } 
  
    public void push(int data) 
    {
        StackNode newNode = new StackNode(data);

        if(root == null){
            root = newNode;
        }
        else{
            StackNode tempNode = root;
            root = newNode;
            newNode.next = tempNode;
        }
        System.out.format("Pushed %d to stack.\n", newNode.data);
    } 
  
    public int pop() 
    { 	
	   //If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow! Cannot pop from stack.\n");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        else{
            int poppedElement = root.data;
            root = root.next;
            //Also return the popped element 
            return poppedElement;
        }
    } 
  
    public int peek() 
    { 
        if(isEmpty()){
            System.out.println("Stack is empty. Nothing to see here...\n");
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

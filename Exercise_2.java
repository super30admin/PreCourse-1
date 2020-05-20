class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if (root == null){
            return true;
        }else{
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        StackNode new_node = new StackNode(data);
        // if stack is Empty then new node will be set as root
        if (isEmpty()){
            root = new StackNode(data);
        }else{
            // temp node is root
            // then set new node as root and its next as temp node
            StackNode tempNode = root;
            root = new_node;
            new_node.next = tempNode;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    //Also return the popped element 
        if(isEmpty()){
            return 0;
        }else{
            // get next of the current root, that will be new root after poping the element
            StackNode  node = root.next;
            int data = root.data;
            root= node;
            return data;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            System.out.println("STACK IS EMPTY");
            return 0;
        }
        else{
            return root.data;
        }
    } 
  
	//Driver code
    
    public void print_linkedList(){
        StackNode temp = root;
        System.out.print("Root -> ");
        while ( temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
} 

public class Exercise_2{
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
        System.out.println("current Elements in stack");
        sll.print_linkedList();
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
}

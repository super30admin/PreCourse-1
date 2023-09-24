
 // Time complexity is O(n)
// Space complexity is O(n)

public class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
            this.next = null;  
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return (root == null); 
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        if(isEmpty()) {
            root = new StackNode(data);
            System.out.println("First element is " + data + " pushed to stack @ memory address" + root);
        }

        StackNode newNode = root;
        while(newNode.next!= null) {
            newNode = newNode.next;
        }

        newNode.next = new StackNode(data); 
        System.out.println("New element is " + data + " pushed to stack @ memory address" + newNode.next);

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        StackNode temp = root;
        while(temp.next.next!= null) {
            temp = temp.next;
        }

        int tempData = temp.next.data;
        temp.next = null; 
        return tempData; 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()) {
            System.out.println("Empty Stack");
            return 0;
        }

        StackNode temp = root;
        while(temp.next!= null) {
            temp = temp.next;
        }
        return temp.data; 
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

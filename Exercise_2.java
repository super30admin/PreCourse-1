public class StackAsLinkedList { 
  //Time Complexity:  O(1)
  //Space Complexity: O(1)
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
           this.data =data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
         if (root == null) {
            return true;
        }
        else
            return false; 
    } 
  
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data);

        if (isEmpty()) {
            root = newNode;
        }
        else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack"); 
    } 
  
    public int pop() 
    { 	
	int popped = Integer.MIN_VALUE;
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        else {
            popped = root.data;
            root = root.next;
        }
        System.out.println("Popped value is " + popped);
        return popped;
    } 
  
    public int peek() 
    { 
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

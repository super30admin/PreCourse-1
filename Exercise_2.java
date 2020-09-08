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
       if(root == null) return true;
       else{
           return false;
       }
    } 
  
    public void push(int data) 
    { 
        StackNode node = new StackNode(data);
        if(root == null){
            root = node;
        }
        else{
        StackNode temp = root;
        root = node;
        node.next = temp;
        }
        System.out.println("element pushed in the stack is : " + data);
        
    } 
  
    public int pop() 
    { 	
        int popVal = Integer.MIN_VALUE;
         if(root == null){
             System.out.println("Stack Underflow");
             return 0;
         }
         else{
             popVal = root.data;
             root = root.next;
         }
         return popVal;
    } 
  
    public int peek() 
    { 
        if(root == null) return Integer.MIN_VALUE;
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

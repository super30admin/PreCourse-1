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
    
	
    public boolean isEmpty() 
    { 
      if(root==null){
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        if(root==null){
          StackNode a = new StackNode(data);
          root=a;
        }

        StackNode a = new StackNode(data);
        a.next=root;
        root=a;
    } 
  
    public int pop() 
    { 	
	if(root==null){
            return -1;
        }
       int a = root.data;
       root=root.next;
       return a; 
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

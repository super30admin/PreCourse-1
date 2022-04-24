
class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
           this.data=data;
           StackNode root = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return root==null;
    } 
  
    public void push(int data) 
    { 
        StackNode temp=new StackNode(data);
        if(temp==null){
         System.out.println("Stack overflow");
         return;
        }
        
        temp.next=root;
        root=temp;
         
    } 
  
    public int pop() 
    { 	
	if(isEmpty()){
        System.out.println("Stack Underflow");
        return 0;
        }
        StackNode cur = root;
        root=root.next;
        return cur.data;
        
    } 
  
    public int peek() 
    { 
        if(isEmpty()){
        System.out.println("Stack Underflow");
        return -1;
        }
        return root.data;
    }
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
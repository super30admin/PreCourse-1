public class StackAsLinkedList { 
  
    StackNode root;
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null; 
        } 
    } 
    
    StackAsLinkedList(){
        this.root = null;
    }
	
    public boolean isEmpty() 
    { 
        return this.root == null;
    } 
  
    public void push(int data) 
    { 
        if(root == null){
            root = new StackNode(data);
        }
        else{
            StackNode temp = new StackNode(data);
            temp.next = root;
            root = temp;
        }
    } 
  
    public int pop() 
    { 	
        if(root != null){
            StackNode temp = root;
            root = temp.next;
            return temp.data;
        }
        return -1;
    } 
  
    public int peek() 
    { 
        if(root != null){
            return root.data;
        }
        return -1;
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

public class Exercise_2 {
  
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
        return root==null;
    } 
  
    public void push(int data) 
    {
        StackNode temp = new StackNode(data);

        temp.next = root;
        root = temp;
    }
  
    public int pop() 
    {
        if(root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }else {
            int x = root.data;
            root = root.next;
            return x;
        }
    } 
  
    public int peek() 
    {
        if(root == null){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return root.data;
        }
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

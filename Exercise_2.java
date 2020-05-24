public class Exercise_2{ 
  
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
        return (root== null);
    } 
  
    public void push(int data) 
    { 
        StackNode new_element = new StackNode(data);
        if(root== null){
            new_element.data=data;
            new_element.next = null;
            root = new_element;
        }else{
            new_element.data = data;
            new_element.next = root;
            root = new_element;
        }
     
    } 
  
    public int pop() 
    { 	
	   if(root== null){
           System.out.println("Underflow");
           return 0;
       }else{
           int poppedElement = root.data;
           root= root.next;
           return poppedElement;
       }
    } 
  
    public int peek() 
    { 
        if(!isEmpty()){
            return  root.data;
        }else{
            System.out.println("Underflow");
            return -1;

        }
        //Write code to just return the topmost element without removing it.
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

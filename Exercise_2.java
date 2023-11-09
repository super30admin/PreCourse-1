public class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data, StackNode next) 
        { 
            this.data = data;
            this.next = next;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
       return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        root = new Exercise_2.StackNode(data, root);  
    } 
  
    public int pop() 
    { 	
     int dataToPop = 0;
	 if(isEmpty()){
        System.out.println("stack underflow");
     } else{
        dataToPop = root.data;
        root = root.next;
     }
     return dataToPop;
    } 
  
    public int peek() 
    { 
       int dataToPop = 0;
	 if(isEmpty()){
        System.out.println("stack underflow");
     } else{
        dataToPop = root.data;
     }
     return dataToPop;
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

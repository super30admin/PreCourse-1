class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top <= 0) {
        	return true;
        }
        else {
        	return false;
        }
    } 

    Stack() 
    { 
        top =0;
        a= new int[MAX];
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if(top >= MAX) {
    		System.out.println("The stack is full");
    		return false;
    	}
    	a[top++] = x;
    	return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	 if (top == 0) {
    		 System.out.println("The stack is empty");
    		 return 0;
    		 
         }
         return a[--top];
    } 
  
    int peek() 
    { 
    	if (top == 0) {
   		 System.out.println("The stack is empty");
   		 return 0;
   		 
        }
        return a[top-1];
    } 
} 
  
// Driver code 
class Exercise_1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        
        s.push(30); 
        System.out.println(s.peek() + " Currently at the top");
        System.out.println(s.pop() + " Popped from stack"); 
        s.push(40); 
        System.out.println(s.peek() + " Currently at the top");
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}

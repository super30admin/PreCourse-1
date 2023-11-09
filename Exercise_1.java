class Stack { 
    //TimeComplexity: O(1);
    //Space complexity : O(n);
 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    public boolean isEmpty(){ 
        //Write your code here 
        if(top == -1){
           return true;
    	} else{
            return false;
        }
    }

	public void Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    public boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        
        if(top >= 1000){
            System.out.println("Stack is Full");
            return false;
    } else{
            a[top] = x;
            top++;
             return true;
        }
       
    }
  
    public int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == -1){
            System.out.println("Stack is empty");
            return 0;
    } else{
            int value = a[top-1];

            top--;
            
            return value;
            
        }
    }
  
    public int peek() 
    { 
        //Write your code here
         if(top == -1){
            System.out.println("Stack is empty");
            return -1;
    } else{
            int value = a[top-1];
            return value;
        }
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}

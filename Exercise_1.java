class Stack { 
    static final int MAX = 1000; 
    int top = -1; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return a.length == 0;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        a = new int[MAX]; 

    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top+1 < MAX){
            top = top + 1;
            a[top] = x;
            return true;
        }
        else{
            return false;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == -1){
            System.out.println(" Stack Underflow");
            return 0;
        }
        else{
            int ans = a[top];
            top = top - 1;
            return ans;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[top];
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
        System.out.println(s.peek() + " Peek from stack"); 
        System.out.println(s.pop() + " Popped from stack");
        s.push(12);
        System.out.println(s.peek() + " Peek from stack");
        if(!s.isEmpty()) System.out.println("not empty");
        
         
    } 
}

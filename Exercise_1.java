/**
 * Time Complexity:
 * isEmpty() : O(1)
 * push() : O(1)
 * pop() : O(1)
 * peek() : O(1)
 *  */ 
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(a.length==0){
            return true;
        }
        return false; 
    } 

    Stack() 
    { 
        top=-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top>MAX){
            System.out.println("Cannot enter "+x+" as the stack is full");
            return false;
        }
        else{
            a[top+1]=x;
            top++;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()){
            System.out.println(" Stack Underflow");
            return 0;
        }
        else{
            int result = a[top];
            top--;
            return result;
        }
        
    } 
  
    int peek() 
    { 
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
    } 
}

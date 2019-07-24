
    
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
      if(top==-1)
      return true;
      else
      return false;
        //Write your code here 
    } 

    Stack() 
    { 
      top=-1;
    } 
  
    boolean push(int x) 
    { 
      if(top==999)
        return false;
      else
      {
        top++;
        a[top]=x;
      }
      return true;
        //Check for stack Overflow
        //Write your code here
    } 
  
    int pop() 
    { 
      if(isEmpty())
      {
        System.out.println("Stack Underflow");
        return 0;
      }
      else
      {
        top--;
      }
        return a[top+1];
    } 
  
    int peek() 
    { 
        if(isEmpty())
        return -1;
        
        return a[top];
    } 
    
} 
  
// Driver code 
public class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}


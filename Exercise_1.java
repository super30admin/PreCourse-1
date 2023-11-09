class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(a.length == 0)
        {
            return true;
        }
        else
        return false;
    } 

    Stack() 
    { 
        top = 0;
    } 
  
    boolean push(int x) 
    { 
        if(top != a.length-1)
        {
            a[top++] = x;
            
            return true;
        }
        else 
        return false;
    } 
    
    int pop() 
    { 
        if(!isEmpty())
        {
            return a[--top];
        }
        else{
        // Not sure how to print Stack Underflow
        return 0;
     } 
}
    
  
    int peek() 
    { 
        return a[top-1];
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
        
        System.out.println(s.peek() + "Peeked from stack\n"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack");
        
    } 
}

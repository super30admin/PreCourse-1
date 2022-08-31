class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
 // Time Complexity  O(1)
// Space Complexity  O(1)

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return(top<0);
        //returns true if top <0 and false if top>0
    } 

    Stack() 
    { 
        top=-1;
        //initializing top to
    } 
  
    boolean push(int x) 
    { 
        if(top==MAX-1)
        {
        System.out.println("stack overflow");
        return false;    
        }
        else{
        top++; //incrementing the value of top
        
        a[top]=x;  //pushing a new element at new position
        System.out.println("element pushed successfully");
        return true;    
    
        }
    }
  
    int pop() 
    { 
        if (top==-1) //if top= -1 stack is empty
        {
            System.out.println("Stack Underflow");
        }
        else{
        top--;
        System.out.println( " top element popped from stack");     
        }
       return 0;
    } 
  
    int peek() 
    { 
        if(top==-1)
        {
            System.out.println("stack is empty");
           
        }
        else
        {
          System.out.println(a[top] + "is the element present at top of the stack"); //printing top element in stack
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
        s.pop();
        s.peek();
      
        
    } 
}

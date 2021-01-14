class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
    int x;
    int ans ; 
    boolean isEmpty() 
    { 
        //Write your code here 
        if ( top <0 )
         { return  true; }
        
        else
            { return false; }
       
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
            
        
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if ( top !=1000-1)
        {
            a[top+1] = x;
            top++;
            return true;
        }

        
        System.out.println("Stack Overflow");
        return false;
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
         if ( isEmpty() == true)
            {
              System.out.println ("Stack Underflow");
               return 0 ;
            }

         else {   
             
                 return a[top--];
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
        // s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() );
        System.out.println(s.pop() );

        
    } 
}

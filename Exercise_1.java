class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    int index=-1;
    //int popIndex =0;

    boolean isEmpty() 
    { 
        //Write your code here 

        return a==null;
    } 

    Stack() 
    { 
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 


        if(index>MAX-1)
        {
            
            return false;    


        }
        else
        {
            a[++index]=x;
            // index++;
            return true;
        }
        //Check for stack Overflow
        //Write your code here
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
         if(a==null || index<0)
        {
            System.out.println("Stack is Empty");
          return 0;

        }
        else
        {
            int value= a[index--];
            return value;

        }

    } 
  
    int peek() 
    { 
        //Write your code here
        if(index<0)
        {
            return -1;
        }
        else
            return a[index];
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
        
        // Additional Test Cases
       System.out.println("Peek value of Stack "+s.peek());

        

       
      
    } 
}

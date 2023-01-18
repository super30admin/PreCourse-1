class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return (top < 0);  
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
        
        if (top == a.length-1 )   {
        System.out.println("\n Overflow"); 
        return false; 
        }
        else   
        {  
        top = top +1;   
        a[top] = x;   
        return true;
        }   
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        int pop=0;
        if (top == -1)  
        {  
            System.out.println("Underflow !!");  
            return 0;  
        }  
        else   
        {  
            pop= a[top];
            top --;   
            return pop;  
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
    } 
}

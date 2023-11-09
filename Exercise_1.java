//Time complexity: O(1)
//Space complexity : O(n)
//Successfully executed on leetcode

class Stack2 { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    
    
    static final int MAX = 1000; 
    int top = 0; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(a[top] == 0)
            return true;
        else
            return false;
    } 

    Stack2() 
    { 
        //Initialize your constructor 
        a = new int[]{9,5,2};
        
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top == MAX)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else{
        a[top+1] = x;
        top = top+1;
        return true;
        }
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        int pop_value;
        if(top == 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            pop_value =  a[top];
            a[top] = 0;
            top = top-1;
            return pop_value;
        }

    } 
  
    int peek() 
    { 
        //Write your code here
        if(top == 0)
        {
            return 0;
        }
        else{
            return a[top];
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

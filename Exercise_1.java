class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
  // Time Complexity for push and pop(best case)- O(1). (Worst case) - O(1000)
  //Space Complexity - O(1000)
    static final int MAX =1000; 
    int top = 0; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return top <= 0;
    } 

    Stack() 
    { 
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        
        if(top < MAX)  // size
        {       
        a[top] = x; 
        top++;
        return true;     
        }
        else{
            System.out.println("Stack Overflow");
            return false;
        }

    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(!isEmpty())
        {
        int x = 0;
        top --;
        x = a[top];
        a[top] = 0; //removing the element
       
        return  x;
        }
        else{
            System.out.println("Stack Underflow");
            return 0;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
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
        System.out.println(s.peek() + " Popped from stack"); 
    } 
}

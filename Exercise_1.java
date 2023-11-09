
// Time Complexity : O(1) for isEmpty(),push(),pop(),peek()
// Space Complexity : O(N)
class Stack {
   //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
  static final int MAX = 1000; 
  int top; 
  int a[] = new int[MAX]; // Maximum size of Stack 
  boolean res = false;
  boolean isEmpty() 
  { 
      //Write your code here 
      if(top<0)
       {
           res = true;
       }

     return res;
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
      if(top>MAX)
      {
          System.out.println("Stack Overflow");
          return false;
      }
      else
      {
        top++;
      a[top] = x;
      return true;
      }
  } 

  int pop() 
  { 
      //If empty return 0 and print " Stack Underflow"
      //Write your code here
      if(isEmpty())
      {
        System.out.println("Stack Underflow");
        return 0;
      }
      else
      {
          return a[top--];
      }

  } 

  int peek() 
  { 
      //Write your code here
      int tp = a[0];
      System.out.println("the top element is :"+tp );
      return tp;
  } 
}

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

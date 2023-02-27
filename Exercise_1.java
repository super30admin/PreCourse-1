public class Stack {
    //Please read sample.java file before starting.
  //Time complexity - O(1); Space complexity - O(1)
  static final int MAX = 1000; 
  int top; 
  int a[] = new int[MAX]; // Maximum size of Stack 

  boolean isEmpty() 
  { 
      return top <  0 ;
  } 

  Stack() 
  { 
      //Initialize your constructor 
      top = -1;
  } 

  boolean push(int x) 
  { 
    if (top >= (MAX-1))
    {
        System.out.println( " stack is full");
        return false;
    }
    else 
    {
        top++;
        a[top] = x ;
        System.out.println(x);
        return true;
    }
  } 

  int pop() 
  { 
    
      int x;
      if((isEmpty()))
      {
        System.out.println(" Stack is Empty");
        return 0;
      }
      else 
      {
        x= a[top];
        a[top] = 0 ;
        top --;
        return x;
      }
  } 

  int peek() 
  { 
      //Write your code here
      int x;
      x = a[top-1];
      return x;
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

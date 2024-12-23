class Stack { 
   //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file

// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this : No


    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top==-1){       ///checks if stack is empty or not and returns true or false
            return true;
        }
        
        return false;
        
    } 

    Stack()    //Constructor which initializes top
    { 
        //Initialize your constructor 
        top=-1;
    } 
  
    boolean push(int x)     
    { 
        if(top == MAX-1){                           //checks if stack is full or not if not full then it will increment the top and push
            System.out.println("Cannot Push");
            return false;
        }
        else{
            top=top+1;
            a[top] = x;
            return true;
        }
        //Check for stack Overflow
        //Write your code here
    } 
   
    int pop()                   //this function is for poping an element from stack
    { 
        if(isEmpty()){           //Checks if it is empty
            System.out.println("Stack Underflow");
            return 0;
        } 
        else{                    //if not empty then it will pop the element and return the value
            int x = a[top];
            top=top-1;
            return x;
        }
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek()                  //This function returns the top element in the stack
    { 
        if(!isEmpty()){//Write your code here
        return a[top];
        }
        else{
            System.out.println("Stack is empty");
            return -1;
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

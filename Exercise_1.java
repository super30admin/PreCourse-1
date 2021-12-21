// Time Complexity : O(1) Reason: because we do not run any for loop 
// Space Complexity : O(1)  Reason: we can push() and pop() through the array everytime one at a time
// Did this code successfully run on Leetcode : The code ran successfully in the Visual Code Studio but on leetcode it is unable to detect print()
// Any problem you faced while coding this : Starting with the basics, i did not know what was Stack and how to write all methods for stack,
//  but i took help from google and understood Stacks and started implementing Stacks using java where i realized that i had to implement it using Array, so i studied what are Arrays and how does it work.
// I faced many errors but then at the end i was able to fix all the problems, but i am not quite sure why there are no problems in VS while i am getting some issues on Leetcode.



// Your code here along with comments explaining your approach




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
        
        if(top >= (MAX - 1)) {

            System.out.println("Stack is full");
            return false;

        }
         
        // Write your code here

        else{
            a[++top] = x;
            return true;
        }
        

    }
    

  
    int pop() 
    { 
        //  If empty return 0 and print " Stack Underflow"
        if(top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;

        }
        //Write your code here
        else {
            int x = a[top--];
            return x;
        }
        
     
        
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top < 0)
        {
            System.out.println("Stack is empty");
            return 0;

        }
        //Write your code here
        else {
            int x = a[top];
            return x;
        }
   
    } 
    void print(){
        for(int i = top;i>-1;i--){
          System.out.print(" "+ a[i]);
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
      s.print();
      

        
    } 
}

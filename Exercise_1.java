// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :  I did not find this question on leetcode
// Any problem you faced while coding this : I did mistake when performing pop() operation, i figured that top represents next available index in stack not current.


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
        return top == 0;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = 0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top == a.length){
            System.out.println("Stack Overflow");
            return false;
        }

         //Write your code here
  
        a[top] = x;
        top++;

         return true;
   
   } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top == 0){
            System.out.println("Stack Underflow");
            return 0;
        }
         //Write your code here
            int topValue = a[top - 1];
            top--;
            
      
        return topValue;

       
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top > 0)
        return a[top - 1];

        else return 0;
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
        System.out.println(s.peek() + " Peeked from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
      
    } 
}

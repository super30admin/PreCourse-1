// Exercise_1 : Implement Stack using Array.

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    //Time Complexity - O(1)
    boolean isEmpty() 
    { 

        return this.top == -1;

    } 

    Stack() 
    { 
        //Initialize your constructor
        this.top = -1; 
    } 
  
    //Time Complexity - O(1)
    //space complexity - O(1)
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here       
        if(this.top == MAX-1){
            return false;
        }
        this.top++;
        this.top = x;
        return true;
    } 
  
    //Time Complexity - O(1)
    
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(this.top == -1){
            System.out.println(" Stack Underflow");
            return 0;
        }
        int temp = this.top;
        top--;
        return temp;

    } 
    
    //Time Complexity - O(1)
    int peek() 
    { 
        //Write your code here
        return this.top;
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

//Time Complexity: O(1)
//Space Complexity: O(n) 

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
       if(this.top == -1){
        return true;
       }else{
        return false;
       }
    } 

    Stack() 
    { 
        //Initialize your constructor 
        this.top = 0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(this.top == 1000){
            return false;
        }else{
            a[this.top] = x;
            this.top++;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here

        if(this.top == 0){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int val = a[this.top-1];
            a[this.top] = 0;
            this.top--;
            return val;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[this.top-1];
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
        s.push(40);
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.peek());
    } 
}

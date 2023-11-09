/*
Time complexity - O(n)
Space complexity - O(n)
*/
class Stack { 
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[]; 
  
    boolean isEmpty() 
    { 
        return top == -1 ? true : false; 
    } 

    Stack() 
    { 
        //Initialize your constructor
        this.a = new int[MAX];
        this.top = -1;
    } 
  
    boolean push(int x) 
    { 
        if(top + 1 >= MAX)     //Check for stack Overflow
            return false;
        else
            a[++top] = x;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        else
            return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty()){
            System.out.println("Stack empty");
            return 0;
        }
        else
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

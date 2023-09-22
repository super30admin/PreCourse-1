//Time complexity - O(1)
//Space complexity - O(1)
//code sucessfully run on the local
//I didnt face any problem while coding this
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top == -1){
            return true;
        }
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top == a.length - 1){
            System.out.println("Stack Overflow");
            return false;
        }else{
            top++;
            a[top] = x;
            System.out.println("Element pushed to the stack " + x);
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == -1){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int popValue = a[top];
            top--;
            System.out.println("Element is poped from the stack " + popValue);
            return popValue;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top == -1){
            System.out.println("Stack is empty");
            return 0;
        }else{
            System.out.println("Element peeked " + a[top]);
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

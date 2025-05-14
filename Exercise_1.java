

class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top = -1;
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if (top == -1){
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
        if (top == a.length-1){
            System.out.println("Stack is full");
            return false;
        }
        else {
            top++;
            a[top] = x;
        }

       return true;
    }
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (isEmpty() == true){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return a[top--];
        }
       // return 0;
    }
  
    int peek() 
    { 
        //Write your code here
        if (top == a[top]){
            System.out.println("Current element is at index: " +top);
        }
        return 0;
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

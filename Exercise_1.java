class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack


    Stack()
    {
        //Initialize your constructor
        top = -1;
    }

    boolean isEmpty() 
    { 
        //Write your code here
        return a.length == 0;
    } 

    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if (top < MAX){
            a[++top] = x;
            return true;
        }

        return false;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top == -1){
            System.out.println("Stack UnderFlow");
            return 0;
        }
        int temp = a[top--];
        return temp;
    } 
  
    int peek() 
    { 
        //Write your code here
        if (top == -1){
            System.out.println("Stack UnderFlow");
            return 0;
        }
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

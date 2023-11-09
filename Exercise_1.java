class Stack { 
  //time complexity is O(1) as we are implementing the stack by using only assigning the top th element, rendering the top th element.
  //space complexity is O(MAX), here we can consider it as constant as MAX is constant always
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //If value of top is -1, it means array don't has values so considering it as empty. If value of top is other than 0, stack is not empty.
        return top==-1; 
    } 

    Stack() 
    { 
        //Initialize your constructor 
        //Initialising value of top with -1. As value pushes to stack, top will increase by 1. By taking this approach, we can easily implement peek function without any logic
        //by simply returning top th element of array. Similaryly pop function will implement by returning top th element and reducing top by 1.
        //push function can implement by increasing top by 1 and assign the top th element by pushed value.
        top = -1;
        
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top==MAX)
            return false;
        a[++top]= x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top==-1)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        top = top-1;
        return a[top+1];
    } 
  
    int peek() 
    { 
        if(top==-1)
        {
            return 0;
        }
        return a[top];
    } 
} 
  
// Driver code 
public class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
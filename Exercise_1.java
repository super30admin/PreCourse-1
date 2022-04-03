// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run: Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Stack { 
    //Exercise_1 : Implement Stack using Array.

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
     
    //Driver code
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " popped from stack"); 
        System.out.print("Elements present in stack :");
        s.print();
    } 
    boolean isEmpty() 
    {
        return top<0;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top=-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top>=MAX-1){
            System.out.println("Stack overflow");
            return false;
        }
        else{
            a[++top]=x;
            System.out.println(x+" pushed into stack");
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write your code here
        else{
            int x=a[top--];
            return x;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int x=a[top];
            return x;
        }
    } 
    void print(){
        for(int i = top;i>-1;i--){
          System.out.print(" "+ a[i]);
        }
    }
} 
  

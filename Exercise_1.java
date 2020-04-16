/**
    1. isEmpty() => Time complexity is O(1)
                    Space complexity is O(1)

    2. push() => Time complexity is O(1)
                 Space complexity is O(1)
    
    3. pop() => Time complexity is O(1)
                Space complexity is O(1)

    4. peek() => Time complexity is O(1)
                 Space complexity is O(1)
  */
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return top == -1;
    } 

    Stack() 
    { 
        top = -1;
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top<MAX-1){
            top++;
            a[top] = x;
            return true;
        }else{
            return false;
        }
        
    } 
    
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == -1){
            System.out.println(" Stack Underflow");
            return 0;
        }else{
            int temp = a[top];
            top--;
            return temp;
        }
        
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top!=-1)
            return a[top];
        else
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

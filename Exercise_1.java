// Time Complexity: O(1) for push, pop, and peek operations
// Space Complexity: O(1) where n is the maximum size of the stack
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top;
    int topIndex = -1;
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (topIndex == -1);
    } 

    Stack() 
    { 
        a = new int[MAX];
    } 
  
    boolean push(int x) 
    { 
        topIndex++;
        //Check for stack Overflow
        if(topIndex == MAX){
            System.out.println("Stack Overflow");
            return false;
        }
        //Write your code here
        a[topIndex] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(topIndex == -1){
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write your code here
        int res = a[topIndex];
        a[topIndex] = 0;
        topIndex--;
        return res;
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[topIndex];
    } 
} 
  
// Driver code 
class ArrayStack { 
    public static void main(String args[])
    { 
        Stack s = new Stack(); 
        System.out.println(s.push(10)); 
        System.out.println(s.push(20)); 
        System.out.println(s.push(30)); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.push(40)); 
        System.out.println(s.push(50)); 
        System.out.println(s.peek()); 
        System.out.println(s.peek()); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}

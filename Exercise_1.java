//Time Complexity : O(1)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : Had to change class name as IDE already had stack imported


class Stack_1{ 

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top == -1){
            return true;   // using top value assigned to check if array/stack is empty.
        }
        return false;
    } 

    Stack_1() 
    { 
        top = -1;  // -1 to indicate array is empty.
    } 
  
    boolean push(int x) 
    { 
        if(top < MAX){
            top++;
            a[top] = x;    // if space is there, increment top to know the last input and push value into stack
            return true;
        }
        return false;
    } 
  
    int pop() 
    { 
        if(isEmpty()){
            System.out.println(" Stack Underflow ");   //using isEmpty() to check underflow
            return 0;
        }
        int result = a[top];    //if not empty popping the last element using top index
        top--;
        return result;
    } 
  
    int peek() 
    { 
        if(!isEmpty()){
           return a[top]; //checking for isEmpty() stack before peek and showing peek object
        }
        System.out.println(" Stack Underflow ");   
        return 0;
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack_1 s = new Stack_1(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}

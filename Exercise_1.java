// Time Complexity : For each operation, O(1)
// Space Complexity : Constant space complexity O(1) although space is wasted because of the fixed size of array
/* Did this code successfully run on Leetcode : Ran on sample test cases including 
 
1. Checking if stack is empty
2. Popping from empty stack
3. Push elements into stack and then popping elements

*/
// Any problem you faced while coding this : None



class Stack { 
   
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == -1;
    } 

    Stack()
   
    {
        a[top] = 10;
        a = new int[MAX];
        top = -1;
        
    } 
  
    boolean push(int x) 
    { 
        if(top < MAX) {
            top++;
            a[top] = (int)x;
            
            return true;
        }
        return false;
    } 
  
    int pop() 
    { 
        if(isEmpty()) {
            return 0;
        }
        int poppedInt = a[top];
        top--;
        return poppedInt;
    } 
  
    int peek() 
    { 
        if(top >=0 && top < a.length)
            return a[top];
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
        s.push(40);
    } 
}
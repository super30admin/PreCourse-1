// Time Complexity : isEmpty() - O(1), pop() : O(1) , push() : O(1) , peek() : O(1)
// Space Complexity : O(N) -- where N is the size of the array we're creating to use as stack
class Stack {
    static final int MAX = 1000;
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        // If top is pointing to 0th index of array then stack is empty
        if (top == 0) {
            return true;
        }
        else {
            return false;
        }
    } 

    Stack() 
    {
        top = 0; // Point top to 0th index of array in the beginning
    } 
  
    boolean push(int x) 
    {
        if (top < MAX) {
            a[top+1] = x; // insert x at the top + 1 index
            top++; // increment top value by 1 as we have inserted new element in stack
            System.out.println(x + " Pushed to stack");
            return true;
        }
        else{
            // If we don't have extra space to insert the new element then print "stack overflow"
            System.out.println("Stack Overflow");
            return false;
        }
    } 
  
    int pop() 
    {
        if (isEmpty()) {
            // If stack is empty then we can't do pop operation. So print "Stack Underflow"
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int poppedNum = a[top]; // save value pointed by top element in poppedNum and return it
            top = top - 1; // point top to -1 index now as we have removed an element from stack
            return poppedNum;
        }
    } 
  
    int peek() 
    {
        if (!isEmpty()) { // If Stack is not empty then return value pointed by top
            return a[top];
        }
        else{
            return 0;
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
        System.out.println("Top element is : " + s.peek());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is : " + s.peek());
    } 
}

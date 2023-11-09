class Stack { 
    // Time Complexity : Push Operation is O(1) since we only look at the stack top and push/insert the element at that index of the array.
    //////////////////// Pop Operation is also O(1) since we directly pop the element at the stack top 
    // Space Complexity : Depends on the list of elements, if N elements are stored, O(N)
    // Did this code successfully run on Leetcode : Not Applicable
    // Any problem you faced while coding this : 1) At first, I tried utilizing the index 0 in the array to store elements, however  
    //that was causing trouble as my condition for an empty array is top == 0, if the 0th index is allowed to store array elements, then
    //my condition for the  empty array has to be different. 2) Pre-increment or post-increment the stack top pointer: the pointer must 
    // always point to the last element that was pushed, if I use a[top++]-> it means the pointer will point to the index of the next 
    // element to be pushed and not the last element - this led to incorrect output for the s.pop() operation


    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Check if the array is empty
        if(top == 0) return true;
        else return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        //The array has already been initialized above, and a pointer to the top has been declared - we can initialize that pointer here
        top =0;

    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top >= MAX)
        {
            return false;
        }
        //Write your code here
        a[++top] = x;
        //System.out.println("Pushed this: " + a[top] + " and the value of top is " + (top));
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }

        //Write your code here
        //System.out.println("The value of top is: " + top);
        return a[top--];
    } 
  
    int peek() 
    { 
        if(isEmpty()) return 0;
        //Write your code here
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
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        s.push(40);
        System.out.println(s.pop() + " Popped from stack"); 

    } 
}

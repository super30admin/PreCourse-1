class Stack {
//Please read sample.java file before starting.
//Kindly include Time and Space complexity at top of each file

// Time Complexity : O(1)
// Space Complexity : O(MAX)

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        //this will check if the stack is empty
        return (top < 0);
    } 

    Stack() 
    {
        //When top=-1, it means the stack is empty so initializing it
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        /*
            Here we check two scenarios:
            1. In above constructor, the top starts at -1, but as this is an array based scenario,
                while inserting the first element, we need to have top = 0, so in else part we
                increment the top first and then insert the element.
            2. As mentioned, we need to check Stack Overflow, this is only possible if
                array is out of bounds, as in step 1, we are incrementing top before inserting the
                elements in it, so when we have already inserted the last element in stack before it
                overflows and top will be MAX-1, so now when we try to push the element again, if top
                is already MAX-1, it won't insert again as we need to increment top before inserting
                the element which will cause Stack Overflow. Hence, we check top >= (MAX - 1).
         */

        if (top >= (MAX - 1))
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
            return true;
        }

    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        /*
            1. if top is less than 0. means the stack is empty, and we cannot pop an element.
            2. if top is more than 0, suppose it is 1, we return the element at a[1] and then
                decrement the value of top, top-- so top = 0.
         */
        if(top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            return a[top--];
        }
    } 
  
    int peek() 
    {
        /*
            Peek method is to get the element at the top of the stack without
            removing it, so here we don't decrement top as we are not changing
            the index of the top in array, we are just retrieving the element.
         */
        if (top < 0)
        {
            System.out.println("No Element in the Stack");
            return 0;
        }
        else {
            return a[top];
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
        System.out.println(s.pop() + " Popped from stack");
    } 
}

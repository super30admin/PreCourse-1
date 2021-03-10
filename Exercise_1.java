// Time Complexity : O(1)
// Space Complexity : O(N) where N is the number of elements in the stack
// Did this code successfully run on Leetcode : Not on Leetcode
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach

class Stack {
    //I have used a simple Array along with a currentCapacity integer to store the current length on the Stack.

    static final int MAX = 1000;
    int currentCapacity;
    int a[]; // Maximum size of Stack


    // Initialise the Array and currentCapacity variable
    Stack()
    {
        this.currentCapacity = 0;
        this.a = new int[MAX];
    }
    // Using currentCapacity variable check if the Stack is empty
    boolean isEmpty()
    {
        if (this.currentCapacity == 0){
            return true;
        }
        return false;
        //Write your code here
    }
    // Using currentCapacity variable check if the Stack is at max capacity, if yes return False else update set the currentcapacity index of the Array to the pushed value and increment currentCapacity and return True
    boolean push(int x)
    {
        if (this.currentCapacity == MAX){
            return false;
        }
        a[this.currentCapacity++] = x;

        System.out.println(this.currentCapacity);
        return true;

    }
    // Using currentCapacity variable check if the Stack is empty,if yes return 0, else return the value at the index currentcapacity-1 from the Array and decrement currentCapacity.
    int pop()
    {
        if (this.currentCapacity == 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[--this.currentCapacity];
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    }
    // Return the value at the index currentcapacity-1 from the Array
    int peek()
    {
        return a[this.currentCapacity-1];
        //Write your code here
    }
}

// Driver code
class Exercise_1{
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}

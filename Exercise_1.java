/*
 Time Complexity:
    isEmpty(), peek(), pop() - O(1) constant time
    push() - O(1) Best case when array is not full
             O(n) Worst Case when array is full (in order to copy all elements into a new array)
 Space Complexity: O(n) to store all n elements in array
 Any problem faced while coding this: Wasn't sure on what to return in peek() operation when stack is empty.
*/

 /*
Stack is a LIFO data structure. So push() and pop() operations should happen on the same end.
Push - As we push elements into stack, it could run of capacity which could lead to runtime errors. 
       Hence added condition to check for max size utilization before adding elements to stack.
       If the stack still has capacity for more elements, add them to currenttop+1 index position in the array.
Pop - Removing elements from an empty stack could lead to runtime error as top would be -1 when empty.
      Added isEmpty() check to avoid that.For case when stack is not empty, reduce top by 1 and the element
      will not be part of stack anymore.
Peek - Top gives the index position of topmost element which is a constant time operation.
*/
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == -1;
    } 

    Stack() 
    { 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top == MAX-1){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            a[++top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return a[top--];
        }
    } 
  
    int peek() 
    { 
        if(isEmpty()) return 0;
        else return a[top];
    } 

    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}

// Time Complexity : push - O(1), pop - O(1), peek - O(1)
// Space Complexity : O(1)

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Check if the top element is < 0, that means the stack is empty as "Top" keeps track of the top of the stack.
        if(top==-1){
            return true;
        }else{
            return false;
        }
    } 

    Stack() 
    { 
        //stack should be initially empty, hence top =-1
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top == MAX-1){
            // If the index of the topmost element is equal to the max size of the stack, then the satck is full, hence overflow
            System.out.println("Stack Overflow, cannot insert item");
            return false;
        }
        else{
            //increase top by 1 to point to the newwest element.
            top = top +1;
            a[top]=x;
            return true;
        }
        //Write your code here
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top == -1){
            System.out.println("Stack Underflow, no item to pop");
            return -1;
        }
        else{
            //decrement top by 1 to point to the previous element, now that's the top most element in the stack.
            int temp = a[top];
            top = top - 1;
            return temp;
        }
    } 
  
    int peek() 
    { 
        //returning the top most element of the stack
        return a[top];
    } 
} 
  
// Driver code 
class Exercise_1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}

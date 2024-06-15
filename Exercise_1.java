/*Time Complexity: isEmpty()=push(int)=pop()=peek()--> O(1) Since there is no iteration involved in running them.
Space Complexity: O(1000)//Size of stack
Could not find the same problem in leetcode 
File name and class name was not matching when running the code in local

Approach:
Constructor-> Initialised a top variable with -1 to decide if the stack is full or not.
push(x)-> Checked if the stack is full and printed Overflow or if it is not full increment the top variable and push the new value in to the stack then returned true to confirm the push is successful.
pop()->Checked if the stack is empty then returned 0 or else returned the value at the top of the stack.
peek()->checked if the stack is empty then return -1 or if there is any element present then returned the respective top element.
*/


class Stack { 
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top==-1){
            return true;
        }
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top=-1;

    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top>=MAX){
            System.out.println("stack Overflow");
            return false;
        }
            top++;
            a[top]=x;
            return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        int v=a[top];
        a[top]=0;
        top--;
        if(top==-1){
            System.out.println(" Stack Underflow");
            return 0;
        }
        return v;
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top==-1){
            return -1;
        }
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

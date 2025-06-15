
class Stack { 
//Please read sample.java file before starting.
//Kindly include Time and Space complexity at top of each file
/* Time Complexity
 * isEmpty() - O(1)
 * push() - O(1)
 * pop() - O(1)
 * peek() - O(1)
 */
/* Space Complexity : O(n) (where n = number of elements pushed in the stack) */
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack
    /* Approach for isEmpty():
     * The top variable is used to show the current index of the stack, so if the stack is empty top wil be -1 and Hence we can return true if top == -1
     */
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top == -1) return true;
        return false;

    } 
    /* When the constructor is called top variable is assigned -1, indicating the current index of stack and also that the stack is empty */
    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  /* This function is used to add an element at the end of the array or top of the stack.
   * First we will increment the top variable to point at the next index of the stack.
   * Then we will check if the top variable is greater than or equal to the maximum size of the stack, if it is then we will decrement the top variable and return false indicating Stack overflow.
   * Else we will assign the value of x to the current index of the stack represented by the top variale and return True, indicating the element was successfully inserted in the stack.
   */
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        top++;
        if(top>=MAX){
            top--;
            return false;//stack overflow
        }
        else{
            a[top] = x;
            return true;
        }
    } 
  /*This function is used to delete the element present at the last index represented by top or in stack terms we are going to remove the element present at the top(which was inserted at Last) 
   * First we will check if stack is empty or not by checking if top is -1, if it is then we will print Stack Underflow and return 0.
   * Else we will store the value of the element present at the top index in a variable called deletedElement.
   * Since we are suppose to delete the last element we will decrement the top variable by 1 
   * Finally, we will return the deletedElement.
  */
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == -1){
            System.out.println("Stack Underflow");
            return 0;
        }
        
        int deletedElement = a[top];
        top--;
        return deletedElement;
    } 
  /*This function returns the top element of the stack or the last element inserted in the stack or the last element present in the array represented by the top variable.
   * First, we will check if stack is empty or not by checking if top is -1, if top == -1 then we will print Stack Underflow and return 0.
   * Else we will return the value present at the top index of the stack.
   */
    int peek() 
    { 
        //Write your code here
        if(top == -1){
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top]; // return the top element of stack
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

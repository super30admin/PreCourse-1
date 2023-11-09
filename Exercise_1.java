// Time Complexity : O(1) for Push,Pop,Peek and IsEmpty operations.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : It ran successfully in VSCode.
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// Point the top variable next to the last filled slot in the array. In push operation 
// if top variable's value is less than MAX value, which is the length of the array then insert 
// the element in the position pointed by top and increment the top value by 1 and return true 
// otherwise return false as array is full. In peek operation copy the value of top into another variable
// pointer and decrement pointer variable by 1 to access the last filled element in the array. If we update
// the top value the next element which is inserted will overwrite the element inserted before it in the array.
// In IsEmpty operation if the top points to the first index in the array which means array is empty
// return true otherwise return false. In pop operation first check if array is empty using IsEmpty method if 
// array is empty print the error message and return 0 otherwise decrement the top and then return the value
// present in the index pointed by top. The popped value will not be removed from array but it gets overridden 
// when the next element is inserted in the array. 

class Stack { 
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[]; 
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top<1){
           return true;
        }
        else{
            return false;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor  
        a = new int[MAX]; // Maximum size of Stack 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top>=MAX){
            return false;
        }
        else{
            a[top]=x;
            top++;
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
            return a[--top];
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        int pointer = top;
        return a[--pointer];
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

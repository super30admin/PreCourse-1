// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

//Approach: First I initialised the constructor by initializing new array. Then I wrote isEmpty which is when the length of the array is 0. 
// For push it is case of inserting into the array at the end. So added the element at next index of top. For pop, I stored the value on top in a temporary variable 
// and made the top value zero in the array and decremented the top so it is no longer part of the array. For peek just returned the value at top.

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top = -1; 
    int a[]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if (a.length == 0){
            return true;
        }
        else{
            return false;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor 
       a = new int[MAX];
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if (a.length <= MAX){
            a[top+1] = x;
            top++;
            return true;
        }
        else{
            System.out.println("Stack Overflow");
            return false;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int temp = a[top];
            a[top] = 0;
            top--;
            return temp;         
        }

    } 
  
    int peek() 
    { 
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
    } 
}

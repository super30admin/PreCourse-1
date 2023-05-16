// Time Complexity : O(1) as there is no looping and there are constant number of steps
// Space Complexity : O(1) as the max array size is 1000 i.e. constant and other variables are also constant i.e. variables(MAX,top,x,array[1000],popped) = 4*4 +1000*4 = 4016 = constant
// Did this code successfully run on Leetcode : Don't know where to check this on leetcode instead I ran this locally
// Any problem you faced while coding this : Had to revisit the corner cases again as some inputs gave incorrect output
//                                           especially the stack overflow and underflow


// Your code here along with comments explaining your approach

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
            System.out.println("Stack is empty");
            return true;
        }else{
            return false;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1; // top = -1 indicates the stack is empty
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        //top cannot go beyond maximum permitted length of stack
        //hence as soon as t becomes equal to max length (here MAX-1 as top starts from 0) we cannot push eny new eement and hence stack overflow occurs 
        if(top==MAX-1){
            System.out.println("Stack Overflow");
            return false;
        }else{
            top++; // set the new top index
            a[top] = x; // insert new element at the new top position
            return true; 
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        //top=-1 means the stack is empty and there is no element to be popped hence stack underflow occurs
        if(top==-1){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int popped = top;
            top--;
            return a[popped];
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[top]; // returns the top element of the stack
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String[] args) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
        // for(int i=0;i<1003;i++){
        //         boolean t = s.push(1);
        //         if(t==false){
        //             System.out.println(t);
        //         }
        // }
    } 
}

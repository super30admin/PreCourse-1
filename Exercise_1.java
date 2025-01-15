class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  // Time Complexity :O(1)
// Space Complexity :O(1)
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top==-1)
            return true;

        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
   // Time Complexity :O(1)
// Space Complexity :O(N)
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top==MAX-1)
            return false;
        //Write your code here
        top++;
        a[top] = x;
        return true;
    } 
   // Time Complexity :O(1)
// Space Complexity :O(1)
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top==-1){
            System.out.println("Stack Underflow");
        }
        //Write your code here
        int val = a[top];
        top--;
        return val;
    } 
   // Time Complexity :O(N)
// Space Complexity :O(1)
    int peek() 
    { 
        //Write your code here
        if(top==-1)
            return -1;
        
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

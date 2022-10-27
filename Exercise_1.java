class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack

//    public Stack(int top) {
//        this.top = top;
//    }

    //TC : O(1)
    //SC : O(1)
    boolean isEmpty()
    {
        if(this.top==-1)
            return true;
        return false;
        //Write your code here 
    } 

    Stack() 
    {
//        Initialize your constructor
        this.top =-1;
    }
    //TC : O(1)
    //SC : O(1)
    boolean push(int x) 
    {
        if(this.top==999)
            return false;
        a[++this.top] = x;
        return true;

        //Check for stack Overflow
        //Write your code here
    }
    //TC : O(1)
    //SC : O(1)
    int pop() 
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(this.top==-1)
            return 0;
        return a[this.top--];
    }
    //TC : O(1)
    //SC : O(1)
    int peek() 
    {
        //Write your code here
        if(this.top ==-1)
            return -1;
        return a[this.top];
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

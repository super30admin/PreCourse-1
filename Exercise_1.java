// Time Complexity :
//  for peek,push,isempty() : O(1)
//  for pop it is O(n);
// Space Complexity :
//Exercise_1 : Implement Stack using Array.
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;

    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if (this.top==-1){
            return true;
        }
        return false;
    } 

    Stack() 
    {

        this.top=-1;
        System.out.println("inside constructor max=" + MAX);
        System.out.println("inside constructor top = "+this.top);
        System.out.println("inside constructor length of a = " + " " + this.a.length);

    } 
  
    boolean push(int x) 
    {
        if(this.top<MAX){
            this.a  =new int[MAX];
            this.top+=1;

            this.a[this.top]=x;
            return true;
        }
        //Check for stack Overflow
        //Write your code here
        System.out.println("Stack Overflow");
        return false;
    } 
  
    int pop() 
    {
        if(this.top>-1){
            int[] temparray = new int[this.top];
            for(int i=0;i<this.top;i++){

                temparray[i]=this.a[i];
            }
            int popElement = this.a[this.top];
            this.a=temparray;
            this.top-=1;
            return popElement;

        }
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        System.out.println("Stack Underflow");
        return 0;
    } 
  
    int peek() 
    {
        if(top>-1){
            return this.a[top];
        }
        System.out.println("Stack Underflow");
        return 0;

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
        System.out.println("is Stack empty ? " + s.isEmpty());
        System.out.println("peek = "+s.peek());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("is Stack empty ? " + s.isEmpty());
        System.out.println("peek = "+s.peek());
        System.out.println(s.pop() + " Popped from stack");
        s.push(10);
        System.out.println("peek = "+s.peek());
        System.out.println(s.pop() + " Popped from stack");
        s.push(1505);
        System.out.println("peek = "+s.peek());
    } 
}

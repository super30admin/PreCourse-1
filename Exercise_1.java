class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int head;
    int a[]; // Maximum size of Stack



    Stack()
    {
        a =  new int[MAX];
        head =-1;

    }
      boolean isEmpty()
        {
        if(head==-1){
            return true;
        }
        return false;

        }
    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
    if(head == MAX-1){
        return false;
    }
    else{
        a[++head]=x;
        return true;
    }
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            return 0;
        }
        else {
            return a[head--];
        }
    }

    int peek()
    {
        //Write your code here
        return a[head];

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

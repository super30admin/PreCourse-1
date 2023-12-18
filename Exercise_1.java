class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        return(top==-1);
        //Write your code here 
    } 

    Stack()
    {
        top=-1;
    } 
  
    boolean push(int x) 
    {
        if(top>=MAX-1){
            System.out.println("Stack is full can't add value: "+ x);
            return false;
        }
        else {
            top += 1;
            a[top] = x;
            System.out.println("stack pushed by value: "+ x);
            return true;
        }
    } 
  
    int pop() 
    {
        if(isEmpty()){
            return 0;
        }
        else{
            int value= a[top];
            top-=1;
            return value;
        }
    } 
  
    int peek() 
    {
        int peakval=a[top];
        return peakval;
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
        System.out.println(s.peek() + " peak of stack");

    } 
}

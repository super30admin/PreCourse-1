class Stack {

    // Time Complexity : O(1)
// Space Complexity :O(n)
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        boolean empty;
        if(a.length == 0){
            empty=true;
        }
        else{
            empty =false;
        }
        return empty;
    } 

    Stack() 
    { 
        //Initialize your constructor
        this.top = -1;
    } 
  
    boolean push(int x) 
    {
        boolean success;
        //Check for stack Overflow
        //Write your code here
        if(top<a.length){
            a[top+1] = x;
            top++;
            success=true;
        }
        else{
            System.out.println("Stack Overflow");
            success=false;
        }
        return success;
    } 
  
    int pop() 
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()==false){
            top=top-1;
        }
        else{
            System.out.println("Stack Underflow");
        }
        return a[top+1];
    } 
  
    int peek() 
    {
        //Write your code here
        int peekedValue = a[top];
        return peekedValue;
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

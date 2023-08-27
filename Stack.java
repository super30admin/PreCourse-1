//Time Complexity and Space Complexity for all the operations are O(1)
public class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == -1;
    } 

    Stack() 
    {
        //Initialize your constructor
        this.top=-1;
    } 
  
    boolean push(int x) 
    { 
        if(top>=MAX-1) {
            System.out.println("Stack OverFlow");
            return false;
        }
        else {
            top = top+1;
            a[top] = x;
            return true;
        }
    } 
  
    int pop() 
    {
        int popedElement;
        if(isEmpty()){
            System.out.println("Stack underflow");
            return 0;
        }else{
            popedElement = a[top];
            top =top -1;
            return popedElement;
        }
        //Write your code here
    } 
  
    int peek() 
    {
        if(isEmpty()) {
            System.out.println("Stack Empty");
            return 0;
        }
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

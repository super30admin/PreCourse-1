import java.util.Arrays;

class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        if (a.length == 0){
            return true;
        }
        return false;
        //Write your code here 
    } 

    Stack() 
    {
        top = -1;
        a = new int[MAX];
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    {
        if (top < 1002){
            top++;
            a[top] = x;
            return true;
        }
        else System.out.println("Overflow");
        return false;
        //Check for stack Overflow
        //Write your code here
    } 
  
    int pop() 
    {

        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            System.out.println(top);
            int m = a[top];
            a[top] = 0;
            top--;
            return m;
        }
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    static int peek(int[] a, int top)
    {
        return a[top];
        //Write your code here
    } 
} 
  
// Driver code 
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(Arrays.toString(s.a));
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(Arrays.toString(s.a));
        s.push(78);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(Arrays.toString(s.a));

        System.out.println(s.pop() + " Popped from stack");

        System.out.println(Arrays.toString(s.a));
        System.out.println(s.pop() + " Popped from stack");

    }

}

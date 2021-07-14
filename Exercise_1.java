import java.util.Arrays;

class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack
    int elementCount;

    boolean isEmpty() 
    {
        if (elementCount==0) {
            return true;
    }
    else {
            return false;
        }
    }

    Stack()
    {
    } 
  
    boolean push(int x) 
    {
        //Check for stack Overflow
        if (elementCount==MAX){
            a = Arrays.copyOf(a, elementCount*2);
            a[elementCount] = x;
            elementCount++;
            return true;
        }
        else {
            a[elementCount] = x;
            elementCount++;
            return true;
        }
        //Write your code here
    } 
  
    int pop() 
    {
        if (this.isEmpty()){
            return 0;
        }
        else {
            int result = a[elementCount-1];
            a = Arrays.copyOf(a,elementCount-1);
            return result;
        }
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    {
        if (this.isEmpty()){
            return 0;
        }
        return a[elementCount-1];
        //Write your code here
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

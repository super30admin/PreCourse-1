 
  
 class Stack { 
    // static final int MAX = 1000; 
    int top;
    int size;
    int[] a; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return size == 0;
    } 

    Stack(int len) 
    {   
        a = new int[len];
        top = -1;
        size = 0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top < a.length - 1){
            a[++top] =  x;
            size++;
        }
        else{
            System.out.println("Stack Overflow");
            return false;
        }
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(size == 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            size--;
            return a[top--];
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[top];
    } 
} 
// Driver code 
public class Exercise_1{
    public static void main(String args[]) 
    { 
        Stack s = new Stack(3); 
        s.push(10); 
        s.push(20); 
        s.push(30);
        s.push(40);

        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.isEmpty()); 
        System.out.println(s.peek()); 
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.isEmpty());
    } 
}

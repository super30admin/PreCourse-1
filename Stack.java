class Stack1 { 
    static final int MAX = 1000; 
    int top=0; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top < 0){
            return true;
        } else {
            return false;
        }
    } 

    Stack1() 
    { 
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top >= a.length){
            System.out.println("Overflow Stack!");
            return false;
        } else {
        a[top] = x;
        top++;
        return true;
        }
    } 
  
    int pop() 
    { int out=0;
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top < 0){
            System.out.println("Underflow Stack!");
        } else {
        out = a[--top];
        }
        return out;
    } 
  
    int peek() 
    { 
        //Write your code here
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } else{
        return a[top];
        }
    } 
} 
  
// Driver code 
class Stack { 
    public static void main(String args[]) 
    { 
        Stack1 s = new Stack1(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}

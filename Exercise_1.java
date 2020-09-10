class Stack { 
    // Time and Space Complexity : O(1)
    //
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {

        return  top >0? true:false;
        //Write your code here 
        

    } 

    Stack() 
    { 
        top = -1;
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { //check if array has empty space or not . if its there then increase the top pointer and add the element on the array .
        if(top >= MAX-1){
            System.out.println("Stack OverFlow");
            return false;
        }
        else{
            a[++top] =x; 
        }
        return true;
        //Check for stack Overflow
        //Write your code here
    } 
  
    int pop() 
    { 
        // check if stack is empty or not. Is its not empty then capture the value in temporary varable x and decrease the pointer by 1.
        int x =0;
        if(top < 0){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            
           x=  a[top--];
        }
        return x;
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    { 
        // if top is not less than zero it means there are some value on top of stack then return the value from top.

        if(top < 0){
            return -1;
        }
        else{
            return a[top];
        }
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

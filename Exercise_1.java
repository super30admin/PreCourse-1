class Stack { 
    static final int MAX = 1000;
    int top;
    int size;
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(size==0){
            return true;
        }
        return false;

    } 

    Stack() 
    { 
        //Initialize your constructor
        top = 0;
        size = 0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top==MAX-1){
            return false;
        }
        else{
            top++;
            a[top] = x;
            size++;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(size==0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int temp = a[top];
            top--; size--;
            return temp;
        }

    } 
  
    int peek() 
    { 
        //Write your code here
        if(size==0){return 0;}
        else{
            return a[top];
        }
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

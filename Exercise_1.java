class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    } 

    Stack() 
    { 
        top = -1;


    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        top++;
        if(top<MAX)
        {
            a[top]=x;
            System.out.printf("Element %d pushed to the Stack \n",x);
            return true;
        }
        else{
            System.out.println("%d cannot be pushed. Stack Overflow!"+x);
            return false;
        }

    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty())
        {
            System.out.println("Stack Underflow!");
            return 0;
        }
        else
        {
            int El = a[top];
            top--;
            return El;

        }

    } 
  
    int peek() 
    { 
        if(top > -1 && top < MAX){
            return a[top];
        }
        else{
            System.out.println("Cannot peek. Index is out of bounds!");
            return -1;
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

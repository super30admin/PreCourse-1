class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(a.length==0)
            return true;
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
        a=new int[MAX];
        top=-1;
        stacksize=0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(stacksize>=MAX)
        {
            System.out.println("Stack Overflow, cannot add elements");
            return false;
        }

        a[stacksize]=x;
        top=a[stacksize];
        stacksize++;
        System.out.println(x + " element inserted");
        return true;
        //Write your code here
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int popElement = peek();
        stacksize=stacksize-1;
        top = a[stacksize];
        return popElement;
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty())
            return -1;
        return top;
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

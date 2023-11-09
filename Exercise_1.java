class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top < 0);
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        if (top > MAX - 1)
        {
            System.out.println(" stack Overflow");
            return false;
        }
        else{
            a[++top] = x; 
            return true;           
        }

    } 
  
    int pop() 
    { 
        if (top < 0)
        {
            System.out.println(" stack Underflow");
            return 0;
        }
        else{
            return a[top--];
        }        
    } 
  
    int peek() 
    {         
        if (top < 0)
        {
            System.out.println(" stack Underflow");
            return 0;
        }
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

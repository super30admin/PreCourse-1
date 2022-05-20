class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top < 0;
    } 
    /**
     * Time complexity: O(1)  
     * Space complexity: O(1)
     */
    Stack() 
    { 
    this.top = -1; //assigning top as -1 to be incremented or decremented in the push and pop functions
    } 
  
    /**
     * Time complexity: O(1)  
     * Space complexity: O(1)
     * x to be pushed
     * return true if push was successful
     */
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if (top<MAX)
    {
        a[++top] = x;
        return true;
    }
    else if (top == MAX){ System.out.print("Stack Overflow");}
    return false;
    } 
  
    /**
     * Time complexity: O(1)  
     * Space complexity: O(1)
     * to return -1 if stack isempty
     */
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top<0) {
            System.out.print("Stack Underflow");
            return -1;
        }
        int popelement = a[top];
        a[top--] = 0;
        return popelement;
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top<0)
        return -1;
        return a[top];
    } 

    void display()
    {

        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else{

            System.out.print(" Elements of the stack are: ");
            for(int i=0; i <= top; i++)
            {
                System.out.println(a[i]+ " ");
            }
        }
    }
} 

// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        if(s.isEmpty())
        System.out.println("Stack is empty");
        s.push(10); 
        s.push(20); 
        s.push(30); 
        s.display();
        System.out.println("Top element is  " + s.peek());
        System.out.println(s.pop() + "  Popped from stack"); 
        System.out.println("Top element is  " + s.peek());

    } 
}

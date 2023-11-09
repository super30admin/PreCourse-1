class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 

    //Time Complexity=O(1)
    //Space Complexity=O(1)
    boolean isEmpty() 
    { 
        //Write your code here
        return top==-1;
    } 

    Stack() 
    { 
        this.top=-1;
        //Initialize your constructor
    }

    //Time Complexity=O(1)
    //Space Complexity=O(1)
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top==a.length-1){
            System.out.println("Stack Overflow");
            return false;
        }
        a[++top]=x;
        return true;
    }

    //Time Complexity=O(1)
    //Space Complexity=O(1)
    int pop() 
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top==-1){
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];
    }

    //Time Complexity=O(1)
    //Space Complexity=O(1)
    int peek() 
    { 
        //Write your code here
        if(top==-1){
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top];
    }

    // Driver code
    static class Main {
        public static void main(String args[])
        {
            Stack s = new Stack();
            System.out.println(s.isEmpty());
            System.out.println(s.peek());
            System.out.println(s.pop() + " Popped from stack");
            s.push(10);
            s.push(20);
            s.push(30);
            System.out.println(s.peek());
            System.out.println(s.pop() + " Popped from stack");
        }
    }
}
  

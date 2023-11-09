class Stack { 
    //Please read sample.java file before starting.

    //Time Complexity :- O(1) Becuase we are not traversing through any kind of data we using "top" for all the operation needed. 
    //Space Complexity :- O(1) Becuase the memory is not increasing based on the input, it is fixed.

  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        return (top<0);
    }

    Stack() 
    { 
        //Initialize your constructor
        this.top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        int len = a.length;
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            top++;
            a[top]=x;
            return true;
        }
    } 
    
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write your code here
        else{
            int x = a[top--];
            return x;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[top];
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

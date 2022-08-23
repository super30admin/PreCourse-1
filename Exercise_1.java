class Stack { 
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int[] a; // Maximum size of Stack
    int size;
  
    boolean isEmpty() 
    { 
        //Write your code here
        return a == null || a.length == 0;

    } 

    Stack() 
    { 
        //Initialize your constructor
        this.a = new int[MAX];
        top=-1;
        size = 0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top<MAX){
            top+=1;
            a[top]=x;
            return true;

        }

        else{
            System.out.println("Stack overflow!");
            return false;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top < 0) {
            System.out.println("Stack underflow!");
            return 0;
        }
        else{
                int var = a[top];
                System.out.println("Popped " + a[top]);
                a[top] = 0;
                top -= 1;
                return var;
        }
    }
  
    int peek() 
    { 
        //Write your code here
        System.out.println(a[top]);
        return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String[] args)
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}

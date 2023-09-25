class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
  // Time Complexity = O(n)
  //Space Complexity =  O(n)
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top == -1);
    } 

    Stack() 
    { 
        this.top = -1;
        this.a = a;
    } 
  
    boolean push(int x) 
    { 
        if(top + 1 == MAX){
                System.out.println("Stack Overflow");
                return false;
        }
    
        top = top + 1;
        a[top] = x;

        return true;

    } 
  
    int pop() 
    { 
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        int prevTop = top;
        top--;
        a[prevTop] = 0;
        return a[prevTop]; 

    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
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

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
   // Time complexity: O(1) , Space complexity: O(1)
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        //Write your code here
        if(top == -1) {
            return true;
        }
        return false;
    }

    Stack() 
    {
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        if(top < a.length) {
            top++;
            a[top] = x;
            return true;
        }
        return false;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()){
            System.out.print("Stack Underflow");
            return top;
        }

        int out = a[top];
        top--;
        return out;
    } 
  
    int peek() 
    { 
          if(!isEmpty()){
            return a[top];
        }
        return 0;
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

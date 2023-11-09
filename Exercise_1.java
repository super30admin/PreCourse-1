class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if (a.length == top) {
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
        if (a.length != top) {
            top = top + 1;
            a[top] = x;
            return true;
        }

        return false;
    } 
  
    int pop() 
    { 
        if (top != -1 && top < a.length) {
            int poppedResult = a[top];
            top = top - 1;
            return poppedResult;
        }

        return 0;
    } 
  
    int peek() 
    { 
        if (top != -1 && top < a.length) {
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

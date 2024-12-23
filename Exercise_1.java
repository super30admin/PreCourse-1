//Time complexity : O(1) for push, pop, peek
//space complexity : O(1) 

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == 0 ? true : false;
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        if (top == MAX - 1)  {
            System.out.println("Stack is full");
            return false;
        }
        a[++top] = x;
        return true;
    } 
  
    int pop() 
    { 
        if (isEmpty()) return 0;
        int val = a[top];
        a[top--] = 0;
        return val;
    } 
  
    int peek() 
    { 
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

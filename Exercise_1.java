class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top = 0;
    int a[];
  
    boolean isEmpty() {                             // time - O(1)
        return top == 0;
    } 

    Stack() {                                       // time - O(1), space - O(MAX)
        a = new int[MAX];                           // Initialization
    } 
  
    boolean push(int x) {                           // time - O(1)

        if (top == MAX) {                           // check for top == max -> Overflow
            System.out.println("Stack overflow");
            return false;
        }
        else {
            a[top] = x;                             // add the element at top pointer
            top++;
            return true;
        }
    } 
  
    int pop()                                       // time - O(1)
    {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            top--;                                  // decrement top pointer by 1
            int topElement = a[top];
            return topElement;
        }
    }
  
    int peek() {                                    // time - O(1)
        if (!isEmpty())
            return a[top-1];
        else {
            System.out.println("Stack Empty");
            return 0;
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
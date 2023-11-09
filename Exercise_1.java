//Time complexity of push = O(1), TC of pop = O(1)
//Space Complexity of push = O(1), SC of pop = O(1)


class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
   public boolean isEmpty() {
        return (top <= 0);
    }

    public boolean isFull() {
        return (top == MAX);
    }

    
    Stack() {
        this.a = new int[MAX];
        this.top = -1;//Initialize your constructor
    }

    void push(int x) {
        if (!isFull()) {
            a[++top] = x;
         }
      }

    public int pop() {
        if (!this.isEmpty()) {
            int removedElement = top;
            top = top - 1;
            return a[removedElement];
        } else {
            System.out.println("Stack Underflow");
            return 0;
        }

        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    }

    public int peek() {
        if (!isEmpty())
            return a[top];
        else
            return -1;

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

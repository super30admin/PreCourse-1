class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if (top == -1) {
            return true;
        }
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top=-1;
    } 
  
    boolean push(int x) 
    {
        top++;
        if (a[top] == MAX) {
            System.out.println("Stack is full");
            return false;
        }
        a[top] = x;
        return true;
    } 
  
    int pop() 
    {
        if (top != -1) {
            int data = a[top];
            top--;
            return data;
        }
        System.out.println("Stack is empty");
        return 0;
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
        System.out.println(s.top);
        System.out.println(s.isEmpty());
        System.out.println(s.peek());
        System.out.println(Arrays.toString(s.a));
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        s.push(40);
        s.push(50);
        System.out.println(s.top);
        System.out.println(s.isEmpty());
        System.out.println(s.peek());
        System.out.println(Arrays.toString(s.a));
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.isEmpty());
    } 
}

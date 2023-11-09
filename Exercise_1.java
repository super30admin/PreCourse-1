class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top;
    int capacity;
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top == -1)
            return true;
        else
            return false;
    }

    boolean isFull(){
        if(top == capacity - 1){
            return true;
        }
        else {
            return false;
        }
    }

    Stack() 
    { 
        //Initialize your constructor
        top = -1;
        capacity = MAX;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(isFull()){
            System.out.println("The stack seems to be FULL");
            return false;
        }
        else{
            System.out.println("Inserting the number "+x);
            a[++top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        System.out.println("Removing the number " + peek());
        return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
        if (!isEmpty()) {
            return a[top];
        } else {
            System.exit(1); // ERROR
        }
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

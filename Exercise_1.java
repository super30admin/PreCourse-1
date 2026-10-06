class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return (top < 0); 
    } 

    Stack() 
    { 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top >= MAX-1){
            System.out.println("Stack is overflowed");
            return false;
        }
        //Write your code here
        a[++top] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack is underflowed");
            return 0;
        }
        //Write your code here
        return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty()){
            System.out.println("Stack is underflowed");
            return 0;
        }
        return a[top];
    } 
} 
  
// Driver code 
class Exercise_1{ 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.peek() + " Peeked from stack"); 
        System.out.println("13 pushed to stack: " +s.push(13)); 
        System.out.println("Is stack empty: " + s.isEmpty());
    } 
}

// TC: O(1)
// SC: O(n)
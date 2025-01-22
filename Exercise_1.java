// Time Complexity is O(1)
// Space Complexity is O(n) i.e. MAX array size
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == -1;
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        if(top == MAX-1){ // Validate if the stack is full
            System.out.println("Stack Overflow");
            return false;
        }
        top = top+1;
        a[top] = x;
        return true;
    } 
  
    int pop() 
    { 
        if(top == -1){
            System.out.println("Stack Underflow");
            return 0;
        }
        int popped_value = a[top];
        top = top -1;
        return popped_value;
       
    } 
  
    int peek() 
    { 
        if (top == -1) {
            System.out.println("Underflow");
            return 0;
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

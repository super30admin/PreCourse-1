class Stack { 
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    int index;
  
    /*
    Time Complexity: O(1)
    Space Complexity: O(1)
    */
    boolean isEmpty() { 
      return (top == -1) ;
    } 

    Stack() { 
      top = -1;
    } 
  
    /* 
    Time Complexity: O(1)
    Space Complexity: O(1)
    */
    boolean push(int x) { 
      if(top >= MAX){
        return false;
      }

      top++;
      a[top] = x;
      return true;
    } 
  
    /* 
    Time Complexity: O(1)
    Space Complexity: O(1)
    */
    int pop() { 
      
      if(top == -1){
        System.out.println("Stack Underflow");
      }

      return a[top--];
    } 
  
    /* 
    Time Complexity: O(1)
    Space Complexity: O(1)
    */
    int peek() { 
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

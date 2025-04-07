// Time Complexity:
// push() – O(1)
// pop() – O(1)
// peek() – O(1)
// isEmpty() – O(1)
// Space Complexity: O(n)
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top==-1;
    } 

    Stack() 
    { 
       top=-1; 
    } 
  
    boolean push(int x) 
    { 
       if(top<MAX-1){
        a[++top]=x;
        return true;
       }
       else{
        System.out.println("Stack overflow");
        return false;
       }
    } 
  
    int pop() 
    { 
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0; 
        } else {
            return a[top--]; 
        }
    } 
  
    int peek() 
    { 
       if(top>-1){
        return a[top];
       }
       else{
        System.out.println("Stack is Empty");
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

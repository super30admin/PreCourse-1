// Time Complexity : O(1)
// Space Complexity : O(1)

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top == -1){
            return true;
        } else return false;
    } 

    boolean isFull(){
        if (top == MAX){
            return true;
        } else return false;
    }

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        if(isFull()){
            return false;
        } else {
            ++top;
            a[top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        if(isEmpty()) {
            return 0;
        } else {
            top--;
            return a[top + 1];
        }
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

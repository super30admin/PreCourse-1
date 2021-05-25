class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return top == -1;
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x)  // Time Complexity: O(1)
    { 
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        }
        
        a[++top] = x;
        return true;
    } 
  
    int pop() // Time Complexity: O(1)
    { 
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
           
        int x = a[top];
        top--; 
        return x;
    } 
  
    int peek() 
    { 
        if (isEmpty())
            return 0;
       
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

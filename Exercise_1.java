/* Time complexity of each operation is : O(1)
   Space complexity is : O(1) */

class Stack { 
  
    static final int MAX = 1000; 
    int top = -1; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == -1;
    
    } 

    Stack() 
    { 
        
        System.out.println("Stack is created !");
        
    } 
  
    boolean push(int x) 
    { 
        if(top >= MAX-1)
            System.out.println("Stack Overflow !!!");
        else {
            top++;
            a[top] = x;
   }

    } 
  
    int pop() 
    { 
        if(top <= -1)
            System.out.println("Stack Underflow !!!");
        else {
            System.out.println("The popped element is: ", a[top]);
            top--;
   }
    } 
  
    int peek() 
    { 
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty !");
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

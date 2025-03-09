class Stack { 
// Time complexity: O(1) for all operations, 
// Space complexity: O(1)
   
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top < 0); 
    } 

    Stack() 
    { 
        top= -1;
    } 
  
    boolean push(int x) 
    { 
        if (top<MAX-1) 
        {
            System.err.println("stack overderflow");
        return false;    
        }
        top++;
        a[top]=x;
        return true;
    } 
  
    int pop() 
    { 
        if (top<0) {
            System.err.println("stack underflow");
            return-1;
            
        }else{
            return a[top]--;//pop out
        }
    } 
  
    int peek() 
    { 
        if (isEmpty()) { 
            System.out.println("This empty stack"); 
            return -1; 
        } else { 
            return a[top]; 
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

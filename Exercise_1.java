
/* Time Complexity: 
push()      -> O(1)
pop()       -> O(1)
peek()      -> O(1)
isEmpty()   -> O(1)

Space Complexity: O(n), where n = MAX size of the array (1000) */

class Stack { 
    
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
    	 return (top < 0);
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
    	if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
    	if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    } 
  
    int peek() 
    { 
    	if (top < 0) {
            System.out.println("Stack is Empty");
            return 0;
        } else {
            return a[top];
        }
    } 
} 
  
// Driver code 
class Exercise_1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}

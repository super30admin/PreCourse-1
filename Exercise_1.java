class Stack { 
    static final int MAX = 1000; 
    int top = -1; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top == -1);
    } 

    Stack() 
    { 
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        if(!(MAX - 1 == top)){
            top++;
            a[top] = x;
            return true;
        }
        else { 
            System.out.println("Stack Overflow!");
            return false;
        } 
            
    } 
  
    int pop() 
    { 
        if(!isEmpty()){
            int topIndex = top;
            top--;
            return a[topIndex];
        }
        else {
            System.out.println("Stack underflow!");
            return 0;
        }
    } 
  
    int peek() 
    { 
        if(!isEmpty())
            return a[top];
        else
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

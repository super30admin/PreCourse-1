//Space Complexity = O(n)
//Time Complexity = O(1)

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    } 

    Stack() 
    { 
        this.top = -1;
    } 
  
    boolean push(int x) 
    { 

        if(top == 999)
        {
            return false;
        }
        else
        {
            top += 1;
            a[top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        if(top == -1)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int temp = a[top];
            top -= 1;
            return temp;
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

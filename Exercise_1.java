class Stack { 
    //Time Complexity:  O(1)
    //Space Complexity: O(1)
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top==-1)
            return true;

        else
            return false; 
    } 
    
    boolean isFull()
    {
        if(MAX-1==top)
            return true;

        else
            return false;
    }

    Stack() 
    { 
        this.top = -1;
    } 
  
    boolean push(int x) 
    { 
        if(!isFull()){
            top = top + 1;
            a[top] =x;
            System.out.println("Elemented push "+ x );
            return false;
        }
        else{
            System.out.println("Stack is full: Overflow" );
            return  true;
        }
    } 
  
    int pop() 
    { 
        if(!isEmpty()){
            int value = a[top];
            top = top-1;
            System.out.println("Popped element is "+ value );
            return 1;
        }
        else{
            System.out.println("Stack is empty: Underflow" );
            return  0;
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

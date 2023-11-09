//time complexity : push,pop,peek -> O(1)
//space complexity : O(n), n is max size of array
//Approach : I will take an array of size n and a top variable pointing to the top of a stack.
//          For push op, I'll increment top and add element at that position. For pop op, i'll remove element pointing at top index,
//          for peek op,i'll show element pointing at top index

class Stack { 

    static final int MAX = 1000; 
    int top; 
    int a[]; 
  
    boolean isEmpty() 
    { 
        return (top == -1);
    } 

    Stack() 
    { 
        top = -1; 
        a = new int[MAX]; // Maximum size of Stack 
    } 
  
    boolean push(int x) 
    { 
        
        if(MAX == (++top))
            return false;
        a[top] = x;
            return true;
    } 
  
    int pop() 
    { 
        if(top == -1){
            System.out.println("Stack Underflow");
            return 0;
        }
            
        else
            return a[top--];
    } 
  
    int peek() 
    { 
        if(top != -1)
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

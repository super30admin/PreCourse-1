//Time Complexity: O(1)
//Space Complexity: O(n)

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return a.length == 0; 
    } 

    Stack() 
    { 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        if (top == a.length - 1) 
        {
            System.out.println("Could not add element to stack");
            return false; 
        }
        top++;
        a[top] = x;
        return true; 
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top==-1){
            System.out.println("Stack Underflow");
            return 0;
        }

        int temp = a[top];
        a[top] = 0;
        top--;
        return  temp;
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
        System.out.println(s.peek() + " peeked from stack"); 
    } 
}

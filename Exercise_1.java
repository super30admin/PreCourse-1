class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Time Complexity: O(1)
        
        //Returns true when stack is empty i.e. top = -1 else returns false
        return top == -1;
    } 

    Stack() 
    { 
        //Initializes top of the stack
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Time Complexity: O(1)
       
        //Increments the top pointer to point to the new element
        top++;

        //If the top is equal to the size of array, its a situation of stack overflow and new element 
        //cannot be pushed onto the stack, returns false
        if(top == a.length)
            return false;
        
        //else adds the element to the index where the top points and returns true
        a[top] = x;
        return true;
    } 
  
    int pop() 
    { 
        //Time Complexity: O(1)

        //Checks if the stack is empty i.e. top == -1, returns 0 and prints " Stack Underflow"
        if(top == -1)
        {
            System.out.println(" Stack Underflow");
            return 0;
        }

        //Else returns the element at the top of the stack and decrements the top pointer
        return a[top--];
    } 
  
    int peek() 
    { 
        //Time Complexity: O(1)

        //Returns the element at the top of the stack
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

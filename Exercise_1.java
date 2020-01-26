class Stack { 
    //the final size of the  stack array
    static final int MAX = 1000; 
    
    //top is like the index of the stack array a, it represents the last element added to the stack 
    int top; 

    //the actual stack array object instantiated  
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //when the top is zero, meaning the array index is 0 and nothing has been added to it yet  
        return (top == 0) ;  
    } 

    Stack() 
    { 
        //instantiating the top of the stack 
        top = 0 ; 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if (top == a.length - 1)
            return false ; 

        //Write your code here
        a[top++] = x ; 
        return true ; 
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow") ; 
            return 0 ; 
        }
        //Write your code here
        return (a[top--]) ; 
    } 
  
    int peek() 
    { 
        //if empty returing -1 and printing "Stack Empty"
        if (isEmpty()) {
            System.out.println("Stack Empty") ; 
            return -1 ; 
        }

        //Write your code here
        return (a[top]) ; 
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

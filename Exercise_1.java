//Time Complexity: O(1) -> all operations execute in O(1) complexity
                        //push, pop, peek, isEmpty
//Space Complexity: O(n) -> worst case all elements are stored in the stack
                        //occupying linear space

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    
    boolean isEmpty() 
    {   //returning true if top is < 0
        //if not; return false
        return (top < 0);
    } 
    //constructor
    Stack() 
    {   //top is initialized to empty top
        top = -1;
    } 
  
    boolean push(int x) 
    {   //if stack size if full; cannot insert new element
        //if not; increment the top pointer -> push
        if(top >= MAX-1){
            System.out.println("Can't push element. Stack Overflow!");
            return false;
        } else {
            a[++top] = x;
            System.out.println("Element " + x + " is pushed to stack successfully!");
            return true;
        }
    } 
  
    int pop() 
    {   //if no elements to pop; returning 0
        //else return the last inserted element
        if(top < 0){
            System.out.println("No elements to pop. Empty stack!");
            return 0; 
        } else {
            int poppedElement = a[top--];
            return poppedElement;
        }
    } 
  
    int peek() 
    {   //if no elements; return 0
        //else return the top most element
        if(top < 0){
            System.out.println("No elements to peek. Empty stack!");
            return 0; 
        } else {
            int peekedElement = a[top--];
            return peekedElement;
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

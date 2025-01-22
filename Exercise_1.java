
/**
 * Time Complexity:
 * - isEmpty: O(1)
 * - push: O(1)
 * - pop: O(1)
 * - peek: O(1)
 * Space Complexity: O(n) where n is the maximum size of the stack
 */
class Stack { 
   
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 

    public boolean isEmpty() 
    { 
       return (top < 0);//Write your code here 
    } 

    public Stack() 
    { 
         top = -1; //Initialize your constructor 
    } 
  
    public boolean push(int x) 
    { 
      if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");//Check for stack Overflow
            return false;
        } else { //Write your code here
            a[++top] = x;
            return true;  
        }
    } 
  
    public int pop()
    { 
        if (top < 0) {
            System.out.println("Stack Underflow");//If empty return 0 and print " Stack Underflow"
            return 0;
        } else {  //Write your code here
            int x = a[top--];
            return x; 
       
    } 
    }
  
    public int peek() 
    { 
        if (top < 0) { //Write your code here
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top];
        }
    } 

  
// Driver code 

    public static void main(String[] args) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}

    
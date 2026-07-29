class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
// Time Complexity for push operation: O(1) 

 // Time Complexity for pop operation : O(1)

 //Time Complexity for peek operation : O(1)

 //Space Complexity is O(n) since it has a constant space to store  n elements

 // Its difficult to understamd how to start working on the problem but once I got idea its easy to implement
 
    static final int MAX = 1000; 
    int top = -1; 
    int[] a;

  
    boolean isEmpty() 
    { 
        if(top == -1) {
            return true;

        }
        return false;

    } 

    Stack() 
    { 
       a = new int[MAX];
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here

      if(top == MAX-1){
           throw new Error("Stack overflow exception");
       }
       a[top +1 ] = x;
       top++;
       return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == -1){
            System.out.println("Stack Underflow");
            return 0;
            
        }

        return a[top--];

        
    } 
  
    int peek() 
    { 

    if(top == -1){
        throw new Error("Empty Stack Exception");
    }
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

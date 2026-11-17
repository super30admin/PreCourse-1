class Stack { 
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
  
  /*Time complexity:
  isEmpty() - O(1)
  Push() - O(1)
  pop() - O(1)
  peek() - O(1)
  Space Complexity - O(Max) - we gave the maximum capacity 1000 
  */
    static final int MAX = 1000; 
    int top ; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top == -1)  
        {
             return true;
        }
        else{
         return false;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;  
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top>=MAX-1){
            System.out.println("stack overflow");
            return false;
        }
            top = top +1;
            a[top]= x;
            return true;
    } 
  
        int pop() 
        { 
            //If empty return 0 and print " Stack Underflow"
            //Write your code here

        int deletedElement;
            if(top == -1 || top < 0){
                System.out.println("Stack Underflow");
                return 0;
            }
            
                deletedElement = a[top];
                top = top-1;
                return deletedElement;
    } 
  
        int peek() 
        { 
            //Write your code here

            if(top==-1){
                System.out.println("stack underflow");
                return 0;
            }
            int topElement;
            topElement = a[top];
            return topElement;
        } 
} 
  
// Driver code 
class Main { 
    
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        System.out.println(s.peek() + " topmost element of the stack");
        s.push(30); 
        System.out.println(s.isEmpty());
        System.out.println(s.pop() + " Popped from stack"); 
        s.push(40); 
        s.push(60); 
        System.out.println(s.isEmpty());
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.peek() + " topmost element of the stack");
    } 
}


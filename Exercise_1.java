
 /*********** Not Sure about space complexity*******/

 class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
 boolean isEmpty()                                              // **** Time Complexity O(1) ***********
    { 
        if(top == -1){
            return true;
        }else{
            return false;
        }
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x)                                        // **** Time Complexity O(1) ********** 
    { 
        if(top <= (MAX-1)){
            top++;
            a[top]=x;
            return true;
        }else{
                System.out.println("Stack is overflowed");      //Check for stack Overflow
                return false;
            }
    } 
  
    int pop()                                                   // **** Time Complexity O(1) ***********
    { 
        if(top < 0){
            System.out.println("Stack is Underflowed");         
            return 0;                                           //If empty return 0 and print " Stack Underflow"
        }else{
        	int result = a[top];
            top--;  
            return result;
        }
    } 
  
    int peek()                                                  // **** Time Complexity O(1) ***********
    { 
        if(top == -1){
            System.out.println("Stack is empty");
            return 0;
        }else{
            return top;
        }
    } 
}

class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
        // s.peek();
        // s.isEmpty();
    } 
}


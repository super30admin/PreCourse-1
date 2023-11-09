class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == 0; 
    } 

    Stack() 
    { 
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        if(top <= MAX){
            a[top++] = x;
            return true;
        }else{
            System.out.println("Stack Overflow");
            return false;
        }
      
    }
  
    int pop() 
    { 
        int topOfStack = 0;
        if(top < 0){
            System.out.println("Stack underflow");
        }else{
           topOfStack = a[--top];
        }
         
        return topOfStack;
    } 
  
    int peek() 
    { 
        return top > 0 ?  a[top-1] : 0;
    } 
} 
  
// Driver code 
class Example_1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        System.out.println(s.peek() + "Peek from Stack");
        s.push(10); 
        s.push(20); 
        System.out.println(s.peek() + "Peek from Stack");
        s.push(30); 
        System.out.println(s.peek() + "Peek from Stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek());
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack");  
        System.out.println(s.peek() + "Peek from Stack");
    } 
}

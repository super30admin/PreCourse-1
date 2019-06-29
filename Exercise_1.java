class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top == -1){ // or we can write the top<0
            return true;
        }else 
            return false;
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
        if(size() == MAX){
            System.out.print("Stack Overflow");
            return false;
        }
       
        a[++top] = x;
        return true;
        
    } 
  
    int pop() 
    { 
        int poppedElement =0;
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
         if(isEmpty()) { System.out.print("Stack Underflow");}
         poppedElement = a[top];
         top = top -1;
         return poppedElement;
        
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty()) { System.out.print("Stack Underflow");}
        return a[top];
    } 
    
    int size(){
        return top+1;
    }
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        System.out.println("Stack Should be Empty now " + s.isEmpty());
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
        s.push(210); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.push(40)  + " Pushed to stack"); 
        System.out.println(s.peek()  + " is the top element of the  stack"); 
        
    } 
}

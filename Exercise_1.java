class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top <0;
        //Write your code here 
    } 

    Stack() 
    { 
        this.top=-1;
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        if(top== a.length -1){
            return false;
        }
        a[++top]=x;
        return true;
        //Write your code here
    } 
  
    int pop() 
    { 
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return a[top--];
        //Write your code here
    } 
  
    int peek() 
    { 
         if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return a[top];
        //Write your code here
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

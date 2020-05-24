class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top< 0){
            return true;
        }else{
            return false;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top =-1;

    } 
  
    boolean push(int x) 
    { 
        //Checking for overflow condition 
       if(top == MAX-1){
           return false;
       }else{
           top++;
           a[top]=x;
           return true;
       }
    } 
  
    int pop() 
    { 
        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int poppedElement = a[top]; //reassign while pushing
             top--;
             return poppedElement;
        }
    } 
  
    int peek() 
    { 
        int topElement = a[top];
        return topElement;
    } 
} 
  
// Driver code 
class Exercise_1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}

//  TC : - O(1)
//  SC : - O(1)
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top==-1){
            System.out.println("Stack is empty");
            return true;
        }
        return false;
    } 

    Stack() 
    {  
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        if(top>=a.length-1) {
            System.out.println("Stack Overflow");
            return true;
        }
        else{
            top++;
        }
        a[top]=x;
        return false;
    } 
  
    int pop() 
    { 
        if(top==-1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
        int num = a[top];
        top--;
        return num;
    }
    } 
  
    int peek() 
    {
        if(top==-1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
        int num = a[top];
        return num;
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

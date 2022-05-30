//Time Complexity:- O(N)
//Space Complexity:- O(1)
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top = -1;
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        return top==-1;
    } 

    Stack() 
    { 
        top=-1;
    } 
  
    boolean push(int x) 
    { 
        if(top + 1 == MAX) {
            System.out.println("Stack Oversized");
            return false;
        }
        else{
            a[++top]=x;
        }
        return true;
    } 
  
    int pop() 
    { 
       if(a[top]==0)
       {
           System.out.println("Stack Underflow");
           return -1;
       }
       else {
           return(a[top--]);
       }
    } 
  
    int peek() 
    { 
        if(top>=0){
            return(a[top--]);
        }
        return -1;
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

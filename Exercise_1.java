class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    //Time complexity is: O(n)
    //Space complexity is:O(1)
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
         return (top== -1);
    } 

    Stack() 
    { 
        this.top = -1;
         
    } 
  
    boolean push(int x) 
    { 
       if(!isFull()){
           a[++top] = x;
           System.out.println("push element " + x);
       }
       else {
           System.out.println("stack is full : overflow");

       }
    } 
  
    int pop() 
    { 
        if(!isEmpty){
            int value = a[top];
            top--;
            System.out.println("popped element " + value);
            return value;
        }
        else {
            System.out.println("stack is empty : underflow");
            return -1;
        }
    } 
  
    int peek() 
    { 
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

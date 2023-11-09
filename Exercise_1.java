class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
//Time complexity of Peek is O(1). push is O(1),Pop is O(1) 
//Space complexity is O(N)
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
      if (top == -1){
         return true; 
    } else {
          return false;
    }
    Stack() 
    { 
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        if ( top == MAX){
         System.out.println("Stack is full");
    } 
     else{
      top++;
      a[top] = x;
    }
  
    int pop() 
    { 
      if (isEmpty()){
      System.out.println("Stack is empty");
        
    } 
   else {
        top--;
       }
  
    int peek() 
    { 
        if (top == isEmpty()) {
        System.out.println("stack is underflow"):
    } 
     else {
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

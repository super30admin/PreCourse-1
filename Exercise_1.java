class Stack {
// Time Complexity : O(1) , all the operation have constant time complexity
// Space Complexity : O(1)


    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top == -1;
    } 

    Stack() 
    { 
        top = -1;

    } 

    /*
    *
    * */
    boolean push(int x) 
    { 
        if(top>= MAX-1){
            return false;
        }
        top++;
        a[top] = x;
        return true;
    } 
  
    int pop() 
    {
        if(top==-1){
            System.out.println("Stack Underflow");
            return 0;
        }
        int result = a[top];
        top--;
        return result;
    } 
  
    int peek() 
    {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
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

class Stack { 
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    // Time Complexity : 0(n) and n = 1000 in our case
    // Space Complexity : 0(n) and n = 1000 in our case
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    int min = Integer.MIN_VALUE;
    int cur = -1;

    boolean isEmpty() 
    { 
        if(cur == -1){
            return true;
        }
        return false;
    } 

    Stack() 
    { 
        for(int i = 0; i < a.length; i++){
            a[i] = min;
        }
    } 
  
    boolean push(int x) 
    { 
        a[++cur] = x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            return 0;
        }
        int top = a[cur];
        a[cur] = min;
        return top;
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[cur];
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

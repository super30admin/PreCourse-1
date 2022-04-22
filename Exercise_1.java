class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(a.length ==0){
            return true;
        }else{
            return false;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor
        int i=0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        int i=0;
        if(a.length ==0){
            a[0]=x;
        }

        if(a.length!=0 && a.length <1000){
            a[i]=x;
            i++;
            return true;
        }else{
            return false;
        }
    } 
  
    int pop() 
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(a.length ==0){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            return a[a.length-1];
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[a.length-1];
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

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
         if(a.length==0)
         return true;
         else
         return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top=0;
    
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(a.length-1==MAX){
        System.out.println("Stack overflow");
        return false;}
       
        else{
            if(a.length==0){
            a[top]=x;
            return true;
            }
            else{
            top=top+1;
            a[top]=x;
            return true;}
        }
    }

  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(a.length==0){
            System.out.println("Stack Underflow");
            return 0;
           
        }
        else{
    int val= top;
    top=top-1;
        //Write your code here
        return a[val];
    } 
}
    int peek() 
    { 
        //Write your code here
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

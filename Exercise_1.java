

//Time Complexity: 
//Space Complexity:
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top==-1){
            return true;
        }
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top=-1;

    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top>=MAX){
            return false;
        }
        else{
            a[++top]=x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top>MAX || top<0){
            return 0;
        }
        else{
            
            int res=a[top];
            top--;
            return res;
            
        }
        
    } 
  
    int peek() 
    { 

        //Write your code here
        if(top>MAX){
            return 0;
        }
        else{
            return a[top];
        }
    } 
} 
public class Exercise_1{

 
  
// Driver code 

    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 

}

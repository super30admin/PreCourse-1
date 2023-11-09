//Time  and space Complexities are of order O(1) for all operations of the stack 
//Code ran Successfully
class Stack { 
   
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        //Write your code here 
        if(top!=0)
           return false; 
        else
           return true;   

    } 

    Stack() 
    { 
        //Initialize your constructor 
       top=0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top<(MAX-1) ){
            //return false;
        	a[top]=x;
        /* System.out.println(a[top]);
        System.out.println(a.length);*/

        top=top+1;
        //System.out.println(top);

           return true;
        }
        else 
             
             return false;

    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(!this.isEmpty()){
            int x=top-1;
            //System.out.print(x);
            //top--;
            return a[x];
        }
        else{
            System.out.println("Stack Underflow");
            return 0;
           }     
    } 
  
    int peek() 
    {   // System.out.println(a);
        return a[top--];
         
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

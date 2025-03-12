class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
    //     for(int i=0; i< a.length; i++){
    // int a[] = new int[MAX]; // Maximum size of Stack 
    //         if(a[i] == 0){
    //             continue;
    //         }
    //         else
    //             return false;
    //     }
    //     return true;
        if(top == -1)
            return true;
        else
            return false;
    }
    Stack() 
    { 
        //Initialize your constructor
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        // if(a.length > MAX)
        //     return false;
        // int size=0;
        // for(int i=0; i<a.length; i++)
        // {
        //     if(a[i] != 0)
        //         size++;
        //     else
        //         break;
        // }
        // a[size+1]=x;
        // return true;
        if(top >=MAX -1){
            System.out.println("Stack OverFlow");
            return false;
        }
        else
        {
            top = top +1;
            a[top] = x;
        }
        System.out.println("Pushed onto stack :"+ x);
        return true;
    } 
  
    int pop() 
    {
        // //If empty return 0 and print " Stack Underflow"
        // if(a.length == 0)
        //     System.out.println("Stack Underflow");
        
        // //Write your code here
        // int size=0;
        // for(int i=0; i<a.length; i++){
        //     if(a[i] != 0)
        //        size++;
        //     else if(a[i] == 0)
        //       break;
        // }
        // int x = a[size];
        // a[size] =0;
        // return x;
        if(top == -1){
            System.out.println("Stack Underflow.");
            return top;
        }
        int x = a[top];
        top = top -1;
        return x;
    }
  
    int peek() 
    { 
        //Write your code here
    //     if(a.length > MAX)
    //         return -1;
    //     int size=0;
    //     for(int i=0; i<a.length; i++)
    //     {
    //         if(a[i] != 0)
    //             size++;
    //         else
    //             break;
    //     }
    //     return a[size];
    // } 
    if(top == -1){
        System.out.println("Stack is empty");
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
        System.out.println(s.peek());
        System.out.println(s.pop());
    } 
}
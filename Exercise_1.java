class Stack { 
    final int MAX = 1000;
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        if(top==-1)
             return true;
        else
            return false;
    } 

    Stack() 
    {
        top = -1;
    }
  
    boolean push(int x) 
    { 
        if(top<MAX-1){
            top++;
            a[top]=x;
            return true;
        }else{
            return false;
        }

    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top!=-1 && top<MAX-1){
            int popInt = a[top];
            a[top]=0;
            top--;
            return popInt;
        }else {
            System.out.println("Stack Underflow");
            return 0;
        }

    } 
  
    int peek() 
    { 
        return a[top];
    }
    void view(){
        System.out.println();
        for(int i=0;i<=top;i++){
            System.out.print(a[i]+ " ");
        }
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
        System.out.println(s.peek() + " peeked from stack");
        s.pop();
        s.pop();
        System.out.println(s.pop() + " Popped from stack");

        s.view();
    } 
}

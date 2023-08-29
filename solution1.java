class Stack { 
  
  //time complexity O(1)
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
               return a.length==0;
    } 

    Stack() 
    { 
        top = 0;
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
       if(top==MAX){
          System.out.println("Overflow");
          return false;
       }
       else{
           top=top+1;
           a[top]=x;
           return true;
       }
    } 
  
    int pop() 
    { 
        if(isEmpty()){
           System.out.println("Underflow"); 
           return 0;
        }
        else{
            int temp;
            temp=a[top];
            top=top-1;
            return temp;
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

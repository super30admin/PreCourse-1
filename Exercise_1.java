// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : No

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top<0){
            return true;
        }
        else return false;
    } 

    Stack() 
    { 
        top=-1;
    } 
  
    boolean push(int x) 
    { 
        if(top>=MAX-1){
            System.out.println("Stack overflow");
            return false;
        }
        else{
            top++;
            a[top]=x;
            //System.out.println("Stack push:" + a[top]);
            return true;
        }
        
    } 
  
    int pop() 
    { 
        if(top==-1){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int ele=a[top--];
            return ele;
        }    
    } 
  
    int peek() 
    { 
        if(top<0){
            System.out.println("Stack Empty");
            return 0;
        }
        else{
            int pk=a[top];
            return pk;
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
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}

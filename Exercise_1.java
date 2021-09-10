// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//**Used array to implement stack.**


public class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[]; 
  
    boolean isEmpty() 
    { 
        return (top==-1);
    } 

    public Stack() 
    { 
        a= new int[MAX];
	    top=-1;
    } 
  
     boolean push(int x) 
    { 
       
        if(size()==MAX){
            System.out.println("Stack Overflow");
            return false;
        }else{
            top++;
            a[top]=x;
            return true;
        }
    } 
  
     int pop() 
    { 
       
        if(size()==0){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int tp=a[top];
            top--;
            return tp;
        }
        //Write your code here
    } 
  
     int peek() 
    { 
        
        if(size()==0){
            System.out.println("No element");
            return 0;
        }else{
            return a[top];
        }
    } 

     int size() {
		return top+1;
	}
}
// Driver code 
class Main{
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}


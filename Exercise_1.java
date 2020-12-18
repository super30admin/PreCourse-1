// Time Complexity : Push,Pop,Peek : O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Not Tried
// Any problem you faced while coding this : No



class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        /***** Here, I'm just checking that whether top index is equal to size of array or not. If it is then return stack is empty*****/ 
        if(top==MAX){
            return true;
        } 

        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor

        /***** Here I initialized top with size of array because I will be storing elements starting from the last index of array *****/ 
        this.top = MAX;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        /***** I have created a function for checking stack overflow and if space is available in array then I'm storing element at top-1 index because I initialized top with size of array. *****/
        if(isSpaceAvailable()){
           a[top-1] = x;
           top--;
           return true;
        }     

        return false;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here

        /***** Here I have created a variable called poppedElem and initialized it with 0. If the array is not empty then I'm just getting the array element at the top index and incrementing the top. If I have not created a variable poppedElem then I had to write 'return' twice.  *****/
        int poppedElem = 0;
        
        /***** *****/
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }else{
            poppedElem = a[top];
            top++;
        }

        
        return poppedElem;
        
    } 
  
    int peek() 
    { 
        //Write your code here
        /***** Here, I'm hust returning the element at top index *****/
        if(!isEmpty()){
            return a[top];
        }
         
        return 0;
    }
    
    /***** for checking stack overflow *****/
    boolean isSpaceAvailable(){
        /***** Here I'm, checking that wheteher array is full or not by checking the top index *****/
        if(top>0){
            return true;
        }

        return false;
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

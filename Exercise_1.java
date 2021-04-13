// Time Complexity : Peek --> O(1) , Push --> O(1) , Pop --> O(1) isEmpty --> O(1)
// Space Complexity : O(1) --> since size of array may be 1000 but we are using one space at a time
//I am not good in space complexity but I feel size of array is the total space will need.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Not really 


// Your code here along with comments explaining your approach


class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    // since whole stack is judged on "top" will use top for every operation 
    boolean isEmpty() 
    { 
        if(top==0) {
            return true;
        }
        else 
            return false;
            
    } 

    Stack() 
    { 
        // initialization of top
        top=0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top >= (MAX-1)){
            System.out.println("Stack overflow: Can't push !");
            return false;
        }
        else
            {
                a[top++]=x;
                System.out.println(" Element "+x+" Pushed in stack");
                return true;
            }
            
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top <=0){
            System.out.println("Stack Underflow: Can't pop !");
            return 0;
        }
        else{
            return a[--top];
        }
           
            

    } 
  
    int peek() 
    { 
        //Write your code here
        System.out.println(" Element "+a[top]+" is on top in stack"); 
        return a[top];
    } 

    // Simple array printing loop >> O(n) complexity
    void print(){
      
        for(int i=0;i<top;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
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
        System.out.println(" Stack elements are: " );
        s.print();
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(" Stack elements are: ");
        s.print();
        s.peek();
    } 
}

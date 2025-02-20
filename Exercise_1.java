// Time Complexity : Push, Pop, Peek and isEmpty are all O(1) as we did not need to iterate through the array
// Space Complexity : O(n) where n is MAX or size of array
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : None
// Code here along with comments explaining your approach
class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack
    /*
    Initializes top to -1 by default on creation of any stack instance
    @param : None
    @return : None
     */
    Stack()
    {
      this.top = -1;
    }
    /*
    Checks if stack is empty by checking value of top which is maintained based on array index
    @param : None
    @return : true if top == -1 and false otherwise
     */
    boolean isEmpty() 
    { 
       return this.top == -1;
    }
    /*
       If index is max capacity returns false.
       Otherwise initializes index of top and adds element to array which already has max capacity
       @param : None
       @return : true if push is a success and false otherwise
    */
    boolean push(int x) 
    { 
        if(this.top == MAX - 1){
            return  false;
        } else {
            this.top = this.top + 1;
            a[this.top] = x;
            return true;
        }
    }
    /*
        If isEmpty then returns 0.
        Otherwise top holds the index of the last inserted item. top is reduced and the element previously at the position is returned
        @param : None
        @return : 0 if empty and popped item if not
     */
    int pop() 
    { 
        if(isEmpty()){
            return 0;
        } else {
            int poppedItem = a[this.top];
            this.top = this.top - 1;
            return poppedItem;

        }
    }
    /*
         If isEmpty then returns 0.
         Otherwise top holds the index of the last inserted item. Ele at top index is returned
         @param : None
         @return : 0 if empty and top item if not
      */
    int peek() 
    { 
       if(isEmpty()){
           return 0;
       } else {
           return a[this.top];
       }
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        boolean ten =s.push(10);
        System.out.println("Push 10 into stack success "+ ten);
        boolean twenty = s.push(20);
        System.out.println("Push 20 into stack success "+ twenty);
        boolean thirty = s.push(30);
        System.out.println("Push 30 into stack success "+ thirty);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peek from stack");
        System.out.println("Stack is empty " + s.isEmpty());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Stack is empty " + s.isEmpty());
    }
}

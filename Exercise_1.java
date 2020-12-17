/*
stack using array:
time complexity :
    *) to push an element : O(1)
    *) to pop an element  : O(1)
space complexity : O(n), where n is the number of elements in stack/array

 */
class Stack {
    static final int MAX = 1000;
    int a[] = new int[MAX]; // Maximum size of Stack
    //as stack uses LIFO pattern, we will use a ptr to keep track of last element added in the stack or removed
    int top;

    Stack()
    {
        //Initialize your constructor
        top = -1;

    }
    boolean isEmpty() 
    { 

        //Write your code here
        //if top is -1 then the stack is empty
        if(top == -1){
            System.out.println("Stack is empty");
            return true;
        }
        return false;

    } 


  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(isFull()){
            return false;
        }
        //Write your code here
        top++;
        a[top] = x;
        return true;
    }

     boolean isFull() {
        if (top == MAX){
            System.out.println("pop some items to make space");
            return true;
        }
        return false;
    }

    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty()){
            return -1;
        }
        //Write your code here
        int popped = a[top];
        a[top] = 0;
        top--;
        return popped;
    } 
  
    int peek() 
    { 
        //Write your code here
        int topItem = a[top];
        return topItem;
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
        int popped = s.pop();
        if(popped != -1){
            System.out.println(popped + " from stack");
        }else {
            System.out.println("Stack is empty, please push elements");
        }
//        if(s.pop() != -1){
//            System.out.println(s.pop() + " Popped from stack");
//        }else{
//            System.out.println("stack is empty");
//        }

    } 
}

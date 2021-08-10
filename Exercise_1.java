  class Stack {
    static final int MAX = 5;
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack
    boolean isStackOverflow = false;
    int i=0;
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(i==0){
            return true;
        }else {
            return false;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor

    }

    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(isStackOverflow){
            isStackOverflow = true;
        }else{
            if(i<a.length){
                a[i] =x;
                i++;
            }else {
                isStackOverflow = true;
            }
        }
        return isStackOverflow;
    }

    public void printArray(){
        for(int i=0;i<a.length;i++){
            System.out.println("Array Elements: "+a[i]);
        }
    }
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        int popElement=0;
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            popElement = a[i-1];
            a[i-1]=0;
            i--;
        }
        return popElement;
    } 
  
    int peek() 
    { 
        //Write your code here
        if(a.length!=0){
            int firstElement = a[0];
            return firstElement;
        }
        return 0;
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
        s.printArray();
        s.pop();
        System.out.println(s.pop() + " Popped from stack");
        s.peek();
        s.printArray();
    } 
}

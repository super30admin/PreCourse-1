class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        	//check whether the top is at index 0
        if(top==0){
            return true;
        }else{
            return false;
        }
       
    } 

    //initialize top with zero
    Stack() 
    { 
        top=0;
    } 
  
    
    boolean push(int x) 
    { 
    	//check if the array size is within the max capacity
        if(top<a.length-1){
        	//assign the new element to array value at index "top" and increment top
            a[top]=x;
            top++;
            return true;
        }else{
            return false;
        }
    } 
  
  
    int pop() 
    { 
    	//check if array is empty
        if(isEmpty()){
        	//print appropriate message if array is empty
            System.out.println("Stack Underflow");
            return 0;
        }else{
        	//assign array value at index "top-1" to a temp variable and then remove the element by making it to 0 and decrement top
            int result= a[top-1];
            a[top-1]=0;
            top--;
            return result;
        }
    } 
  
    //return the element present at the top index in the array
    int peek() 
    { 
        return a[top];
    } 
} 
  
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


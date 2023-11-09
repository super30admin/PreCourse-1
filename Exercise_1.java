class Stack { 
 //Please read sample.java file before starting.
//Kindly include Time and Space complexity at top of each file
 static final int MAX = 1000; 
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
     
 } 

 void push(int x) 
 { 

     if(top == MAX-1){
         System.out.println("Stack overflow");
         return;
     }
     top++;
     a[top]= x;
 } 

 int pop() 
 {

     isEmpty();
    int value= a[top];
    top--;
    return value;
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
     s.push(50); 
     System.out.println(s.pop() + " Popped from stack"); 
 } 
}
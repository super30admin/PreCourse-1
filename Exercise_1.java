class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
  static final int MAX = 1000; 
  int top; 
  int a[] = new int[MAX]; // Maximum size of Stack 

  Stack() 
  { 
      //Initialize your constructor 

      this.top=0;
     
  } 
  
  
  boolean isEmpty() 
  { 
      //Write your code here 
      if(this.top==0){

          return true;
      }else{return false;}
  } 



  boolean push(int x) 
  { 
      //Check for stack Overflow
      //Write your code here
      
      if(this.top>=MAX){ System.out.println("Stack overflow");return false;}
      else{ this.a[this.top]=x; this.top++; return true;  }


  } 

  int pop() 
  { 
      //If empty return 0 and print " Stack Underflow"
      //Write your code here

      if(this.top==0){System.out.println("Stack underflow");return 0;}
      else{
          int p=this.a[this.top-1];
          this.top--;

          return p;
      }
  
  } 

  int peek() 
  { 
      //Write your code here
      if(this.top==0){System.out.println("stack empty ") ;return 0;}
      else return this.a[this.top];
  } 
  
  void display() {
      
      for(int i=0;i<this.top;i++) {
          
          System.out.println(this.a[i]);
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

//Time complexity O(1)
// Space Complexity 
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top =-1; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
   
        //Write your code here 
    { 
        if(top == -1){
            return true;
        }
        else{
            return false;
        }

    } 

//    Stack() 
//    { 
//        //Initialize your constructor 
// 
//    	} 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top == a.length-1) {
			System.out.println("The stack is full");
			return false;
		}
		else {
			top++;
			a[top] =x;
			return true;
			
		}
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top==-1) {
			System.out.println("The stack is empty");
            return 0;
		}
		//System.out.println("The array before deletiong"+top);
		return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
    	if(top !=-1) {
    		
    	}
    	return a[top];
		//System.out.println("th+e to element is"+a[top]);
    } 
} 
  
//// Driver code 

public class Main_P1 {
public static void main(String[] args) {
	//Problem 1
	//Precourse_1 p = new Precourse_1();
	Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		//p.pop();
		//p.Display();
//	System.out.println("THE 1ST DELETED ELEMNET IS"+s.pop());
//	System.out.println("THE 2ND DELETED ELEMNET IS"+s.pop());
//	System.out.println("THE 3RD DELETED ELEMNET IS"+s.pop());
	s.peek();
	//Problem 2
//		Llist l = new Llist();
//		l.insert(1);
//		l.insert(2);
//		l.insert(3);
//	
//		l.show();
	//Problem 3
//	Llist2 l2 = new Llist2();
//	l2.push(10);
//	l2.push(20);
//	l2.push(30);
//	
//	System.out.println("THE 1ST DELETED ELEMNET IS"+l2.pop());
//	System.out.println("THE 2ND DELETED ELEMNET IS"+l2.pop());
//	System.out.println("THE 3RD DELETED ELEMNET IS"+l2.pop());
//	
//	l2.show();
	}
}

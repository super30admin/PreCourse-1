public class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    
    int top; 
    int a[100]; 
  
    boolean isEmpty() 
    { 
        return (top==-1);
    } 

    public Stack() 
    { 
        a= new int[100];
	    top=-1;
    } 
  
     boolean push(int x) 
    { 
       
        if(size()==a.length){
            System.out.println("Cant push more elements");
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

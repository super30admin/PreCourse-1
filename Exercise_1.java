/** Implemntation of a Stack
 * Stack :works on Last In First Out Mechanism
 *  with it's underlying data structure as an Array 
 * */

 /* Time Complexity : O(1)- for insertion
                      O(1)-for deletion
    Space Complexity : 0(size of the array)
    */
    
class Stack { 
    static final int MAX = 1000; 
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    /* Checks if the stack is empty or not */
    boolean isEmpty() 
    { 
        return (top<0);
         
    } 

    Stack() 
    { 
        
    }
    
    
  /* Push a value into the stack */
    
  boolean push(int x) 
    { 
        if(top>=MAX-1){
            System.out.println("Stack Overflow"); 
            return false; 
        }
        else
        {
            a[++top]=x;
            System.out.println("Pushed "+ x);
            return true;
        }
        
    } 


    /* Pops a value into the stack*/
    int pop() 
    { 
        if(top<0)
        {
            System.out.println("Stack Overflow");
            return 0;
        }
        else{
            return a[top--];
        }
       
    } 
    /* A peek into the top of the stack */
    int peek() 
    { 
        if(top<0)
            return 0;
        else 
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
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}

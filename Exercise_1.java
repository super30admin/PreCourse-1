//Time complexity for each poeration (push/pop/peek) - O(1) 
//Space complexity for each operations - O(1)

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top = -1;
    int a[] = new int[MAX]; // Maximum size of Stack
    public int counter; //to know the number of elements in the array
  
    boolean isEmpty() 
    {
        if ( a == null || counter == 0) return false;
        }
    }


    Stack(int counter)
    { 
       //Initialize your constructor
        this.counter = counter;
        this.a = new a[MAX];
    } 
  
    boolean push(int x) 
    {
        if(a.length > MAX) return false; //overflow check
        else { //code to push
           a[counter-1] = x;
           counter += 1;
        }
    }

  
    int pop() 
    { 
        if (a == null || counter == 0)  return -1;//If empty return 0 and print " Stack Underflow"
        else { //code to pop
            counter -= 1;
            return a[counter];
        }
    } 
  
    int peek() 
    { 
       if (a== null || counter==0) return -1;
       else {
           return a[counter - 1];
       }//Write your code here
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

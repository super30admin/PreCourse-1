// Time complexity: 
// PUSH - O(1)
// POP - O(1)
// PEEK - O(1)
// SUCCESS in Leetcode

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX];  
    int size;
  
    boolean isEmpty() { 
        return size == 0;
    } 

    Stack() { 
         top = -1;
         size = 0;
    } 
  
    boolean push(int x) { 
        if (a.length == 0 || size < a.length) {
            a[top + 1] = x;
            top++;
            size++;
            return true;
        } else {
            System.out.println("stack overflow");
            return false;
        }
    } 
  
    int pop() { 
        if (size == 0) {
            System.out.println("stack underflow");
            return -1;
        } else {
            int value = a[top];
            top--;
            size--;
            return value;
        }
    } 
  
    int peek() { 
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
        s.push(40); 
        s.push(50); 
        s.push(60); 
        System.out.println(s.peek());
        s.push(70); 
        System.out.println(s.peek());
        s.push(80); 
        s.push(90); 
        s.push(100); 
        s.push(110); 
        s.push(120); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}

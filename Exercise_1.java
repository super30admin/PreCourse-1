/*Time Complexity: The overall time complexity is O(1) for all he operations
push() operation : Checking for overflow and inserting the item into the top of the stack(array) takes O(1) time.
pop() operation : Checking for underflow and returning the poped item from stack(array) takes O(1) time.
peek() operation :  looking and getting the top element from stack(array) takes O(1) time.
hemce the overall time complexity is O(1).
Space Complexity :  an array is used to represent the items in the stack and if there are n items that needs to be processed(push,pop or peek) in the stack then at
maximum all n items will be either pushed, poped or peeked. Hence, the space complexity is O(n).

Did this code successfully run on Leetcode :
I could'nt find this problem in leetcode hence I executed in an IDE. At first when I ran this code I got error type not declared, then I include the public specifier
 for the constructor after which it successfully executed.

Any problem you faced while coding this :
At the begining I was not sure as to what to initialize in the constructor
*/
 //Your code here along with comments explaining your approach
class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    boolean isEmpty() {
        //Write your code here
        if (top <= -1) {
            return true;
        } else {
            return false;
        }
    }

    public Stack() {
        //Initialize your constructor
        top = -1;
    }

    boolean push(int x) {
        //Check for stack Overflow
        if (top >= a.length - 1) {
            System.out.println("Stack is full");
            return false;
        }

        //Write your code here
        else {
            top++;
            a[top] = x;
            return true;
        }
    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
            System.out.print("Satck underflow");
            return 0;
        }
        //Write your code here
        else {
            int pop_item = a[top];
            top--;
            return pop_item;
        }
    }

    int peek() {
        //Write your code here
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return a[top];
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

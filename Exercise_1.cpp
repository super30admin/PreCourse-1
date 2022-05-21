// Time complexity:
// push(), pop(), peek(), isEmpty() -> O(1) i.e. "constant time" since we can directly access elements in an array without using a loop

// Space complexity:
// O(n) since we will have to create extra space for an extra element while pushing elements.

// Problems faced - Got "extra qualification" errors while defining function names.


#include <bits/stdc++.h>
  
using namespace std;
  
#define MAX 1000

class Stack {
    int top;
  
public:
    int a[MAX]; // Maximum size of Stack
  
    Stack() { //Constructor here }
        top = -1;  // I initialised a pointer "top" that points to just before the first index of the array. Note - top is not an actual(*) pointer
    }
    bool push(int x)
    {
        //Your code here
        //Check Stack overflow as well
        // if condition checks the position of top pointer before pushing the value onto the stack.
        if(top == MAX - 1){
            cout << "Stack overflow!!";
            return false;
        }
        // if top pointer is not at the last index, it shifts top by one index to the right and then inserts the value onto the stack.
        else{
            top++;
            a[top] = x;
            cout << "Pushed to stack: " << x << endl;
            return true;
        }
        
    }

    int pop()
    {
        //Your code here
        //Check Stack Underflow as well
        // if condition checks the position of top pointer before pushing the value onto the stack.
        int poppedVal;
        if(top == - 1){
            cout << "Stack underflow!!";
            return top;
        }
        // if top pointer is not at the index before the first index of array, it shifts top by one index to the right and then inserts the value onto the stack.
        else{
            poppedVal = a[top];
            cout << "Value popped: " << poppedVal << " -->";
            top--;
            return poppedVal;
        }
        
    }
    
    // For the peek function should we not have a "position" variable to peek?
    int peek()
    {
        //Your code here
        //Check empty condition too
        
         int peekVal;
        // if condition checks if the stack is empty
        if(top == - 1){
            cout << "Stack is empty!!";
            return top;
        }
        // else it peeks the topmost value on the stack
        else{
            peekVal = a[top];
            cout << "Peek value : " << peekVal;
            return 1;
        }
    }
    bool isEmpty (){
        //your code here
        // if condition checks if the stack is empty. Returns true if it is empty.
        if(top == - 1){
            cout << "Stack is empty!!";
            return true;
        }
        else
            return false;
    }

  
};
  

// Driver program to test above functions
int main()
{
    class Stack s;
    s.push(10);
    s.push(20);
    s.push(30);
    cout << s.pop() << " : Popped from stack\n";
  
    return 0;
}

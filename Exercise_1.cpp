/*
 * Implementing Stacks using Arrays [LIFO]
 *
 * Time Complexity : 
 * Time complexity for individual operations top()/peek(), pop(), push() is O(1)
 * Time complexity for displaying the contents of the Stack or searching would be O(N)
 *      where N is the size of the Array.
 * 
 * Space Complexity : O(N) 
 *      worst case scenario if we need to add N elements, it will be O(N).
 * 
 * Did this code successfully run on Leetcode/VSCode : Yes
 * 
 * Any problem you faced while coding this : No
 * 
 * Your code here along with comments explaining your approach
 * 
 * 1. Focussed on basic primary operations on stacks : pop, push, peek
 * 2. Initialized a pointer top to keep a track of the elements that need to be
 *    pushed, popped or displayed.
 * 3. By manipulating the pointer top, implemented pop(), peek() and push()
 * 4. For edge conditions, the pointer value again holds importance since if it is as
 *    it was initialized before, means that there were no operations performed and
 *    the stack is empty or to check if the stack is not overflowing, if the top value
 *    goes beyond max size defined for the stack.
 */

#include<iostream>
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { top = -1;}
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty();
    int getTop();
}; 
  
bool Stack::push(int x) 
{ 
    //Your code here
    //Check Stack overflow as well
    if (top != MAX+1) {
        top++;
        a[top] = x;
        return true;
    }
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well

    if (top != MAX + 1 && top != -1) {
        top--;
        return a[top+1]; //Since we decremented the value of top, if we want to display
                         //popped item, it will be at an index + 1.
    }
} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too

    if (top != -1) {
        return a[top];
    }
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
    if (top == -1) {
        return true;
    }
    return false;
}

int Stack::getTop() {
    return top;
}
  
// Driver program to test above functions 
int main() 
{ 
    class Stack s; 
    s.push(10); 
    s.push(20); 
    s.push(30); 
    cout << s.pop() << " Popped from stack\n"; 

    if (s.isEmpty()) {
        cout << "Stack is empty \n";
    } else { 
        cout << s.peek() << " is the top element in the stack ";
        cout << "with total " << s.getTop() + 1 << " elements in the stack\n";
    }
    return 0; 
} 

#include <iostream>
#include "limits"

using namespace std; 
  
#define MAX 1000 

//
//Approach : As the problem statement requires stack to be implemented using Arrays, we implement the following steps:
//          1. Initialize top to -1
//          2. Initialize entire array to INT_MIN
//          3. Implementing Push : 
//                      a. Check whether stack is full.
//                      b. If full then throw an exception or else increment top by 1 and add an element at index top.
//                      c. Time Complexity : O(1) Constant Time
//                      d. Space Complexity : O(1) Constant Space
//          4. Implementing Pop :
//                      a. Check whether stack is empty.
//                      b. If empty then throw an exception or else return the element at index top, reset value at top to INT_MIN and decrement top by 1.
//                      c. Time Complexity : O(1) Constant Time
//                      d. Space Complexity : O(1) Constant Space
//          5. Implementing Peek :
//                      a. Check whether stack is empty.
//                      b. If empty then throw an exception or else return the element at index top.
//                      c. Time Complexity : O(1) Constant Time
//          6. Implementing isEmpty :
//                      a. Check whether top is -1.
//                      b. If it is -1, stack is empty.
//                      c. Returns true if stack is empty, false otherwise.


// Leetcode : Yes, Tried on playground, could not find array-stack implementation problem on leetcode.

//Class Stack
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { //Constructor here
        top = -1; 
        for(int i = 0 ; i < MAX; i++)
        {
            a[i] = INT_MIN;
        }
    } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    //Your code here
    //Check Stack overflow as well
    if(top == MAX - 1)
    {
        throw range_error("Overflown");
    }

    top++;
    a[top] = x;
    return true;
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well
    if(isEmpty())
    {
        throw range_error("Empty stack");
    }

    int temp = a[top];
    a[top] = INT_MIN;
    top--;
    return temp; 
} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too

    if(isEmpty())
    {
        throw range_error("Empty stack");
    }

    return a[top];
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here
    if(top < 0)
    {
        return true;
    } 

    return false;
} 
  
// Driver program to test above functions 
int main() 
{ 
    class Stack s; 
    for(int i = 0 ; i < MAX; i++)
    {
        s.push(i + 1);
    } 

    // s.push(0); // Should throw an exception

    while(!s.isEmpty())
    {
        cout << s.pop() << " Popped from stack\n"; 
    }

    // cout << s.pop(); //Should throw an exception
    return 0; 
} 

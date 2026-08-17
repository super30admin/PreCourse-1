// Time Complexity : Push: O(1), Pop: O(1), Peek: O(1), isEmpty: O(1)
// Space Complexity : Push: O(1), Pop: O(1), Peek: O(1), isEmpty: O(1)
// Did this code successfully run on Leetcode : yes (problem 1381)
// Any problem you faced while coding this : yes confusion with array bound while looping


#include <vector>
#include <algorithm> 
#include <iostream>

using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() {
        top = -1; //Intialize top to -1
    } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    if (top >= MAX - 1) { // Check if stack is already full
        cout << "Stack Overflow" << endl; 
        return false;
    }
    a[++top] = x; // Increment top then assign
    cout << "Pushed " << x << " on to top of stack\n"; 
    return true;
} 
  
int Stack::pop() 
{ 
    if (top < 0) { // Check if stack is already empty
        cout << "Stack is empty" << endl;
        return -1;
    }
    return a[top--]; // return current and then decrement top for next cycle;

} 
int Stack::peek() 
{ 
    if (top < 0) { // check if stack is empty
        cout << "Stack is empty" << endl;
        return -1;
    }
    return a[top]; // Just return top without decrementing
} 
  
bool Stack::isEmpty() 
{ 
    return (top < 0); // Same approach but return boolean
} 
  
// Driver program to test above functions 
int main() 
{ 
    class Stack s; 
    s.push(10); 
    s.push(20); 
    s.push(30); 
    cout << s.pop() << " Popped from stack\n"; 
  
    return 0; 
} 

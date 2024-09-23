#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
/*
Time Complexity:
  - push(): O(1)
  - pop(): O(1)
  - peek(): O(1)
  - isEmpty(): O(1)

Space Complexity: O(MAX) for the array used to store stack elements.
*/

class Stack {
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { // Constructor
        top = -1;
    } 
    
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
// Function to push an element to the stack
bool Stack::push(int x) 
{ 
    // Check for stack overflow
    if (top >= (MAX - 1)) {
        cout << "Stack Overflow\n";
        return false;
    } else {
        a[++top] = x;
        cout << x << " pushed into stack\n";
        return true;
    }
} 
  
// Function to pop an element from the stack
int Stack::pop() 
{ 
    // Check for stack underflow
    if (top < 0) {
        cout << "Stack Underflow\n";
        return -1;
    } else {
        int x = a[top--];
        return x;
    }
} 

// Function to peek at the top element of the stack
int Stack::peek() 
{ 
    // Check if stack is empty
    if (top < 0) {
        cout << "Stack is Empty\n";
        return -1;
    } else {
        return a[top];
    }
} 
  
// Function to check if the stack is empty
bool Stack::isEmpty() 
{ 
    return (top < 0);
} 
  
// Driver program to test above functions 
int main() 
{ 
    class Stack s; 
    s.push(10); 
    s.push(20); 
    s.push(30); 
    cout << s.pop() << " Popped from stack\n"; 
    cout << "Top element is " << s.peek() << endl;
    cout << "Stack empty: " << (s.isEmpty() ? "Yes" : "No") << endl;
  
    return 0; 
} 

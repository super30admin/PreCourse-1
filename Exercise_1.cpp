#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 

// Time Complexity for below operations : O(1)
// Space Complexity for stack : O(n)

class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { //Constructor here 
        top = -1;
    } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
// Time Complexity : O(1)
// Space Complexity : O(1)

// Increment top variable and assign provided data value to top index.

bool Stack::push(int x) 
{
    //Your code here
    //Check Stack overflow as well

    if (top == (MAX - 1))
        return false;

    a[++top] = x;
    return true;
} 

// Time Complexity : O(1)
// Space Complexity : O(1)

// Return value present at top index and decrement top.

int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 

    if (isEmpty())
        return -1;

    return a[top--];
} 

// Time Complexity : O(1)
// Space Complexity : O(1)

int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too

    if (isEmpty())
        return -1;

    return a[top];
} 

// Time Complexity : O(1)
// Space Complexity : O(1)

bool Stack::isEmpty() 
{ 
    //Your code here

    if (top == -1)
        return true;

    return false;  
} 

// Time Complexity : O(1)
// Space Complexity : O(1)

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

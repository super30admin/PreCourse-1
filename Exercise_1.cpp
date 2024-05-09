// Time Complexity: O(1) - push, pop and peek function operations are done in the constant time
// Space Complexity: O(1) - No extra space is used for the push, pop and peek functions

#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() 
    { 
        //Constructor here
        // Initializing 'top' variable 
        top = -1;
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
    
    if (top >= MAX-1)  // Checking Stack Overflow - comparing to maximum index
    {
        cout<<"Stack Overflow\n";
        return -1;
    }
    
    top++;              //Increment top to add values in new index

    a[top] = x;         // Assigning value to be pushed to stack 'a' at index 'top'
    return true;

} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 

    if (top < 0)        // Checking Stack Underflow - Empty Stack
    {
        cout<<"Stack Underflow - Empty Stack\n";
        return -1;
    }
    else
    {
        int num = a[top];
        
        top--;          // Decrement the index after pop
        return num;     // Returns value 'num' from stack 'a' at index 'top'
    }

} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    
    if (isEmpty())
    {
        cout<<"Empty Stack\n";
        return -1;
    }
    else
    {
        return a[top]; // Returns the top element of stack
    }
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here
    if (top == -1)     // Checking if top has initial value of -1 for Empty stack condition
    {
        return true;
    }
    else               // Stack has values
    {
        return false;
    }

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

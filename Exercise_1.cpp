#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  // firstly we need to decide which data structure to go with
  // if they have allowed us to use the stack our first choice is stackl
  // if not allowed our second choice is arraylist

  // Time complexity of each operation in this
  // push , pop,peek,isempty as we are using single operation to add value to stack time complexity is O(1)
  // and the maximum capacity to store the is already define 1000
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { //Constructor here 
                // we need to start with index -1 
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
    if(top >= MAX-1)
    {
        cout << "stack overflow" << endl;
        return false;
    }

    // now we need to store each element using the array
    a[++top] = x;

    return true;
    
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    if(top <= -1)
        return -1;
    int x  = a[top--];
    return x; 
} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    if(top <= -1)
        return -1;

    return a[top];
} 
  
bool Stack::isEmpty() 
{ 
   if(top <= -1)
        return true;
    return false;
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

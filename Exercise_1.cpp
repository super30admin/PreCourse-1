#include <iostream> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { top= -1; } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 

// Time Complexity of push : O(1)
// Space Complexity of push : O(1)

bool Stack::push(int x) 
{ 
    //Your code here
    //Check Stack overflow as well

    //If top is not pointing to the max then we can push element to the stack 
    //else there is no space in the stack.

    if (top < (MAX - 1)) {

        a[++top] = x;
        cout << x << " is pushed to the top of stack.\n";
        return true;
        
    }
    else {
        cout << "Stack Overflow occured.";
        return false;
    }
} 

// Time Complexity of pop : O(1)
// Space Complexity of pop : O(1)

int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 

    //If top is not pointing to the less than 0 then we can pop element from the stack 
    //else there is no element in the stack.

    if (top >= 0) {

        int temp = a[top--];
        return temp;
        
    }
    else {
        cout << "Stack Underflow occured.";
        return 0;
    }
}

// Time Complexity of peek : O(1)
// Space Complexity of peek : O(1)

int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too

    //If top is not pointing to the less than 0 then we can peek element from the stack 
    //else there is no element in the stack.

    if (top >= 0) 
    {
        return a[top];
    }
    else {
        cout << "Stack is Empty.";
        return 0;
    }
} 

// Time Complexity of isEmpty : O(1)
// Space Complexity of isEmpty : O(1)

bool Stack::isEmpty() 
{ 
    //Your code here
    if (top < 0)
    {
        return true;
    }
    else{
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
    
} 

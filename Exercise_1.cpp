/* Implement Stack using Array. */

#include <iostream> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack { 
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { top = -1; } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    //Your code here
    //Check Stack overflow as well
    if ( top >= (MAX - 1))
    {
        cout<<"Stack Overflow" <<endl;
        return false;
    }
    else
    {
        a[++top] = x;
        cout<<x<< "Pushed into stack " <<endl;
        return true;
    }
    
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    if (top < 0)
    {
        cout << " Stack underflow" <<endl;
        return 0;
    }
    else 
    {
        int x = a[top--];
        return x;
    }
    
} 


int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    if ( top < 0)
    {
        cout<<"Stack is empty"<< endl;
        return 0;
    }
    else
    {
        int x = a[top];
        return x;
    }
    
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
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
  
    return 0; 
} 

/*
Time Complexities of Stack implementation using array
Push()    - O(n)
pop()     - O(1)
isEmpty() - O(1)
peek()    - O(1)
*/
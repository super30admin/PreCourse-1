// Time Complexity : O(1)
// Space Complexity : O(1)
// Any problem you faced while coding this : no

#include <iostream> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { 
        //Constructor
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
    if ( top < MAX-1 )
    {
        top++;
        a[top] = x;
        return true;
    }
    return false;
} 
  
int Stack::pop() 
{ 
    //Your code here
    if(isEmpty())
    {
        return -1;
    }
    top = top - 1;
    return top;
} 
int Stack::peek() 
{ 
    //Your code here
    if (isEmpty())
    {
        return -1;
    }
    return a[top];
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
    if(top == -1)
    {
        return true;
    }
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

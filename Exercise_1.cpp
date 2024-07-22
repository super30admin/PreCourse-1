// Time Complexity : O(1) for all operations
// Space Complexity : O(N) where N in max size of array
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach

#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  
public:   
    Stack() 
    { 
        //Constructor here
    }

    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 

private: 
    int stack_size = 0; // Number of items filled in stack
    int stack[MAX];     // Maximum capacity of Stack 

}; 
  
bool Stack::push(int x) 
{ 
    if(stack_size >= MAX)
    {
        // If stack is full to max capacity,
        // do not do anything and return false as an unsuccessful operation

        return false;
    }

    stack[stack_size] = x;
    stack_size++;

    return true;
} 
  
int Stack::pop() 
{ 
    int item_to_return;

    if(isEmpty() == false)
    {
        // If stack has elements in it, return the last element entered
        // i.e. top element of stack
        item_to_return = stack[stack_size-1];
        stack_size--;
    }
    else
    {
        cout << "Error: Popping from an empty stack. Returned value is random garbage value\n";
    }

    if(stack_size < 0)
    {
        // reset stack size
        stack_size = 0;
    }

    return item_to_return;

} 
int Stack::peek() 
{ 
    int item_to_return;
    if(isEmpty() == false)
    {
        item_to_return = stack[stack_size-1];
        stack_size--;
    }
    else
    {
        cout << "Error: Stack is empty. Returned value is invalid value\n";
    }

    return item_to_return;

} 
  
bool Stack::isEmpty() 
{ 
    if(stack_size == 0)
    {
        return true;
    }

    return false;
} 
  
// Driver program to test above functions 
int main() 
{ 
    Stack s;
    s.push(10); 
    s.push(20); 
    s.push(30); 
    cout << s.pop() << " Popped from stack\n";
    cout << s.pop() << " Popped from stack\n"; 
    cout << s.pop() << " Popped from stack\n"; 
    cout << s.pop() << " Popped from stack\n"; 
  
    return 0;
}
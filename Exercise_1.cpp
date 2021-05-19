// Time Complexity: all functions require O(1) Time 
// Space Comlexity: constant space O(1), no extra space used apart from the pre-defined array for stack which is not included


#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack { 
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { top = -1; } // Constructor
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    if(top >= MAX - 1){
        cout<<" Overflow - Stack is full already\n";
        return false;
    }
    else {
        ++top;
        a[top] = x;
        cout<<x<<" Inserted into the stack\n";
        return true;
    }
} 
  
int Stack::pop() 
{ 
    if (top < 0)
    {
        cout << " Underflow, stack is empty - nothing to return\n";
        return 0;
    }

    else
    {
        int temp = a[top];
        top--;
        return temp;
    }
} 
int Stack::peek() 
{ 
    if(!Stack::isEmpty() ){
        return a[top];
    }
    else {
        cout<<"\n Stack is empty\n";
        return 0;
    }
} 
  
bool Stack::isEmpty() 
{ 
    if(top < 0){
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
  
    return 0; 
} 
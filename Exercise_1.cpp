#include <bits/stdc++.h> 
  
using namespace std; 
   // Time Complexity of Push, Pop , Peak and IsEmpty is O(1) (constant time)
   // Space Complexity of Push, Pop , Peak and IsEmpty is O(1) (constant time)
#define MAX 1000 
  
class Stack {
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { 
        // Initialise the top to 0.
        top = 0;
    }//Constructor here } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    // Stack overflow condition
    if(top == MAX-1){
        // top reached the max capacity of the stack , so cannot push.
        return false;
    }

    //Increment the top as the new element is pushed
    top++;
    // Add the element value to the stack
    a[top] = x;
    return true;
} 
  
int Stack::pop() 
{ 
    //Stack Underflow
    if(top == -1){
        // cannot pop the element from the stack
        return false;

    }

    // Store the value in a temp to return in the function 
    int ele = a[top];
    //Decrement  the top as the element is removed
    top--;
    // Return the element at the top
    return ele;
} 
int Stack::peek() 
{ 
    //Empty Stack condition
     if(top == -1){
        // cannot get the element from the stack as stack is empty
        return false;

    }
    return a[top];
} 
  
bool Stack::isEmpty() 
{ 
    //Check the top index 
    if(top == -1){
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

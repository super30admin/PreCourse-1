// Time Complexity :
//push, pop, pee, isEmpty - O(1)

// Space Complexity :
// O(n), n - the maximum size of stack
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
// I first compiled using gcc and it is showing error and then i fixed it with g++


// Your code here along with comments explaining your approach


#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { top = 0; } //Constructor here //initializing the top = 0 to represent empty stack
    bool push(int x); 
    int pop();  //return top and remove it
    int peek();  // just return top without removing it 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{
    //Your code here
    //Check Stack overflow as well
    if(top >= MAX){
        cout << "Stack is full"<< endl;  // if top is MAX then array is full so no elements can be added.
        return false;
    }
    else{
        a[top] = x;
        top = top + 1;
        return true;
    }
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    if(top <= 0){
        cout << "Stack is Empty"<< endl;
        return 0;
    }
    else{
        int y = a[top - 1];
        top = top - 1;
        return y;
    }
} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    if(top <= 0){
        cout << "Stack is Empty"<< endl;
        return 0;
    }
    else{
        return a[top -1];
    }

} 
  
bool Stack::isEmpty() 
{ 
    if(top <= 0){
        return true;
    }
    else{
        return false;
    }
    //Your code here 
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
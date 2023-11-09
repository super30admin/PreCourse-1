//Time Complexity : O(1)
//Space Complexity : O(1)

#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    
  
public: 
    int top = -1;
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { //Constructor here 
    } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    if(top == (MAX - 1)) {
        return false;
    } else {
        ++top;
        a[top] = x;
        return true;
    }
    // top is the index value of last element present in stack. If it's value exceeds the maximum size of stack over flow occurs
    // if top value is in the acceptable range, top will be incremented and new data will be added at that index
    // this new data's index will be the value of top 
} 
  
int Stack::pop() 
{ 
    int res;
    if(top == -1) {
        return 0;
    } else {
        res = a[top];
        --top;
        return res;
    }
    // If there is no element present in stack, value of top will be -1
    // If there are any elements present in stack, current value in top index will be printed and top is decremented
} 
int Stack::peek() 
{ 
    if(top == -1) {
        return 0;
    }
    return a[top];
    // If top value is -1, there is no peek element
} 
  
bool Stack::isEmpty() 
{ 
    if(top == -1) {
        return true;
    }
    return false;
    // If top value is -1, there are no elements present in stack
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

// Any problem you faced while coding this : No
// Couldn't find the question in leetcode

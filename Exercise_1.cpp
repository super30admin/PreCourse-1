// Time Complexity : O(1)
// Space Complexity : 
// Did this code successfully run on Leetcode : Not on leet code
// Any problem you faced while coding this : Had to initialize variable top before which was not in the code here section. 

#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
    // Variable top initialized with -1 to keep track of empty stack
    int top = -1; 
  
public: 
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
    //Your code here
    //Check Stack overflow as well
    if (top > MAX){
        return false;
    }
    top ++;
    a[top] = x;
    return true;
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well
    if (top < 0){
        cout << "Stack Underflow";
        return 0;
    }
    int popped = a[top]; 
    a[top] = 0;
    top--;
    return popped;

} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    if (top < 0){
        return 0;
    }
    else{
        return a[top];
    }
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
    if (top < 0){
        return true;
    }
    else{
        return false;
    }
} 
  
// Driver program to test above functions 
int main() 
{ 
    Stack s; 
    s.push(10); 
    s.push(20); 
    s.push(30); 
    cout << s.pop() << " Popped from stack\n"; 
  
    return 0; 
} 

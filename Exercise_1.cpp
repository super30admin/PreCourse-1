// Time Complexity : 
// push(): O(1)
// pop(): O(1)
// peek(): O(1)
// isEmpty(): O(1)
// Space Complexity : O(MAX) as the stack is initialized with maximum size
// Did this code successfully run on Leetcode :-
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//use the top integer to keep track of the last element pushed into the array. Using that, all the operations can be performed easily.

#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() {
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
    if(top > MAX-1){
        return false;
    }
    else{
        top++;
        a[top] = x;
        return true;
    }
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    if(top < 0){
        return -1;
    }
    else{
        int popVal = a[top];
        top--;
        return popVal;
    }
} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    if(isEmpty()){
        return -1;
    }
    else{
        return a[top];
    }
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here
    if(top == -1){
        return true;
    } 
    else return false;
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

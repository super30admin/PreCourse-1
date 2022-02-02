//Time complexity:
//O(1) as we are just doing insertion and deletion

//Space Complexity:
//O(1) as we as we are just doing insertion and deletion

//The code ran perfectly

#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
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

    if(top >= MAX){
        return false; //Stack Overflow
    } else {
        top++;
        a[top] = x;
        return true; //The integer is successfully pushed to the stack
    }
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    if(top<0){
        return 0; //Stack underflow
    } else {
        int topEl = a[top];
        top--; 
        return topEl; //returns the top element of the stack and also removes it from the stack
    }
} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    if(top<0){
        return 0; // if the stack is empty returns 0
    } else {
        int topEl = a[top];
        return topEl; // returns the to element of the stack
    }
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
    return top<0; //returns 0 if the stack is not empty and returns 1 otherwise
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

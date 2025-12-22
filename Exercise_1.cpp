// Time Complexity = O(1) ; fixed number of steps
// Space Complexity = O(1) ; fixed size of the array

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
    if (top == MAX - 1){
        return false;
    }
    else{
        top = top + 1;
        a[top] = x;
        return true;
    }
} 
  
int Stack::pop() 
{ 
    if (top == -1){
        return -1;
    }
    else{
        int temp = a[top];
        top--;
        return temp;
    }
} 
int Stack::peek() 
{ 
    if (top == -1){
        return -1;
    }
    else {
        return a[top];
    }
} 
  
bool Stack::isEmpty() 
{ 
    if (top == -1){
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

TC - O(n) for all the operations involving push,pop...rest of them is O(1)
#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
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
    if (top >= MAX) {
        return false;
    }
    top++
    a[top] = x;
} 
  
int Stack::pop() 
{ 
    if (top < 0) { return -1; }
    int tmp = a[top];
    top--;
    return tmp;
} 

int Stack::peek() 
{ 
    if (top == -1) return -1;
    else return a[top];
} 
  
bool Stack::isEmpty() 
{ 
    if (top == -1) return true;
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

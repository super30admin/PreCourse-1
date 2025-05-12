//Time Complexity :push O(1), pop O(1), peek O(1), isEmpty O(1)
//Space Complexity : O(Max)



#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { top = -1;}
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    if(top >= (MAX - 1)){
        cout << "Stack Overflow\n";
        return false;
    }else{
        a[++top] = x;
        cout << x << " pushed into Stack\n";
        return true;
    }
} 
  
int Stack::pop() 
{ 
    if(top < 0){
        cout << "Stack Underflow\n";
        return 0;
    }else{
        int x = a[top--];
        return x;
    }
    
} 
int Stack::peek() 
{ 
    if(top < 0){
        cout <<"Stack is Empty\n";
        return 0;
    }else{
        return a[top];
    }
} 
  
bool Stack::isEmpty() 
{ 
    return (top < 0); 
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

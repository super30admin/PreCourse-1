#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack { 
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
    if(top == MAX - 1){
        throw string("Stack is full. Can't push!!!");
    }
    else{
        top++;
        a[top] = x;
        return true;
    }
} 
  
int Stack::pop() 
{ 
    if(top == -1){
        throw string("Stack is empty. Can't pop!!!");
    }
    else{
        int topElement = a[top];
        top--;
        return topElement;
    }
} 
int Stack::peek() 
{ 
    if(top == -1){
        throw string("Stack is empty. Can't peek!!!");
    }
    else{
        return a[top];
    }
} 
  
bool Stack::isEmpty() 
{ 
    if(top == -1)
        return true;
    else
        return false;
} 
  
// Driver program to test above functions 
int main() 
{ 
    try{
        class Stack s; 
        s.push(10);
        s.push(20);
        s.push(30);

        int data = s.pop();

        cout << data << " Popped from stack\n"; 
    }
    catch(string msg){
        cout << msg << endl;
    }

    return 0; 
} 
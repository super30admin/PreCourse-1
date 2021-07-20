#include <iostream> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack { 
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { //Constructor here }
        top=-1;
    } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    //Your code here
    if(top==MAX-1){
        cout<<"Stack Overflow!";
        return false;
    }
    top++;
    a[top]=x;
    return true;
    //Check Stack overflow as well
} 
  
int Stack::pop() 
{ 
    //Your code here
    if(top==-1){
        cout<<"Stack Underflow!";
        return -1;
    }
    top--;
    return a[top+1];
    //Check Stack Underflow as well 
} 
int Stack::peek() 
{ 
    //Your code here
    if(top==-1){
        cout<<"Stack Empty!";
        return -1;
    }
    return a[top];
    //Check empty condition too
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here
    if(top==-1){
        return true;
    } 
    return false;
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
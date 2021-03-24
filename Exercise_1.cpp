#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack { 
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() {top=-1;}
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    //Your code here
    //Check Stack overflow as well
    if(top>=MAX-1){
        cout<<"Strack overflow"<<endl;
        return false;
    }
    else{
        a[++top] = x;
        cout<<x<<" has been added to the stack"<<endl;
        return true;
    }
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    if(top<0){
        cout<<"Stack underflow"<<endl;
        return 0;
    }
    else{
        return a[top--];
    }
} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    if(top<0){
        cout<<"Stack underflow"<<endl;
        return 0;
    }
    else{
        return a[top];
    }
    return 0;
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
    if(top<0){
        cout<<"Stack underflow"<<endl;
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
    cout<<s.peek()<<" is peeked\n";
    if(s.isEmpty()){
        cout<<"The stack is empty"<<endl;
    }
    else{
        cout<<"The stack is not empty"<<endl;
    }
  
    return 0; 
} 

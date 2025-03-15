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
        top=-1;
    } //Constructor here } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    int cur=top;
    //Your code here
    if(top>MAX){
        return 0;
    }
    a[cur++]=x;
    return 1;
    //Check Stack overflow as well
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    if(top==-1){
        return -1;
    }
    int ans=a[top];
    (top)--;
    return ans;
} 
int Stack::peek() 
{ 
    //Your code here
    if(top==-1){
        return -1;
    }
    return a[top];
    //Check empty condition too
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
    if(top==-1){
        return 1;
    }
    return 0;
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
#include <bits/stdc++.h>
  
using namespace std;
  
#define MAX 1000
  
class Stack {
    int top;
  
public:
    int a[MAX]; // Maximum size of Stack
    Stack() { top = -1; }   //Constructor here
    bool push(int x);
    int pop();
    int peek();
    bool isEmpty();
};
  
bool Stack::push(int x)
{
    //Your code here
    //Check Stack overflow as well
    try
    {
        if(top<(MAX-1))
            a[++top] = x;
        else
            throw(top);
    }
    catch(int flag)
    {
        cout<<"Stack Overflow"<<endl;
    }
}
  
int Stack::pop()
{
    //Your code here
    //Check Stack Underflow as well
    try
    {
        if(top>-1)
            return a[top--];
        else
            throw(top);
    }
    catch(int flag)
    {
        cout<<"Stack Underflow"<<endl;
    }
}
int Stack::peek()
{
    //Your code here
    //Check empty condition too
    int temp;
    if(top<0)
        cout<<"Stack is Empty!"<<endl;
    else
        temp = a[top];
    return temp;
}
  
bool Stack::isEmpty()
{
    //Your code here
    return (top<0);
        
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

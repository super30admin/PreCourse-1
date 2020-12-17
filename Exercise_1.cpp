#include <iostream>


using namespace std;

#define MAX 1000

class Stack {
    int top;

public:
    int a[MAX]; // Maximum size of Stack

    Stack()
    {
        top=-1;
    }
    bool push(int x);
    int pop();
    int peek();
    bool isEmpty();
};

bool Stack::push(int x)
{

    if (top==MAX-1)    //Check Stack overflow as well
    {
            cout<<"Stack is full";
    }
    else
    {
        top++;      //increment index
        a[top]=x;   //push element onto stack
    }
}

int Stack::pop()
{
    if(isEmpty())   //Check Stack Underflow as well
    {
        cout<<"Stack is empty! cannot retrieve elements!";
    }
    else
    {
        return a[top];
        top--;
    }
}
int Stack::peek()
{
    if(isEmpty())   //Check empty condition too
    {
        cout<<"Stack is empty! Cannot retrieve elements!";
    }
    else
        return a[top];
}

bool Stack::isEmpty()
{
    if (top==-1)    //if index is at minimum position
        return true;
    else
        return false;
}

int main()
{
    class Stack s;
    s.push(1);
    s.push(2);
    s.push(3);
    cout<<s.pop()<<"Popped from stack\n";
    return 0;
}

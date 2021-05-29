#include <iostream>


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
    if(top>= (MAX-1)) {
        cout<<"Stack is Overflow";
        return false;
    }
    else {
        a[++top]=x;
        cout<<"Element pushed in stack is "<<x<<endl;
        return true;
    }
    //Your code here
    //Check Stack overflow as well
}

int Stack::pop()
{
    if(top<0)//underflow condition
    {
        cout<<"Stack is underflow";
        return 0;
    }
    else {
        int x = a[top--];//pop out x, reduce the top
        return x;
    }
    //Your code here
    //Check Stack Underflow as well
}
int Stack::peek()
{
    if(top<0)//Empty condition
    {
        cout<<"Stack is empty";
        return 0;
    }
    else //if not empty
    {
        int x = a[top];//save top of element in variable x
        return x;
    }
    //Your code here
    //Check empty condition too
}

bool Stack::isEmpty()
{
    return (top<0);
    //Your code here
}

// Driver program to test above functions
int main()
{
    class Stack s;
    s.push(10);
    s.push(20);
    s.push(30);
    cout<< "Element Popped from stack is : " << s.pop()<<endl;
    cout<< "Elements present in the stack are: ";
    while(!s.isEmpty())
    {
        cout<<s.peek()<<" ";

        s.pop();
    }

    return 0;
} 

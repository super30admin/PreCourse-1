#include<iostream>
using namespace std;
#define MAX 1000

class Stack {
    int top=-1;

public:
    int a[MAX];// Maximum size of Stack;
    Stack() {}
        bool push(int x);
        int pop();
        int peek();
        bool isEmpty();

    };

bool Stack::push(int x)
    {
        if(top<=MAX-1)
        {
            ++top;
            a[top]=x; return true;

        }
        else{

            cout<<"Stack Overflow"; return false;
        }
    }

    int Stack::pop()
    {
            if (isEmpty()) {
                cout<<"Stack Underflow";
               return 0;

            } else {

                return a[top--];
            }
    }
    int Stack::peek()
    {

    int n= top;
        if(isEmpty())
        {
            cout<<"Stack Empty";
            return 0;
        } else{
            return a[n];
        }

    }

    bool Stack::isEmpty()
    {
        if(top<0)
        {
            return true;
        }
        else
        {
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

        cout<<s.peek();
        return 0;
    }
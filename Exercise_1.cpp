#include <bits/stdc++.h>

using namespace std;

#define MAX 1000

class Stack {
    int top;

public:
    int a[MAX]; // Maximum size of Stack

    Stack() { //Constructor here }
        top = -1;
    }
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
        cout<<"Stack overflow"<<endl;
        return -1;
    }
    else{
        a[++top] = x;
        return 1;
    }


}

int Stack::pop()
{
    //Your code here
    //Check Stack Underflow as well
    cout<<"Top in pop "<<top<<endl;
    if(top <= -1){
        cout<<"Stack Underflow"<<endl;
        return -1;
    }else{
        return a[top--];
    }
}
int Stack::peek()
{
    //Your code here
    //Check empty condition too
    if(isEmpty()){
        puts("Stack is empty");
        return -1;
    }else{
        return a[top];
    }
}

bool Stack::isEmpty()
{
    //Your code here
    if(top == -1)
        return 1;
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

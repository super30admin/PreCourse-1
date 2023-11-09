// ConsoleApplication1.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

using namespace std;

#define MAX 1000 

//Time complexity of push, pop methods O(1)
//Space complexity is O(n)

class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
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
    //check for overflow
    if (top == MAX - 1) {
        cout << "Stack is full";
        return false;
    }
    else {

        top++;
        a[top] = x;

    }
}

int Stack::pop()
{

    //Check for Stack Underflow
    if (top == -1) {
        return -1;
    }

    else {
        int popvalue = a[top];
        top--;
        return popvalue;
    }

}
int Stack::peek()
{
    if (isEmpty()) {
        cout << "Stack is empty";
        return -1;
    }

    else {
        cout << "Top element is " << a[top];
    }
    //Check empty condition too
}

bool Stack::isEmpty()
{
    if (top == -1)
        return true;
    else
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




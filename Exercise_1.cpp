#include <stdio.h>
#include <iostream>

using namespace std;
#define MAX 1000

int top = -1;
int arr[MAX];

int push(int num)
{
    if (top <= MAX)
    {
        top++;
        arr[top] = num;
    }

    else
    {
        cout << "Stack Overflow";
    }

    return 0;
}

int pop()
{
    if (top <= -1)
    {
        cout << "Cannot perform pop operation as stack is empty";
    }

    else
    {

        cout << "The popped element is: " << arr[top] << endl;
        top--;
    }
    return 0;
}

void peek()
{
    for (int i = 0; i <= top; i++)
    {
        cout << arr[i] << "\n";
    }
}

int main()
{
    // Stack obj1;

    // obj1.push(5);
    // obj1.push(1);
    // obj1.push(2);
    // obj1.push(4);
    // obj1.peek();

    // return 0;
    push(5);
    push(10);
    push(7);
    // pop();
    peek();
}

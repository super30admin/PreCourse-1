#include <iostream>
#define MAX 1000
using namespace std;

class Stack {
    int top;

public:
    int a[MAX]; // Maximum size of Stack // 10,20,30
    int index = 0;//2
    int size = 0;//2
    Stack() {
    }
        bool push(int x);
        int pop();
        int peek();
        bool isEmpty();
    };

    bool Stack::push(int x) {
        if (size >= MAX) {
           cout<<"The Stack is full, we cannot insert";
            return false;
        }
            a[index] = x;
            index++;
            size++;
            return true;
    }
    int Stack::pop() {
        int val = -1;
        if(isEmpty()) {
            cout<<"The Stack is already empty, there is nothing to remove ";
        }else {
            val = a[index-1];
            a[index-1] = 0;
            index--;
            size--;
        }
        return val;
    }

    int Stack::peek() {
        if (isEmpty()) {
            cout << "The Stack is already empty, there is nothing to show ";
            return -1;
        }
            return a[index - 1];

    }

    bool Stack::isEmpty() {
        if(size == 0){
            return true;
        }
        return false;
    }

int main() {
        cout << "OM SAI RAM" << endl;
        class Stack s;
        s.push(10);
        s.push(20);
        s.push(30);
        cout << s.pop() << " Popped from stack\n";
        return 0;
}
#include<iostream>
#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack { 
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { //Constructor here 
        top = -1;
    } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    //Stack Full condition
    if(top == MAX-1)
    {
        cout << "Stack Full!" << endl;

        return false;
    }

    //Increment top and insert value x
    top++;

    a[top] = x;

    return true;
} 
  
int Stack::pop() 
{ 
    if(top == -1)
    {
        cout << "Stack Empty!" << endl;
    }

    //Get top value and decrement top

    int ret_num = a[top];

    top--;

    return ret_num;
} 
int Stack::peek() 
{ 
    if(top == -1)
    {
        cout << "Empty Stack!" << endl;
        return -1;
    }
    else
    {
        //Return the Top-most element
        return a[top];
    }
} 
  
bool Stack::isEmpty() 
{ 
    //Empty Stack condition
    if(top == -1)
    {
        return true;
    }
    //Non-Empty Stack condition
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
  
    return 0; 
} 

/**
 * @brief Comments on Space and Time Complexity
 * Time - An Array will have O(1) access time for all operations.
 * 
 * Space - The Space occupied will depend on the Max number of elements.
 * 
 */
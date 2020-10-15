// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :  Not available on leetcode
// Any problem you faced while coding this : None



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
    //Your code here
    //Check Stack overflow as well
    if(top == MAX - 1){
        return false;
    }
    else{
        top++;
        a[top] = x;
        return true;
    }
}
  
int Stack::pop()
{
    //Your code here
    //Check Stack Underflow as well
    if(isEmpty()){
        return -1;
    }
    else{
        return a[top--];
    }
}
int Stack::peek()
{
    //Your code here
    //Check empty condition too
    if(!isEmpty()){
        return a[top];
    }
    return -1;
}
  
bool Stack::isEmpty()
{
    //Your code here
    if(top == -1){
        return true;
    }
    else{
        return false;
    }
}

// Driver program to test above functions
int main()
{
    class Stack s;
    
    if(s.isEmpty())
    {
        cout << "Stack is Empty!" << endl;
    }
    
    if(s.push(10)){
        cout << "10 is pushed into the stack\n";
    }
    else{
        cout << "Stack Overflow!" << endl;
    }
    
    int x = s.peek();
    if(x == -1){
        cout << "Stack is Empty!" << endl;
    }
    else{
        cout << x << " is the top element in the stack\n";
    }
    
    if(s.push(20)){
        cout << "20 is pushed into the stack\n";
    }
    else{
        cout << "Stack Overflow!" << endl;
    }
    
    if(s.push(30)){
        cout << "30 is pushed into the stack\n";
    }
    else{
        cout << "Stack Overflow!" << endl;
    }
    int y = s.pop();
    if(y == -1){
        cout << "Stack Underflow!" << endl;
    }
    else{
        cout << y << " is popped from stack\n";
    }
    
    y = s.pop();
    if(y == -1){
        cout << "Stack Underflow!" << endl;
    }
    else{
        cout << y << " is popped from stack\n";
    }
    
    y = s.pop();
    if(y == -1){
        cout << "Stack Underflow!" << endl;
    }
    else{
        cout << y << " is popped from stack\n";
    }
    
    y = s.pop();
    if(y == -1){
        cout << "Stack Underflow!" << endl;
    }
    else{
        cout << y << " is popped from stack\n";
    }
  
    return 0;
}

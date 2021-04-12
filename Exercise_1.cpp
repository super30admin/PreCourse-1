#include <iostream> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack { 
    int top;
public: 
    int a[MAX]; // Maximum size of Stack 
    int len;
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
    //Your code here
    //Check Stack overflow as well
    if(top >= MAX){
        cout<<"Array Size is full"<<endl;
        return false;
    }
    else{
        a[++top] = x;
        return true;
    }    
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    if(top<=-1){
        cout<<"Cant pop when array is empty"<<endl;
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
    if(top<=-1)
        return -1;
    return a[top];
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
    if(top>-1)
        return false;
    return true;
} 
  
// Driver program to test above functions 
int main() 
{ 
    class Stack s; 
    s.push(10); 
    s.push(20); 
    s.push(30); 
    cout << s.pop() << " Popped from stack\n";
    cout << s.peek()<<" is the top element in the stack\n";
    cout << s.pop() << " Popped from stack\n";
    cout << s.pop() << " Popped from stack\n";
    cout << s.isEmpty() << " 0:False 1:True\n";
    return 0; 
} 
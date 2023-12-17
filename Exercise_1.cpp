#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() {
        top=-1;
            }
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  

bool Stack::push(int x)
{
   if (top == MAX-1){
       cout<<"CANNOT PERFORM PUSH "<<endl;
       return false;
   }
   else {
       a[++top]=x;
       cout<<x<<" Pushed Successfully"<<endl;
       return true;
   }

}

int Stack::pop()
{
    if (isEmpty()){
        cout<<"CANNOT PERFORM POP"<<endl;
        return 0;
    }
    else{
        cout<<a[top]<<" popped from Stack"<<endl;
        top--;
        return 0;
    }

}
int Stack::peek()
{

    if (isEmpty()){
        cout<<"CANNOT PEEK AN EMPTY STACK"<<endl;
        return 0;
    }
    else {
        cout<<"STACK PEEKING:- "<<endl;
        for ( int i=0; i<=top; i++)
        {
            cout<<a[i]<<endl;
        }
    }
    return 0;

}

bool Stack::isEmpty()
{
    if (top==-1)
    {
        cout<<"Stack is Empty!!!"<<endl;
        return true;
    }
    else {
        return false;}
}

  
// Driver program to test above functions 
int main() 
{ 
    class Stack s;

    s.push(10); 
    s.push(20); 
    s.push(30);
    s.peek();
    s.pop();
    s.pop();
    s.pop();
    s.pop();
    s.isEmpty();
    s.peek();
  
    return 0; 
} 

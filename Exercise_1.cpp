#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top = -1; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { //Constructor here } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool push(int x) 
{   if(top == MAX - 1) {
    cout<< "Stack Overflow";
    return false;
}
else{
    top++;
    a[top] = x;
    cout<<"pushed = "<<x<<endl;
    return true;
}
    //Your code here
    //Check Stack overflow as well
} 
  
int pop() 
{   int val;
    if(top == -1){
        cout<< "stack overflow";
        return top;
    }
    else{
        val = a[top];
        top--;
        cout<< "popped =" <<val<<endl;
        return val;
    }
    //Your code here
    //Check Stack Underflow as well 
} 
int peek() 
{   int peakval;
if(top == -1){
    cout<< "stack is empty";
    return top;
}
else{
    peakval = a[top];
    cout<< "value = " << peakval << endl;
    return peakval;
}
    //Your code here
    //Check empty condition too
} 
  
bool isEmpty() 
{ 
    if(top==-1){
        cout<<"stack is empty";
        return true;
} 
else
return false;
}
// Driver program to test above functions 
};
int main() 
{ 
    class Stack s; 
    s.push(10); 
    s.push(20); 
    s.push(30); 
    cout << s.pop() << " Popped from stack\n"; 
    s.peek();
    s.isEmpty();
  
    return 0; 
} 


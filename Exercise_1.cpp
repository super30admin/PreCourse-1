#include <bits/stdc++.h> 
  
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
    if(top <=MAX-1){
        top++;
        a[top] = x;
    }
    else{
        cout<<"Stack Overflow\n";
    }
    
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    if(top<0){
        cout<<"Stack Underflow\n";
    }
    else{
        int x = a[top];
        top--;
        return x;
    }
        
}
    
 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
     if(top>=0){
        int x = a[top];
        return x;
    }
    else{
        cout<< "Empty Stack\n";
    }
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
    return top<0;
} 
  
// Driver program to test above functions 
int main() 
{ 
    class Stack s; 
    s.push(10); 
    s.push(20); 
    s.push(30); 
    cout << s.pop() << " Popped from stack\n"; 
    cout<<s.peek()<<" Peek test\n";
    s.push(40);
    cout<<s.peek()<<" Push Validation\n";
    cout<<s.pop()<<" Re Pop Test\n";
  //Empty the stack for empty Test
    s.pop();
    s.pop();
    s.pop();//underflow check
    cout<<s.isEmpty();//should return 1
  //for overflow test I'd use a for loop and check the output
    return 0; 
} 

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

// Time Complexity : O(1)
// Space Complexity : O(1)  
bool Stack::push(int x) 
{ 
    //Your code here
    //Check Stack overflow as well
    if(top < MAX-1){   //Check for overflow
        top+=1;        
        a[top] = x;
        return true;
    }
    else{
        return false;
    }
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    int ret = -2;
    if(top>=0){
        ret = a[top];
        top+=-1;
    }
    return ret;
} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
    if(!isEmpty()){
        return a[top];
    }
    else{
        return -1;
    }
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
    if(top>=0){
        return false;
    }
    else{
        return true;
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
    cout << s.peek() << " Top element from stack after pop operation\n"; 
    s.pop();
    s.pop();
    cout << s.peek() << " After all element is popped out\n";
    s.pop(); //Check for Underflow
    for(int i=0; i<MAX;i++){
        s.push(i);
    }
    cout << s.peek() << " Top element after all elements are pushed in\n";
    s.push(1000);
    cout << s.peek() << " Top element should be unchanged, due to overflow reasons\n";
    return 0; 
} 
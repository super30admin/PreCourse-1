/*
Time Complexity:
O(1) - push(),pop(),peek(),isempty()

Space Complexity: O(1) for each operation 
*/


// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


#include<iostream>
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int arr[MAX]; // Maximum size of Stack 
  
    Stack() 
    { //Constructor here 
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
    if(top==MAX)
    {
        cout<<"condition overflow"<<endl;
        return false;
    }
    else
    {
        arr[++top] = x;
        cout<<"element "<<x<<" pushed "<<endl;
        return true;
    }
    //Check Stack overflow as well
} 
  
int Stack::pop() 
{ 
    //Your code here
    if(top < 0)
    {
        cout<<"condition underflow "<<endl;
        return -1;
    }
    else
    {
        int val{arr[top--]};
        return val;
    }
    //Check Stack Underflow as well 
} 
int Stack::peek() 
{ 
    //Your code here
    if (top < 0)
    {
        cout<<"stack empty"<<endl;
        return -1;
    }
    else
    {
        int val{arr[top]};
        return val;
    }
    //Check empty condition too
} 
  
bool Stack::isEmpty() 
{ 
    //Your code here
    return ((top<0)?true:false); 
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

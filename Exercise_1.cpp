/***********************************************
 time complexity 
 push()= O(1);
 pop() = O(1);
 peek() = O(1);
 isEmpty() =O(1);
 **********************************************/
 #include <iostream> 
 using namespace std;
  

  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() { top = -1;} 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    if(top+1 == MAX)
    {
    cout<< "stack ovreflow\n";
     return false;
    }
   
        top++;
        a[top]=x;
        return true;
    

} 
  
int Stack::pop() 
{ 
   if(top == -1)
   {
    cout<< "stack underflow\n";
    return -1;
   }
   int val = a[top];
    top--;
    return val;
}
int Stack::peek() 
{ 
   if(top == -1)
   {
    cout<< "stack is empty\n";
    return -1;
   }
    return a[top];
} 
  
bool Stack::isEmpty() 
{ 
    return(top == -1);
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

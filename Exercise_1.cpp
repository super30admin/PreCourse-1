#include <iostream> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack {
  //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
    int counter=-1;
  
    Stack() { //Constructor here } 
    bool push(int x); 
    int pop(); 
    int peek(); 
    bool isEmpty(); 

    for(int i=0;i<MAX;i++){
        a[i]=INT_MIN;
    }
}; 
  
bool Stack::push(int x) 
{ 
    
    //Your code here
    //Check Stack overflow as well
    if(counter<MAX-1){
        counter++;
        a[counter]=x;
       
        return true;
    
    }
    top = a[counter];
    return false;
} 
  
int Stack::pop() 
{ 
    //Your code here
    //Check Stack Underflow as well 
    int temp=INT_MIN;
    if(counter>-1){
 temp=a[counter];
        a[counter]=INT_MIN;
    counter--;
    }

    if(counter>=0){
top = a[counter];
    }
    return temp;
} 
int Stack::peek() 
{ 
    //Your code here
    //Check empty condition too
        return top;

} 
  
bool Stack::isEmpty() 
{ 
    //Your code here 
    if(counter>-1){
        return false;
    }
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
  
    return 0; 
} 

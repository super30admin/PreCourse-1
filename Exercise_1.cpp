#include<bits/stdc++.h> 

using namespace std; 
  
#define MAX 1000
  
class Stack { 
    int length; 
	int top; 
  
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack() {length=0,top=0;} 
		bool push(int x); 
		int pop(); 
		int peek(); 
		bool isEmpty(); 
}; 
  
bool Stack::push(int x) 
{ 
    try{
    	if(length==MAX)
    		throw overflow_error("Stack Overflow Exception");
    	else{
    		a[length]=x;
    		length++;
            top=x;
    		return true;
    	}
    }
    catch(overflow_error &e){
        cerr<<e.what()<<endl;
    }
	
} 
  
int Stack::pop() 
{ 
	
	if(isEmpty()){
        cerr<<"Stack Underflow"<<endl;
        return 0;
    }
    int x=a[length-1];
	length--;
	if(length==0)
	    top=0;
	else
	    top=a[length-1];
	return x;
}
	
int Stack::peek() 
{ 
    if(isEmpty()){
        cerr<<"stack underflow"<<endl;
        return 0;
    }
    return top;
} 
  
bool Stack::isEmpty() 
{ 
	if(length==0)
		return true;
	else return false;
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
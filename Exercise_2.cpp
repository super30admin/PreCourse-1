#include <bits/stdc++.h> 
using namespace std; 
  
// A structure to represent a stack 
class StackNode { 
public: 
    int data; 
    StackNode* next; 
}; 
  


StackNode* newNode(int data) 
{ 
    StackNode* stackNode = new StackNode(); 
    stackNode->data = data; 
    stackNode->next = NULL; 
    return stackNode; 
} 

StackNode* top = NULL;
int isEmpty(StackNode* root) 
{ 
    //Your code here 
    if( top == NULL){
        cout<<"stack empty";
    return true;}
    else
    return false;
} 
  
void push(StackNode** root, int data) 
{ 
    
    //Your code here 
    StackNode *newNode = new StackNode();
    newNode->data = data;
    newNode->next = top;
    top = newNode;
    
} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
    StackNode *ptr = top;
    top = top->next;
    delete(ptr);
    return 0;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    if(top){
        cout << top->data;
        return top->data;
    }
    else
        cout<< "empty";
        return 0;
    
} 
  
int main() 
{ 
    StackNode* root = NULL; 
  
    push(&root, 10); 
    push(&root, 20); 
    push(&root, 30); 
  
    cout << pop(&root) << " popped from stack\n"; 
  
    cout << "Top element is " << peek(root) << endl; 
  
    return 0; 
} 

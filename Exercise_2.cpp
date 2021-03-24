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
  
int isEmpty(StackNode* root) 
{ 
    //Your code here 
    if(root == NULL){
        return 1;
    }
    else{
        return 0;
    }
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    StackNode* newNode = new StackNode();
    newNode->data = data;
    newNode->next = *root;
    *root = newNode;
    cout<<newNode->data<<" has been pused to stack"<<endl;
} 
  
int pop(StackNode** root) 
{ 
    //Your code here
    if(!isEmpty(*root)){
        StackNode *rem, *current = *root;
        rem = current;
        *root = current->next;
        rem->next = NULL;
        return rem->data;
    }
    else{
        return 0;
    }
} 
  
int peek(StackNode* root) 
{ 
    //Your code here
    if(!isEmpty(root)){
        StackNode* current = root;
        return current->data;    
    }
    else{
        return 0;
    }
} 
  
int main() 
{ 
    StackNode* root = NULL; 
  
    push(&root, 10); 
    push(&root, 20); 
    push(&root, 30); 
  
    cout << pop(&root) << " popped from stack\n"; 
  
    cout << "Top element is " << peek(root) << endl; 
    
    if(isEmpty(root)){
        cout<<"The stack is empty"<<endl;
    }
    else{
        cout<<"The stack is not empty"<<endl;
    }
  
    return 0; 
} 

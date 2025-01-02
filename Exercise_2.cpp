#include <bits/stdc++.h> 
#include <iostream>
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
    return root==NULL;
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    StackNode* node = newNode(data);
    node->next=*root;
    *root=node;
} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
    if(isEmpty(*root)){
        cout<<"Stack is empty";
        return 0;
    }
    int val = (*root)->data;
    *root=(*root)->next;
    return val;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    if(isEmpty(root)){
        cout<<"Stack is empty";
        return 0;
    }
    return root->data;
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
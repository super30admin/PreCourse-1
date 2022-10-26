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
    return (root == NULL);
} 
  
void push(StackNode** root, int data) 
{ 
    auto newStackNode = newNode(data);
    if(root == NULL)    *root = newNode(data);
    else    {
        newStackNode->next = *root;
        *root = newStackNode;
    }
} 
  
int pop(StackNode** root) 
{ 
    if(*root == NULL)    return -1;
    int curTop = (*root)->data;
    auto prevRoot = *root;
    *root = (*root)->next;
    delete(prevRoot);
    return curTop;
} 
  
int peek(StackNode* root) 
{ 
      if(root == NULL)    return -1;
      return (root)->data;
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
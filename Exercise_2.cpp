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
    if(root == NULL){
        return 1;
    }
    else{
        return 0;
    }
} 
  
void push(StackNode** root, int data) 
{ 
    StackNode* temp = newNode(data);
    temp->next = *root;
    *root = temp;
} 
  
int pop(StackNode** root) 
{ 
   if (*root == NULL){
    return -1;
   }
   else{
    StackNode* temp = *root;
    int popped = temp->data;
    *root = temp->next;
    delete temp;
    return popped;
   }
} 
  
int peek(StackNode* root) 
{ 
    if(root == NULL){
        return -1;
    }
    else{
        return root->data;
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
  
    return 0; 
} 
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
    if (root== NULL){
        return true;
    }
    return false;
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    if(*root==NULL){
        *root= newNode(data);
    }

    else{
        StackNode* temp= newNode(data);
        temp->next= *root;
        *root= temp;
    }
} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
    if( *root == NULL){
        return -1;
    }
    else{
        int ele = (*root)->data;
        *root= (*root)->next;
        return ele;
    }
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    if(root==NULL){
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
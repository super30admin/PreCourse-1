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
    StackNode *current = root;
    if(current == NULL){
        //cout<<"Empty\n";
        return 1;
    }
    else{
        //cout<<"Not Empty\n";
        return 0;
    }
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    StackNode* newNode = new StackNode;
    newNode->data = data;
    newNode->next  = *root;
    *root = newNode;
    cout<<newNode->data<<" is pushed\n";
    return;
} 
  
int pop(StackNode** root) 
{ 
    if(!isEmpty(*root)){
        StackNode *rem;
        StackNode *current = *root;
        rem = current;
        *root = current->next;
        //cout<<rem->data<<" is popped\n";
        rem->next = NULL;
        return rem->data;
    }
    else{
        cout<<"Stack underflow, hence 0 is returned as popped element\n";
        return 0;
    }
} 
  
int peek(StackNode* root) 
{ 
    if(!isEmpty(root)){
        return root->data;
    }
    else{
        cout<<"Stack underflow, hence 0 is returned as top element\n";
        return 0;
    }
} 
  
int main() 
{ 
    StackNode* root = NULL; 
    isEmpty(root);
    push(&root, 10); 
    push(&root, 20); 
    push(&root, 30); 
    
    cout << pop(&root) << " popped from stack\n"; 
  
    cout << "Top element is " << peek(root) << endl; 
  
    return 0; 
}
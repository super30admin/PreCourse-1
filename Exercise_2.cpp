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
    return root == nullptr ? 0 : 1; 
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    StackNode* stNode = new StackNode(); 
     if(stNode== nullptr){
    cout<<"Stack Overflow!"<<endl;
    return;
    }
    stNode->data = data;
    stNode->next = *root;
    *root = stNode;

} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
     int result = -1;
    if(*root == NULL)cout << "Stack is Empty!"<<endl;
    else{
    StackNode* var = (*root);
    (*root) = (*root)->next;
    result = var->data;
    free(var);
    }
    return result;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
     if(root == NULL)return -1;
    else return root->data;
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
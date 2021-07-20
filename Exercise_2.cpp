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
    if(root==NULL)
    return true;
    return false;
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    if(root==NULL){
        *root = newNode(data);
    }
    else{
        StackNode* node = new StackNode();
        node->data=data;
        node->next=*root;
       *root=node;
    }
} 
  
int pop(StackNode** root) 
{ 
    //Your code here
    if(root==NULL){
        cout<<"Stack Underflow!";
        return -1;
    }
    int data = (*root)->data;
    *root=(*root)->next;
    return data;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here
    if(root==NULL){
        cout<<"Stack is Empty!";
        return -1;
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
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
    return root->data;
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
     StackNode *n = newNode(data);
    n->next = (*root);
    (*root)=n;
} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
      if((*root) == NULL){
        cout<<"Stack is underflow";
    }
    else
    {
        int x = (*root)->data;
        (*root) = (*root)->next;
        return x; 
    }
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
     if((root->next) == NULL){
        cout<<"Stack is underflow";
    }
    else
    {
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
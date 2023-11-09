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
    if(root==NULL)
    {
        return true;
    }
    return false;
    //Your code here 
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    StackNode* temp= new StackNode();
    temp->data=data;
    temp->next=*root;
    *root=temp;
} 
  
int pop(StackNode** root) 
{ 
    //Your code here
    StackNode* temp;
    if(*root==NULL)
        return false;
    temp=*root;
    *root=(*root)->next;
    int data=temp->data;
    free(temp);
    return data;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here
    return root->data;
} 
  
int main() 
{ 
    StackNode* root = NULL; 
  
    push(&root, 10); 
    push(&root, 20); 
    push(&root, 30); 
  
    cout << pop(&root) << " popped from stack\n"; 
    cout << pop(&root) << " popped from stack\n"; 

  
    cout << "Top element is " << peek(root) << endl; 
  
    return 0; 
} 
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
  if(root == NULL)
    return 1;
  
  return 0;
  //Your code here 
} 
  
void push(StackNode** root, int data) 
{  

  StackNode* temp = new StackNode;
  if(temp == NULL)
    return;
  
  temp->data = data;

  if(*root == NULL)
    *root = temp;
  else{
      temp->next = *root;
      (*root) = temp;
  }

  cout<<"Pushed "<<data<<" to stack\n";

} 
  
int pop(StackNode** root) 
{ 
  if (*root == NULL)
    return 0;
  
  StackNode *temp = *root;
  int popval = temp->data;

  *root = (*root)->next;
  free(temp);

  return popval;
    //Your code here 
} 
  
int peek(StackNode* root) 
{ 
    if( root != NULL)
    return root->data;

    return -1;
    //Your code here 
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

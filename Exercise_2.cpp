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

StackNode* top=NULL;
  
int isEmpty(StackNode* root) 
{ 
       if(top==NULL){
      return true;
    }
  return false;
} 
  
void push(StackNode** root, int data) 
{ 
  StackNode* stackNode = new StackNode(); 
  stackNode -> data = data; 
  stackNode -> next = top; 
  top = stackNode;
} 
  
int pop(StackNode** root) 
{ 
   StackNode* temp = top;
  int data;
  if(top==NULL){
    cout << "is Empty";
  }else{
    data = temp->data;
    temp =top;
    top=top->next;
    free(temp);
  }
  return data;
} 
  
int peek(StackNode* root) 
{ 
     if (top!= NULL)
        return top->data;
    else
        exit(1);
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
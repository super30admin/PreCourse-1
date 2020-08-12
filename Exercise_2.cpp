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
    return !root;
} 
  
void push(StackNode** root, int data) 
{ 
   try{  
       StackNode* node=newNode(data);
       if(*root==NULL){
           *root=node;
       }    
       else{
          StackNode* curr=*root;
          while(curr->next!=NULL){
              curr=curr->next;
          }
          curr->next=node;
       }
   }
   catch (const std::bad_alloc& e) {
        std::cout << "Allocation failed: " << e.what() << '\n';
    }
} 
  
int pop(StackNode** root) 
{ 
    if(isEmpty(*root)){
        cerr<<"Stack Underflow"<<endl;
        return 0;
    }
    StackNode* curr=*root;
    StackNode* prev=NULL;
    while(curr->next!=NULL){
        prev=curr;
        curr=curr->next;
    }
    if((*root)->next!=NULL)
        prev->next=NULL;
    else *root=NULL;
    return curr->data;
}

  
int peek(StackNode* root) 
{
    if(isEmpty(root)){
        cerr<<"Stack Underflow"<<endl;
        return 0;
    }
    StackNode* curr=root;
    while(curr->next!=NULL){
        curr=curr->next;
    }
    return curr->data;
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



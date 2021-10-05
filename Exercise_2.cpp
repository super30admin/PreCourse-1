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
   int result;
    if(root==NULL)
    result=0;
    else
    result=1;
    
    return result;
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here
    StackNode *nodetopush = new StackNode;
    nodetopush->data=data;
    nodetopush->next= (*root);
    (*root)=nodetopush; 

} 
  
int pop(StackNode** root) 
{ 
    StackNode *popnode=new StackNode;
    int a;
   if(*root!=NULL)
   {
   	popnode=*root;
   	(*root)=(*root)->next;
   	a=popnode->data;
   	delete popnode;
   	
   }   
   return a;
} 
  
int peek(StackNode* root) 
{ 
    StackNode *peeknode=new StackNode;
    int pn;
   if(root!=NULL)
   {
   	peeknode=root;
   	root=root->next;
   	pn=peeknode->data;
   	
   	
   }   
   return pn;
} 
  
int main() 
{ 
    StackNode* root = NULL; 
  
    push(&root, 10); 
    push(&root, 20); 
    push(&root, 30); 
  cout << "Top element is " << peek(root) << endl; 
    cout << pop(&root) << " popped from stack\n"; 
  
    cout << "Top element is " << peek(root) << endl; 
  
    return 0; 
} 

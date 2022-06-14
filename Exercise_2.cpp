 //   tc:O(1)
//   sc:SIZE OF LIST
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
    if(top==NULL)return true;
    return false;
} 
  
void push(StackNode** root, int data) 
{ 
    StackNode *new_node=new StackNode();
    new_node->data = data;
    new_node->next=top;
    top=new_node;


} 
  
int pop(StackNode** root) 
{ 
StackNode *ptr=top;
top=top->next;
delete(ptr);
} 
 
int peek(StackNode* root) 
{ 
    if(top)cout<<top->data;
    else cout<<"no element"; 
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
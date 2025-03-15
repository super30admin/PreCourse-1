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
    StackNode* temp= root;
    if(temp==NULL){
        return 1;
    }
    return 0;
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    StackNode* temp = *root;
    if(temp==NULL){
        *root = newNode(data);return;
    }
    while((temp)->next != NULL){
        temp = temp->next;
    }
    temp->next = newNode(data);
} 
  
int pop(StackNode** root) 
{ 
    StackNode* temp = *root;
    //Your code here
    if(isEmpty(temp)){
        return -1;
    }
    if(temp->next==NULL){
        temp=NULL;
    }
    
    while((temp->next)->next != NULL){
        temp = temp->next;
    }
    int x= temp->next->data;
    temp->next=NULL;
    return x;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    StackNode* temp = root;
    while((temp->next) != NULL){
        temp = temp->next;
    }
    return (temp->data);
} 

void printnode(StackNode** root){
    StackNode* temp = *root;
    while((temp) != NULL){
        cout<<(temp->data)<<' ';
        temp = temp->next;
    }
    cout<<'\n';
}
  
int main() 
{ 
    StackNode* root = NULL; 
  
    push(&root, 10); 
    push(&root, 20); 
    push(&root, 30); 
    printnode(&root);
  
    cout << pop(&root) << " popped from stack\n"; 
  
    cout << "Top element is " << peek(root) << endl; 
  
    return 0; 
} 
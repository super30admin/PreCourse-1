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
    if (root == NULL) return true;
    else return false;
} 
  
void push(StackNode** root, int data) 
{ 
    StackNode *new_node = newNode(data);
    if (new_node) {
        //pushing at the head to have 0(1) complexity
        new_node->next = &root->next;
        root->next = &new_node;
    }
} 
  
int pop(StackNode** root) 
{ 
    if (root == NULL) return -1;
    root->next = &root->next->next;
    return root->data;
} 
  
int peek(StackNode* root) 
{ 
   if (root == NULL) return -1;
   else return (root->data);
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

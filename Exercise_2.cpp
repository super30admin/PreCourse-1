#include <bits/stdc++.h> 
using namespace std; 
  
// A structure to represent a stack 
class StackNode { 
public: 
    int data; 
    StackNode *next; 
    StackNode *prev;
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
    if (root == NULL) return 1;
    else return 0;
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    if (*root == NULL){
        (*root) = new StackNode();
        (*root)->data = data;
        return;
    }
    StackNode *temp = new StackNode(), *prev;
    temp->data = data;
    StackNode *node = (*root);
    while (node != NULL){
        prev = node;
        node = node->next;
    }
    prev->next = temp;
} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
    if ((*root) == NULL) return -1;
    StackNode *node = (*root), *prev, *prev2;
    while (node != NULL){
        prev2 = prev;
        prev = node;
        node = node->next;
    }
    prev2->next = NULL;
    return prev->data;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    if (root == NULL) return -1;
    StackNode *node = root, *prev;
    while (node != NULL){
        prev = node;
        node = node->next;
    }
    return prev->data;
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

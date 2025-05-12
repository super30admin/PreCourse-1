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
    return (root == NULL); 
} 
  
void push(StackNode** root, int data) 
{ 
    StackNode* s = newNode(data);
    s->next = *root;
    *root = s;

} 
  
int pop(StackNode** root) 
{ 
    if(isEmpty(*root)){
        cout<<"Stack Underflow\n";
        return -1;
    }

    StackNode *temp = *root;
    int removed = temp->data;
    *root = (*root)->next;
    delete temp;
    return removed;
} 
  
int peek(StackNode* root) 
{ 
    if(isEmpty(root)){
        cout<<"Stack Empty\n";
        return -1;
    }
    return root->data;
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
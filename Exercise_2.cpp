#include <iostream>
#include <stdio.h>
#include <vector>
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
   if(root == NULL) {
       return 1;
   }
   else {
       return 0;
   }
} 
  
void push(StackNode** root, int data) 
{ 
    if(*root == NULL) {
        *root = newNode(data);
    }
    else {
        StackNode* temp = newNode(data);
        temp->next = *root;
        *root = temp;
    }
} 
  
int pop(StackNode** root) 
{ 
    if(*root == NULL) {
        cout << "Stack Underflow" << endl;
        return 0;
    }
    int value = (*root)->data;
    *root = (*root)->next;
    return value;
} 

int peek(StackNode* root) 
{ 
    if(root == NULL) {
        cout << "Stack is Empty" << endl;
        return 0;
    }
    int value = root->data;
    return value;
} 
  
int main() 
{ 
    StackNode* root = NULL; 
  
    push(&root, 10); 
    push(&root, 20); 
    push(&root, 30); 
  
    cout << pop(&root) << " popped from stack\n"; 
  
    cout << "Top element is " << peek(root) << endl; 
    if(isEmpty(root)) {
        cout << "Stack is Empty" << endl;
    }
    else {
        cout << "Stack is not Empty" << endl;
    }
  
    return 0; 
} 
#include <iostream>
#include <cassert>
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
    if (root == NULL) {
        *root = newNode(data);
    }
    else {
        StackNode* temp = new StackNode(); 
        temp -> data = data;
        temp -> next = *root; //insert at root of list
        *root = temp;
    }
} 
  
int pop(StackNode** root) 
{ 
    assert(!isEmpty(*root));
   
    StackNode* temp = new StackNode;
    temp = *root; 
    *root = temp -> next; //root points to second item
    delete temp;          //deallocate front item
    return temp -> data;
}
  
int peek(StackNode* root) 
{ 
    if (!(root == NULL))
        return root -> data;
    else 
        cout << "Stack is empty ";   
        return -1;
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
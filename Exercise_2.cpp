#include <bits/stdc++.h> 
using namespace std; 

//Time complexity O(1)
//space complexity O(1)
  
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
    if (root == NULL) {
        cout << "Stack is Empty";
        return -1;
    }
} 
  
void push(StackNode** root, int data) 
{ 
    StackNode* node = newNode(data);
    node->next = root;
    root = node;

} 
  
int pop(StackNode** root) 
{ 
    cout << "Element popped is " << root->data;
    root = root->next;
    return root->data;
} 
  
int peek(StackNode* root) 
{ 
    if (!isEmpty()) {
        cout << "Top element is " << root->data;
        return root->data;
    }

    else
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
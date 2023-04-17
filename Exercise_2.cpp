#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>
using namespace std; 

//TC: O(1)
//SC: O(1)
  
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
    if(root==NULL) return true;
    return false;
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    StackNode* nn = newNode(data);
    nn->next = (*root);
    *root = nn;

} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
    if(root==NULL) return -1;
    StackNode* temp = *root;
    *root = (*root)->next;

    int x = temp->data;
    free(temp);
    return x;

} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    if(root==NULL) return -1;
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
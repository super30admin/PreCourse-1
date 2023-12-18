// Time Complexity : O(1) for all push and insertAfter. O(n) for append and print
// Space Complexity : O(1)
// Any problem you faced while coding this : no
#include <iostream> 
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
    return (root == nullptr);
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here
    StackNode* nodetoPush = newNode(data);
    nodetoPush->next = (*root);
    *root = nodetoPush;
    return; 
} 
  
int pop(StackNode** root) 
{ 
    //Your code here
    StackNode* top;
    int topElement = 0;
    if(!isEmpty(*root))
    {
        top = *root;
        *root = (*root)->next;
        top->next = nullptr;
        topElement = top->data;
        free(top);
    }
    return topElement;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
    if(!isEmpty(root))
    {
        return root->data;
    }
    return 0;

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
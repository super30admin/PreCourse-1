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
    if(!root) return 1;
    else return 0;
} 
  
void push(StackNode** root, int data) 
{ 
    //Your code here 
    StackNode* newTop = newNode(data);
    newTop->next = *root;
    *root = newTop; 
} 
  
int pop(StackNode** root) 
{ 
    //Your code here
    if(!isEmpty(*root)){
        StackNode* temp = *root;
        int x = temp->data;
        temp = temp->next;
        *root = temp;
        return x;
    }
    return -1;
} 
  
int peek(StackNode* root) 
{ 
    //Your code here 
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
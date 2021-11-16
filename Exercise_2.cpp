#include <iostream> 
using namespace std; 
  
// A structure to represent a stack 
// Time Complexity : isEmpty = O(1), push = O(1) , pop = O(1),peek =O(1)
// Space Complexity : O(1)

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
    if (root == nullptr) return 1;
    else return 0;
} 
  
void push(StackNode** root, int data) 
{ 
    StackNode *temp=newNode(data);
    temp->next=(*root);
    (*root)=temp;
} 
  
int pop(StackNode** root) 
{ 
    //Your code here 
    if (*root == nullptr)
    {
        return -1;
    }
    StackNode *tempRoot= *root;
    *root=tempRoot->next;
    int retTemp=tempRoot->data;
    delete tempRoot;
    return retTemp;
} 
  
int peek(StackNode* root) 
{ 
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

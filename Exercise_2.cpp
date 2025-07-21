//time complexity : O(1) for all operations 
// space complexity : O(n) for n elements
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
    if (root == NULL)
      return true;
  else
      return false;
} 
  
void push(StackNode** root, int data) 
{ 
  StackNode* stackNode = newNode(data);
  stackNode ->next = *root;
  *root = stackNode;
  cout << data << "pushed to stack\n";
} 
  
int pop(StackNode** root) 
{ 
    if(*root == NULL){
      cout << "stack uunderflow\n";
        return -1;
        }
  StackNode* temp = *root;
  *root = (*root)->next;
  int popped = temp->data;
  delete temp;
  return popped;
} 
  
int peek(StackNode* root) 
{ 
     
    if(root == NULL){
      cout << "stack uunderflow\n";
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
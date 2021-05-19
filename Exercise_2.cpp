// Time Complexity: O(1) all operations take constant time
// Space Complexity: O(1) apart from adding new nodes which is not considered, no extra space is taken
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
    if(root == NULL){
        return 1;
    }
    else{
        return 0;
    } 
} 
  
void push(StackNode** root, int data) 
{ 
    class StackNode *new_node = (class StackNode *)malloc(sizeof(class StackNode)); // Create new_node
    new_node->data = data;
    new_node->next = *root;
    *root = new_node;
    cout<<(*root)->data<<" pushed into stack\n";

} 
  
int pop(StackNode** root) 
{ 
    if(root == NULL){
        cout<<"\n Underflow !";
        return 0;
    } else {
        int temp = (*root)->data;
        *root = (*root)->next;
        return temp;
    }
} 
  
int peek(StackNode* root) 
{ 
    if(isEmpty(root)){
        return 0;
    }
    else{
        return root->data;
    }
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
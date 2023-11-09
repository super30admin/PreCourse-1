// Time Complexity : O(1)
// Space Complexity : O(1)
// Any problem you faced while coding this : Unable to refer root in functions
// considered root as head of the linked list
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
    if(root == NULL) {
        return 1;
    } else {
        return 0;
    }
    //If head(root) is NULL, there is no element in the stack
} 
  
void push(StackNode** root, int data) 
{ 
    StackNode* sn = new StackNode();
    sn->data = data;
    if(root == NULL) {
        root = sn;
        sn -> next = NULL;
    } else {
        sn-> next = root;
        root = sn;
    }
    //new data should be inserted at the beginning of linkedlist
    //data will be inserted and root will point to this data 
} 
  
int pop(StackNode** root) 
{ 
    int x = root->data;
    StackNode* sn1 = new StackNode();
    sn1 = root;
    root = root->next;
    free(sn1);
    return x;
    //pop is deleting first element from the linked list
    //root is moved forward and first element is deleted
} 
  
int peek(StackNode* root) 
{ 
    int x = root -> data;
    return x;
    //root will be the top element 
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


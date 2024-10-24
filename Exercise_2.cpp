#include <bits/stdc++.h> 
using namespace std; 
  
// A structure to represent a stack 

// if we want to design the stack using the linked list we need to keep track of previous node for the tracking
// again as we are doing all the operation in one go the time complexity is O(1) for all the operations

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
StackNode *head;
int isEmpty(StackNode* root) 
{ 
    //Your code here 
   return head==NULL;
} 
  
void push(StackNode* root, int data) 
{ 
    //Your code here 
    // base case would first node we need to check
    if(head == NULL)
    {
        head = newNode(data);
    }
    else
    {
        root->next = head;
        head = root;
    }
} 
  
int pop(StackNode* root) 
{ 
    //Your code here 
    if(head == NULL)
        return -1;
   
    int x = head->data;
    head = head->next;

    return x;
} 
  
int peek(StackNode* root) 
{ 
    if(head==NULL)
        return -1;
    //Your code here
    return head->data;
} 
  
int main() 
{ 
    StackNode* root = NULL; 
  
    push(root, 10); 
    push(root, 20); 
    push(root, 30); 
  
    cout << pop(root) << " popped from stack\n"; 
  
    cout << "Top element is " << peek(root) << endl; 
  
    return 0; 
} 
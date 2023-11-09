// Time Complexity:
// For isEmpty(), push(), pop(), peek() functions Time Complexity is O(1)
// Space Complexity:
// Space Comlexity is O(n), since it space usage is linearly proportional to the number of elements in stack.

// Problems Faced - No!

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
    //Your code here
    // I checked if the topmost pointer to the node in the stack is NULL. If it is null, then stack is empty.
    if(root == NULL)
        return 1;
    else
        return 0;
}
  
void push(StackNode** root, int data)
{
    //Your code here
    StackNode* node = new StackNode();
    // If the node created above is a null pointer then Heap is full. Stack overflow!
    if(node == NULL)
        cout << "Stack overflow! Heap is full!";
    // I put data to the newly created node. Made it point to the topmost node in the Stack and then made the root pointer point to the newly created node.
    else{
        node->data = data;
        node->next = *root;
        *root = node;
        cout << "Pushed to Stack : " << data << endl;
    }
}
  
int pop(StackNode** root)
{
    //Your code here
    // If root pointer points to a node which is NULL, that means the Stack is empty!
    if(*root == NULL)
        return 0;
    // I made a new node. Stored data of the node pointed to by the root node in the new node. Moved root pointer to the next node. Deleted newly created node. Stored data is finally returned.
    else{
         int x;
        StackNode* node = new StackNode();
        node = *root;
        x = node->data;
        *root = node->next;
        delete node;
        return x;
    }
   
}
  
int peek(StackNode* root)
{
    //Your code here
    // checks if the root pointer is null. Returns 0 if the stack is empty.
    if(root == NULL)
        return 0;
    else{
        int x;
        x = root->data;
        return x;
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

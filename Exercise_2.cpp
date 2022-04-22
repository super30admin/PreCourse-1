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

// Time Complexity of isEmpty : O(1)
// Space Complexity of isEmpty : O(1)

int isEmpty(StackNode* root) 
{ 
    //Your code here 

    // If head is pointing to NULL then list is empty.

    if (root == NULL)
        return -1;
    else return 0;
} 

// Time Complexity of push : O(1)
// Space Complexity of push : O(1)

void push(StackNode** root, int data) 
{ 
    //Your code here 

    // Create a new node.
    StackNode* newnode = newNode(data);

    // Point next of newnode points to head. 
    newnode->next = (*root);

    // Newnode becomes the head
    (*root) = newnode;
    cout<<data<<" is pushed into stack.\n";
    return;
} 

// Time Complexity of pop : O(1)
// Space Complexity of pop : O(1)

int pop(StackNode** root) 
{ 
    //Your code here 

    // Create a new node.
    StackNode* newnode = newNode(0);

    // If root is not null that means stack is not empty.
    if (root != NULL)
    {
        // Create a new node.
        newnode = (*root);

        (*root) = (*root)->next;
        int popped_data = newnode->data;

        // Free the space.
        free(newnode);

        // return the popped element.
        return popped_data;
    }
    else
    {
        cout << "Stack Underflow occured.\n" ;
        return -1;
    }
} 

// Time Complexity of peek : O(1)
// Space Complexity of peek : O(1)

int peek(StackNode* root) 
{ 
    //Your code here 
    if (isEmpty(root) == -1)
    {
        cout<<"empty.\n";
        return -1;
    }
    else
    {
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
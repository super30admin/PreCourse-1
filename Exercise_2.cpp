#include <bits/stdc++.h> 
using namespace std; 

/*
Time Complexity:
  - push(): O(1)
  - pop(): O(1)
  - peek(): O(1)
  - isEmpty(): O(1)

Space Complexity: O(n), where n is the number of elements in the stack (for storing linked list nodes).
*/

// A structure to represent a stack node 
class StackNode { 
public: 
    int data; 
    StackNode* next; 
}; 

// Function to create a new stack node
StackNode* newNode(int data) 
{ 
    StackNode* stackNode = new StackNode(); 
    stackNode->data = data; 
    stackNode->next = NULL; 
    return stackNode; 
} 

// Function to check if the stack is empty
int isEmpty(StackNode* root) 
{ 
    return !root;  // Return true if root is NULL (stack is empty)
} 

// Function to push an element onto the stack
void push(StackNode** root, int data) 
{ 
    StackNode* stackNode = newNode(data); 
    stackNode->next = *root; 
    *root = stackNode; 
    cout << data << " pushed to stack\n";
} 

// Function to pop an element from the stack
int pop(StackNode** root) 
{ 
    if (isEmpty(*root)) {
        cout << "Stack Underflow\n";
        return -1;
    }
    StackNode* temp = *root; 
    *root = (*root)->next; 
    int popped = temp->data; 
    delete temp; 
    return popped; 
} 

// Function to peek the top element of the stack
int peek(StackNode* root) 
{ 
    if (isEmpty(root)) {
        cout << "Stack is empty\n";
        return -1;
    }
    return root->data; 
} 

// Driver program to test the above functions
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

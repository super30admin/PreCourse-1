#include <bits/stdc++.h>
using namespace std;

/*
Time Complexity :
    push(): O(1)
    pop(): O(1)
    peek(): O(1)
    isEmpty(): O(1)

Space Complexity :
    stack: O(n), n is number of elements in the stack

Did this code successfully run on Leetcode : Couldn't find the leetcode problem

Any problem you faced while coding this : None
*/

// A structure to represent a stack
class StackNode
{
public:
    int data;
    StackNode *next;
};

StackNode *newNode(int data)
{
    StackNode *stackNode = new StackNode();
    stackNode->data = data;
    stackNode->next = NULL;
    return stackNode;
}

// Check if the stack is empty
int isEmpty(StackNode *root)
{
    return root == NULL;
}

// Push data onto the stack
void push(StackNode **root, int data)
{
    StackNode *node = newNode(data);

    node->next = *root;

    *root = node;
}

// Pop data from the stack
int pop(StackNode **root)
{
    if (isEmpty(*root))
    {
        return -1;
    }

    StackNode *node = *root;
    
    *root = (*root)->next;
    
    int popped = node->data;
    
    delete node; // Free memory to prevent memory leaks
    
    return popped;
}

// Peek the top element of the stack
int peek(StackNode *root)
{
    if (isEmpty(root))
    {
        return -1;
    }

    return root->data;
}

int main()
{
    StackNode *root = NULL;

    push(&root, 10);
    push(&root, 20);
    push(&root, 30);

    cout << pop(&root) << " popped from stack\n";

    cout << "Top element is " << peek(root) << endl;

    cout << pop(&root) << " popped from stack\n";

    cout << "Top element is " << peek(root) << endl;

    cout << pop(&root) << " popped from stack\n";

    return 0;
}
// Time Complexity : O(1)
// Space Complexity : O(N)

#include <bits/stdc++.h>
using namespace std;

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

int isEmpty(StackNode *root)
{
    return root == NULL;
}

void push(StackNode **root, int data)
{
    StackNode *stackNode = newNode(data);

    if (*root == NULL)
    {
        *root = stackNode;
        return;
    }

    StackNode *curr = *root;

    while (curr->next != NULL)
        curr = curr->next;

    curr->next = stackNode;
}

int pop(StackNode **root)
{
    StackNode *curr = *root;
    
    StackNode *prev;
    
    while (curr->next != NULL)
    {
        prev = curr;
    
        curr = curr->next;
    }
    
    prev->next = NULL;

    int val = curr->data;
    
    delete curr;

    return val;
}

int peek(StackNode *root)
{
    StackNode *curr = root;
    
    while (curr->next != NULL)
        curr = curr->next;

    return curr->data;
}

int main()
{
    StackNode *root = NULL;

    push(&root, 10);
    push(&root, 20);
    push(&root, 30);

    cout << pop(&root) << " popped from stack\n";

    cout << "Top element is " << peek(root) << endl;

    return 0;
}
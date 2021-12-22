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
    // Your code here
}

void push(StackNode **root, int data)
{
    auto node = newNode(data);
    node->next = *root;
    (*root) = node;
}

int pop(StackNode **root)
{
    int val = (*root)->data;
    (*root) = (*root)->next;
    return val;
}

int peek(StackNode *root)
{
    return root->data;
    // Your code here
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
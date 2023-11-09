#include <bits/stdc++.h>
#include <iostream>
using namespace std;

// A structure to represent a stack node
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

// Check if the stack is empty
// Time complexity: O(1)
// Space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
int isEmpty(StackNode* root)
{
    return (root == NULL);
}

// Push an element onto the stack
// Time complexity: O(1)
// Space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Syntax for creating newNode
void push(StackNode** root, int data)
{
    StackNode* stackNode = newNode(data);
    stackNode->next = *root;
    *root = stackNode;
    cout << data << " pushed to stack\n";
}

// Pop an element from the stack
// Time complexity: O(1)
// Space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
int pop(StackNode** root)
{
    if (isEmpty(*root))
        return INT_MIN;
    StackNode* temp = *root;
    *root = (*root)->next;
    int popped = temp->data;
    delete (temp);

    return popped;
}

// Get the top element of the stack without removing it
// Time complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
int peek(StackNode* root)
{
    if (isEmpty(root))
        return -1;
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

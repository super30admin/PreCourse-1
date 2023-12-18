// Time Complexity : 
    // push - O(1)
    // pop - O(1)
    // peek - O(1)
    // isEmpty - O(1)
// Space Complexity : O(1)

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
    // if root node is NULL, stack is empty
    return root == NULL;
}

void push(StackNode **root, int data)
{
    // Your code here
    // creating a new node
    StackNode *node = newNode(data), *curr;

    // check if root is holding the head address as NULL
    if (*root == NULL)
    {
        *root = node;

        return;
    }

    // get the linked list head into curr
    curr = *root;

    // iterating through end of the linkedlist
    while (curr->next != NULL)
        curr = curr->next;

    // attach new node to the last node
    curr->next = node;
}

int pop(StackNode **root)
{
    // Your code here
    // maintain curr and prev pointers
    StackNode *curr = *root, *prev;

    int data;

    // iterating through end of linkedlist
    while (curr->next != NULL)
    {
        prev = curr;
        curr = curr->next;
    }

    // when curr is at last node, prev is at last before node
    // break the link
    prev->next = NULL;

    // fetch the data of last node
    data = curr->data;

    // deallocate the memory of last node
    free(curr);

    // returning the last node data
    return data;
}

int peek(StackNode *root)
{
    // Your code here
    StackNode *curr = root;

    // iterating through end of linkedlist
    while (curr->next != NULL)
        curr = curr->next;

    // return the last node data
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
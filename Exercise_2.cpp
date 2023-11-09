#include <iostream>
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
    if (root == NULL)
    {
        cout << "Stack is empty";
    }
    return 0;
}

void push(StackNode **root, int data)
{
    // Your code here
    StackNode *stackNode = new StackNode();

    stackNode->data = data;
    stackNode->next = *root;

    *root = stackNode;
}

int pop(StackNode *root)
{
    // Your code here
    // StackNode *root = new StackNode();
    if (root == NULL)
    {
        cout << "Stack is already empty";
        return 0;
    }

    if (root->next == NULL)
    {
        /* code */
        return root->data;
    }
    int popped_value = root->data;

    root = root->next;

    return popped_value;
}

int peek(StackNode *root)
{
    // Your code here
    if (root != NULL)
    {
        cout << root->data;
    }
    cout << endl;
    return 0;
}

int main()
{
    StackNode *root = NULL;

    push(&root, 10);
    push(&root, 20);
    push(&root, 30);

    cout << pop(root) << " popped from stack\n";

    cout << "Top element is " << peek(root) << endl;

    return 0;
}

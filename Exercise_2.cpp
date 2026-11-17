// Time Complexity: O(1) for push, pop, peek, and isEmpty
// Space Complexity: O(n) for storing n elements in the stack

#include <iostream>
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
    return root == NULL;
}

void push(StackNode** root, int data)
{
    StackNode* new_stack_node = newNode(data);
    new_stack_node->next = *root;
    *root = new_stack_node;
}

int pop(StackNode** root)
{
    if (isEmpty(*root)) {
        cout << "Stack Underflow" << endl;
        return 0;
    }
    StackNode* temp = *root;
    int popped_data = temp->data;
    *root = temp->next;
    delete temp;
    return popped_data;
}

int peek(StackNode* root)
{
    if (isEmpty(root)) {
        cout << "Stack Underflow" << endl;
        return 0;
    }
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

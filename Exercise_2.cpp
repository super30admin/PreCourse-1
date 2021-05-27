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
    if(root== nullptr)
    {
        cout<<"Empty"<<endl;
        return -1;
    }
    return 0;
}

void push(StackNode** root, int data)
{
    //Your code here
    StackNode* node;
    node = newNode(data);
    node->next = *root;
    *root = node;


}

int pop(StackNode** root)
{
    //Your code here
    if(isEmpty(*root) == 0){
        StackNode* p = *root;
        int num = p->data;
        *root = (*root)->next;
        return num;
    }
    return INT_MIN;
}

int peek(StackNode* root)
{
    //Your code here
     if(isEmpty(root) == 0){
        return root->data;
    }
    return INT_MIN;
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

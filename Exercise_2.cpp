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
// Time Complexity : O(1)
// Space Complexity : O(1)  
int isEmpty(StackNode *root)
{
    //Your code here
    if (root == NULL)
    {
        return true;
    }
    else
    {
        return false;
    }
}
// Time Complexity : O(N)
// Space Complexity : O(1)  
void push(StackNode **root, int data)
{
    //Your code here
    if (isEmpty(*root))
    {
        StackNode *node_TO_push = newNode(data);
        *root = node_TO_push;
    }
    else
    {
        StackNode *trav_node = *root;
        while (trav_node->next != NULL)
        {
            trav_node = trav_node->next;
        }
        StackNode *node_TO_push = newNode(data);
        trav_node->next = node_TO_push;
        
    }
}
// Time Complexity : O(N)
// Space Complexity : O(1)  
int pop(StackNode **root)
{
    //Your code here
    if (!isEmpty(*root))
    {
        StackNode *trav_node = *root;
        if (trav_node->next == NULL)
        {
            int ret = trav_node->data;
            delete(trav_node);
            *root = NULL;    
            return ret;
        }
        else
        {
            while (trav_node->next->next != NULL)
            {
                trav_node = trav_node->next;
            }
            int ret = trav_node->next->data;
            delete (trav_node->next);
            trav_node->next = NULL;
            return ret;
        }
    }
}
// Time Complexity : O(N)
// Space Complexity : O(1)  
int peek(StackNode *root)
{
    //Your code here
     if (!isEmpty(root))
    {
        StackNode *trav_node = root;
        while (trav_node->next != NULL)
        {
            trav_node = trav_node->next;
        }
        return trav_node->data; 
    }
    else{
        return -1;
    }
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
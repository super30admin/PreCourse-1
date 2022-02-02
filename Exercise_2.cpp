// Time complexity
//O(1) for every operation

//Space Complexity
//O(n) if we do n push operations

//The code ran perfectly

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
    //Your code here
    if(root==nullptr){
        return 1;
    } else {
        return 0;
    }

}
  
void push(StackNode** root, int data)
{
    //Your code here
    StackNode *node = newNode(data);
    node->next =  *root;
    *root = node;
}
  
int pop(StackNode** root)
{
    //Your code here
    if(isEmpty (*root)){
        return 0;
    } else {
        StackNode *temp = *root;
        int topEl = temp->data;
        *root = (*root)->next;
        return topEl;

    }
}
  
int peek(StackNode* root)
{
    //Your code here
    if (!isEmpty(root))
        return root->data;
    else
        exit(1);
}
  
int main()
{
    StackNode* root = nullptr;
  
    push(&root, 10);
    push(&root, 20);
    push(&root, 30);
  
    cout << pop(&root) << " popped from stack\n";
  
    cout << "Top element is " << peek(root) << endl;
  
    return 0;
}

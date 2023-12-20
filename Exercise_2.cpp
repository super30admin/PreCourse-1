/*
----------------------------------------
* Stack Implementation using Linked List
----------------------------------------

* Time Complexity:
*  - Push : O(1)
*  - Pop : O(1)
*  - Peek : O(1)
*  - isEmpty : O(1)

* Space Complexity: O(n)

Did this code successfully run on Leetcode : NA
Any problem you faced while coding this : NO

*/

#include <iostream>
#include <climits>

using namespace std;

// A structure to represent a stack
class StackNode {
public:
    int data;
    StackNode* next;
};

StackNode* newNode(int data) {
    StackNode* stackNode = new StackNode();
    stackNode->data = data;
    stackNode->next = NULL;
    return stackNode;
}

int isEmpty(StackNode* root) {
    //Your code here
    return root == nullptr;
}

int push(StackNode** root, int data) {
    //Your code here
    StackNode* node = newNode(data);
    node->next = *root;
    *root = node;
    return (*root)->data;
}

int pop(StackNode** root) {
    //Your code here
    if (isEmpty(*root)) {
        cout << "[Error: Stack is empty !!!] ---> ";
        return INT_MIN;
    }
    StackNode* temp = *root;
    *root = (*root)->next;
    int popped = temp->data;
    delete temp;
    return popped;
}

int peek(StackNode* root) {
    //Your code here
    if(isEmpty(root)) {
        cout << "[Error: Stack is empty !!!] ---> ";
        return INT_MIN;
    }
    return root->data;
}

int main() {
    StackNode* root = NULL;

    // * Add elements to the stack
    cout << "Push: " << push(&root, 10) << endl;
    cout << "Push: " << push(&root, 20) << endl;
    cout << "Push: " << push(&root, 30) << endl;

    // * See the top element from stack
    cout << "Peek " << peek(root) << endl;

    // * Remove elements from the stack
    cout << "Pop: " << pop(&root) << endl;
    cout << "Pop: " << pop(&root) << endl;
    cout << "Pop: " << pop(&root) << endl;

    // ! When stack is empty
    cout << "Pop: " << pop(&root) << endl;
    cout << "Peek: " << peek(root) << endl;

    return 0;
}
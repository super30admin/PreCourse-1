// Time Complexity : 0(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes a little bit, with the C++
// pointers, earlier I had the logic of O(n) for each push and pop which was not
// optimized

#include <bits/stdc++.h>
using namespace std;

// A structure to represent a stack
class StackNode {
public:
  int data;
  StackNode *next;
};

StackNode *newNode(int data) {
  StackNode *stackNode = new StackNode();
  stackNode->data = data;
  stackNode->next = NULL;
  return stackNode;
}

int isEmpty(StackNode *root) {
  // Your code here
  return root == NULL;
}

void push(StackNode **root, int data) {
  // Your code here
  StackNode *newn = newNode(data);
  newn->next = *root;
  *root = newn;
}

int pop(StackNode **root) {
  // Your code here
  if (isEmpty(*root)) {
    return -1;
  }
  StackNode *temp = *root;
  StackNode *node = temp->next;
  *root = node;

  int data = temp->data;
  delete temp;
  return data;
}

int peek(StackNode *root) {
  // Your code here
  if (isEmpty(root)) {
    return -1;
  } else {
    return root->data;
  }
}

int main() {
  StackNode *root = NULL;

  push(&root, 10);
  push(&root, 20);
  push(&root, 30);

  cout << pop(&root) << " popped from stack\n";

  cout << "Top element is " << peek(root) << endl;

  return 0;
}
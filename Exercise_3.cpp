// Time Complexity : For push it's O(1), for append it's O(n), for insertAfter
// worst case is O(n), for printList is O(n) Space Complexity : O(1), no extra
// space is used Did this code successfully run on Leetcode : Yes Any problem
// you faced while coding this : Yes a little bit but the instructions were
// sufficient
#include <bits/stdc++.h>
using namespace std;

// A linked list node (changes)
class Node {
public:
  int data;
  Node *next;
};

/* Given a reference (pointer to pointer)
to the head of a list and an int, inserts
a new node on the front of the list. */
void push(Node **head_ref, int new_data) {
  /* 1. allocate node */
  Node *newn = new Node();

  /* 2. put in the data */
  newn->data = new_data;

  /* 3. Make next of new node as head */
  newn->next = *head_ref;

  /* 4. move the head to point to the new node */
  *head_ref = newn;
}

/* Given a node prev_node, insert a new node after the given
prev_node */
void insertAfter(Node *prev_node, int new_data) {
  /*1. check if the given prev_node is NULL */
  if (!prev_node) {
    return;
  }

  /* 2. allocate new node */
  Node *newn = new Node();

  /* 3. put in the data */
  newn->data = new_data;

  /* 4. Make next of new node as next of prev_node */
  newn->next = prev_node->next;

  /* 5. move the next of prev_node as new_node */
  prev_node->next = newn;
}

/* Given a reference (pointer to pointer) to the head
of a list and an int, appends a new node at the end */
void append(Node **head_ref, int new_data) {
  /* 1. allocate node */
  Node *newn = new Node();

  /* 2. put in the data */
  newn->data = new_data;

  /* 3. This new node is going to be
  the last node, so make next of
  it as NULL*/
  newn->next = NULL;

  /* 4. If the Linked List is empty,
  then make the new node as head */
  if (!*head_ref) {
    *head_ref = newn;
  } else {
    /* 5. Else traverse till the last node */
    Node *temp = *head_ref;
    while (temp->next) {
      temp = temp->next;
    }
    /* 6. Change the next of last node */
    temp->next = newn;
  }
}

// This function prints contents of
// linked list starting from head
void printList(Node *node) {
  // Your code here
  Node *temp = node;
  while (temp) {
    cout << temp->data << " ";
    temp = temp->next;
  }
  cout << "\n";
}

/* Driver code*/
int main() {
  Node *head = NULL;
  append(&head, 6);
  push(&head, 7);
  push(&head, 1);
  append(&head, 4);
  insertAfter(head->next, 8);
  cout << "Created Linked list is: ";
  printList(head);
  return 0;
}
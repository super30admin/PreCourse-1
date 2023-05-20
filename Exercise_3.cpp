#include <bits/stdc++.h> 
#include <iostream>
using namespace std;

// A linked list node
class Node {
public:
    int data;
    Node* next;
};

// Given a reference (pointer to pointer) to the head of a list and an int, inserts a new node on the front of the list.
// Time complexity: O(1)
// Space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
void push(Node** head_ref, int new_data)
{
    // 1. Allocate node
    Node* new_node = new Node();

    // 2. Put in the data
    new_node->data = new_data;

    // 3. Make next of new node as head
    new_node->next = *head_ref;

    // 4. Move the head to point to the new node
    *head_ref = new_node;
}

// Given a node prev_node, insert a new node after the given prev_node.
// Time complexity: O(1)
// Space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
void insertAfter(Node* prev_node, int new_data)
{
    // 1. Check if the given prev_node is NULL
    if (prev_node == NULL) {
        cout << "The given previous node cannot be NULL.";
        return;
    }

    // 2. Allocate new node
    Node* new_node = new Node();

    // 3. Put in the data
    new_node->data = new_data;

    // 4. Make next of new node as next of prev_node
    new_node->next = prev_node->next;

    // 5. Move the next of prev_node as new_node
    prev_node->next = new_node;
}

// Given a reference (pointer to pointer) to the head of a list and an int, appends a new node at the end.
// Time complexity: O(N), where N is the number of nodes in the linked list.
// Space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
void append(Node** head_ref, int new_data)
{
    // 1. Allocate node
    Node* new_node = new Node();

    // 2. Put in the data
    new_node->data = new_data;

    // 3. This new node is going to be the last node, so make next of it as NULL
    new_node->next = NULL;

    // 4. If the Linked List is empty, then make the new node as head
    if (*head_ref == NULL) {
        *head_ref = new_node;
        return;
    }

    // 5. Else traverse till the last node
    Node* last = *head_ref;
    while (last->next != NULL) {
        last = last->next;
    }

    // 6. Change the next of last node
    last->next = new_node;
}

// This function prints contents of linked list starting from head
// Time complexity: O(N), where N is the number of nodes in the linked list.
// Space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
void printList(Node* node)
{
    while (node != NULL) {
        cout << node->data << " ";
        node = node->next;
    }
}

int main()
{
    Node* head = NULL;
    append(&head, 6);
    push(&head, 7);
    push(&head, 1);
    append(&head, 4);
    insertAfter(head->next, 8);
    cout << "Created Linked list is: ";
    printList(head);
    return 0;
}

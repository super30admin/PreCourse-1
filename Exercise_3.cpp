// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

#include <bits/stdc++.h> 
using namespace std; 
  
// A linked list node (changes) 
class Node  
{  
    public: 
    int data;  
    Node *next;  
};  
  
/* Given a reference (pointer to pointer) 
to the head of a list and an int, inserts 
a new node on the front of the list. */
void push(Node** head_ref, int new_data)  
{  
    Node* new_node = new Node(); // 1. allocate node
    new_node->data = new_data;   // 2. put in the data
    new_node->next = (*head_ref); // 3. Make next of new node as head
    (*head_ref) = new_node; // 4. move the head to point to the new node
}  
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
    if (prev_node == nullptr) // 1. check if the given prev_node is NULL
    {
        cout << "The previous node cannot be NULL." << endl;
        return;
    }

    Node* new_node = new Node(); // 2. allocate new node
    new_node->data = new_data;   // 3. put in the data
    new_node->next = prev_node->next; // 4. Make next of new node as next of prev_node
    prev_node->next = new_node; // 5. move the next of prev_node as new_node
}  
  
/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)  
{  
    Node* new_node = new Node(); // 1. allocate node
    Node* last = *head_ref; // 5. Else traverse till the last node

    new_node->data = new_data; // 2. put in the data
    new_node->next = nullptr; // 3. This new node is going to be the last node, so make next of it as NULL

    if (*head_ref == nullptr) // 4. If the Linked List is empty, then make the new node as head
    {
        *head_ref = new_node;
        return;
    }

    while (last->next != nullptr)
        last = last->next;

    last->next = new_node; // 6. Change the next of last node
}  
  
// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    while (node != nullptr)
    {
        cout << node->data << " ";
        node = node->next;
    }
    cout << endl;
}  
  
/* Driver code*/
int main()  
{  
    Node* head = NULL;   
    append(&head, 6);  
    push(&head, 7);  
    push(&head, 1);    
    append(&head, 4);    
    insertAfter(head->next, 8);  
    cout<<"Created Linked list is: ";  
    printList(head);  
    return 0;  
}  
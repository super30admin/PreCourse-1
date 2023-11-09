#include <iostream>
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

    Node * node = new Node();
    node->data = new_data;
    node->next = *head_ref;
    *head_ref = node;
}

/* Given a node prev_node, insert a new node after the given
prev_node */
void insertAfter(Node* prev_node, int new_data)
{
    /*1. check if the given prev_node is NULL */
      if(prev_node == NULL){
          cout<<"The previous node is empty";
          return;
      }
      Node * node = new Node();
      node->data = new_data;
      node->next = prev_node->next;
      prev_node->next = node;

}

/* Given a reference (pointer to pointer) to the head
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)
{
    /* 1. allocate node */
    Node * node = new Node();
    node->data = new_data;
    node->next = NULL;
    /* 2. put in the data */

    /* 3. This new node is going to be
    the last node, so make next of
    it as NULL*/
     Node * tempHead = *head_ref;
     if(tempHead == NULL){
         *head_ref = node;
         return;
     }
    while (tempHead->next != NULL){
        tempHead = tempHead->next;
    }
    tempHead->next = node;
    /* 4. If the Linked List is empty,
    then make the new node as head */

    /* 5. Else traverse till the last node */

    /* 6. Change the next of last node */
}

// This function prints contents of
// linked list starting from head
void printList(Node *node)
{
    while(node != NULL){
        cout<<node->data<<" ";
        node = node->next;
    }
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


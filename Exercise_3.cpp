#include <iostream> 
using namespace std;

// A linked list node (changes) 
class Node
{
public:
    int data;
    Node* next;
};

/* Given a reference (pointer to pointer)
to the head of a list and an int, inserts
a new node on the front of the list. */
void push(Node** head_ref, int new_data)
{
    Node* temp = new Node();
    temp->data = new_data;
    temp->next = *head_ref;
    *head_ref = temp;
}

/* Given a node prev_node, insert a new node after the given
prev_node */
void insertAfter(Node* prev_node, int new_data)
{
    if (prev_node == NULL) {
        cout << "previous node is NULL";
    }
    else {
        Node* temp = new Node();
        temp->data = new_data;
        temp->next = prev_node->next;
        prev_node->next = temp;
    }
}

/* Given a reference (pointer to pointer) to the head
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)
{
    /* 1. allocate node */

    Node* temp = new Node();
    temp->data = new_data;
    temp->next = NULL;

    if (*head_ref == NULL) {
        *head_ref = temp;
    }

    else {

        Node* ptr = *head_ref;

        while (ptr->next != NULL) {

            ptr = ptr->next;

        }

        ptr->next = temp;

    }

}

// This function prints contents of 
// linked list starting from head  
void printList(Node* node)
{
    if (node == NULL) {

        cout << "List is empty";

    }

    else {

        Node* temp = node;

        while (temp != NULL) {
            cout << temp->data << " ";
            temp = temp->next;
        }

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
    cout << "Created Linked list is: ";
    printList(head);
    return 0;
}
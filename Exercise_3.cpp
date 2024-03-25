#include <iostream>
#include <stdio.h>
#include <stdlib.h>

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
    Node* new_node = new Node();
    new_node->data = new_data;
    new_node->next = *head_ref;
    *head_ref =  new_node;
}  

/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
    if (NULL == prev_node)
        return;
    
    Node* new_node = new Node();
    new_node->data = new_data;

    new_node->next = prev_node->next;
    prev_node->next = new_node;
}  


/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)  
{  
    Node* new_node = new Node();
    new_node->data = new_data;
    new_node->next = NULL;

    if (NULL == *head_ref) {
        *head_ref = new_node;
        return;
    }

    Node* cur = *head_ref;
    for (; cur->next != NULL; cur = cur->next);
    cur->next = new_node;
}  

// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    while (node != NULL) {
        cout << node->data << " ";
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
    append(&head, 10);
    insertAfter(head->next, 8);
    insertAfter(head, 11);
    cout<<"Created Linked list is: ";  
    printList(head);  

    return 0;  
} 
#include <bits/stdc++.h> 
using namespace std; 
  
// A linked list node (changes) 
class Node  {  

public: 
    int data;  
    Node *next;  
};  
  
/* Given a reference (pointer to pointer) 
to the head of a list and an int, inserts 
a new node on the front of the list. */
void push(Node** head_ref, int new_data)  
{  
    Node *node = new Node();    
 
    node->data = new_data;
    node->next = *head_ref;

    *head_ref = node; 
}  
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node** prev_node, int new_data)  
{  
    if (nullptr == prev_node) {
        return;
    }

    Node *node = new Node();
    node->data = new_data;
    node->next = (*prev_node)->next;
    (*prev_node)->next = node;
}  
  
/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)  
{  
    Node *node = new Node();
    node->data = new_data;
    node->next = nullptr;

    while (nullptr != *head_ref) {
        head_ref = &(*head_ref)->next;
    }

    *head_ref = node;
}  
  
// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    while (nullptr != node) {
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
    insertAfter(&(head->next), 8);
    cout<<"Created Linked list is: ";  
    printList(head);
    return 0;  
}  

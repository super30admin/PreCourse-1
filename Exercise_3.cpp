#include <bits/stdc++.h> 
using namespace std; 
  
// A linked list node (changes) 
class Node  
{  
    public: 
    int data;  
    Node *next;  
    

    Node(int val) 
    {
        this->data = val;
        this->next = NULL:
    }
};  
  
/* Given a reference (pointer to pointer) 
to the head of a list and an int, inserts 
a new node on the front of the list. */
void push(Node** head_ref, int new_data)  
{  
    /* 1. allocate node */ 
  
    /* 2. put in the data */  
  
    /* 3. Make next of new node as head */ 
  
    /* 4. move the head to point to the new node */
    
     Node *new_node = new Node(new_data);
     new_node->next = &head->next;
     &head->next = new_node;
}  
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
    /*1. check if the given prev_node is NULL */ 
  
    /* 2. allocate new node */ 
  
    /* 3. put in the data */ 
  
    /* 4. Make next of new node as next of prev_node */
  
    /* 5. move the next of prev_node as new_node */ 

    if (!prev_node) return;
    Node *new_node = new Node(new_data);
    new_node->next = prev_node->next;
    prev_node->next = new_node;
}  
  
/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)  
{  
    /* 1. allocate node */ 
  
    /* 2. put in the data */ 
  
    /* 3. This new node is going to be  
    the last node, so make next of  
    it as NULL*/  
  
    /* 4. If the Linked List is empty, 
    then make the new node as head */
  
    /* 5. Else traverse till the last node */
  
    /* 6. Change the next of last node */ 
     
    Node *new_node = new Node(new_data);
    new_node->next = NULL;
    if (&head_ref->next == NULL) &head_ref->next = new_node;
    else {
        Node *tmp = head;
        while(tmp != NULL) {
            tmp = tmp->next;
        }
    //now tmp points to old last node
    tmp->next = new_node; 
}
  
// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    Node *tmp = node;
    while (tmp != NULL) {
        cout << tmp->data <<" ";
    }
    cout << endl;
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

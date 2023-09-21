#include <iostream>
using namespace std;

// A linked list node (changes) 
class node
{
public:
    int data;
    node *next;

};

/* Given a reference (pointer to pointer) 
to the head of a list and an int, inserts 
a new node on the front of the list. */
void push(node** head_ref, int new_data)
{
    /* 1. allocate node */
    node *n = new node();
    /* 2. put in the data */
    n->data = new_data;
    /* 3. Make next of new node as head */
    n->next = *head_ref;
    /* 4. move the head to point to the new node */
    *head_ref = n;
}

/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(node* prev_node, int new_data)
{
    /*1. check if the given prev_node is NULL */
    if(prev_node ==  NULL){
        return;
    }


    /* 2. allocate new node */
    node *n = new node();
    /* 3. put in the data */
    n->data = new_data;
    /* 4. Make next of new node as next of prev_node */
    n->next = prev_node->next;
    /* 5. move the next of prev_node as new_node */
    prev_node->next = n;
}

/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(node** head_ref, int new_data)
{
    /* 1. allocate node */
    node *n = new node();

    /* 2. put in the data */
    n->data = new_data;
    /* 3. This new node is going to be  
    the last node, so make next of  
    it as NULL*/
    n->next = NULL;

    /* 4. If the Linked List is empty, 
    then make the new node as head */
    if(*head_ref == NULL) {
        *head_ref = n;
        return;
    }
    /* 5. Else traverse till the last node */
    node *temp = *head_ref;
    while(temp->next != NULL){
     temp = temp->next;
    }

    /* 6. Change the next of last node */
    temp->next = n;
}

// This function prints contents of 
// linked list starting from head  
void printList(node *node1)
{
    //Your code here
    if(node1 == NULL) cout<<"Empty Linked List"<<endl;

    while(node1 != NULL){
        cout<<node1->data<<" ";
        node1 = node1->next;
    }

}

/* Driver code*/
int main()
{
    node* head = NULL;
    append(&head, 6);
    push(&head, 7);
    push(&head, 1);
    append(&head, 4);
    insertAfter(head, 8);
    insertAfter(NULL, 8);
    cout<<"Created Linked list is: ";
    printList(head);
    return 0;
}  

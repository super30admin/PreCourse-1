#include<iostream>
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
    Node* newNode = new Node();

        newNode->data=new_data;
        newNode->next=*head_ref;
        *head_ref=newNode;

}

/* Given a node prev_node, insert a new node after the given
prev_node */
void insertAfter(Node* prev_node, int new_data)
{
    if(prev_node==NULL)
    {
        cout<<"Cannot be inserted after NULL.";
    }
    else{
        Node* newNode = new Node();
        newNode->data=new_data;
        Node *temp = prev_node->next;
        prev_node->next = newNode;
        newNode->next = temp;
    }

}

/* Given a reference (pointer to pointer) to the head
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)
{
    Node* newNode = new Node(); /* 1. allocate node */
    newNode->data=new_data;         /* 2. put in the data */
    newNode->next=NULL;          /* 3. This new node is going to be
                                     the last node, so make next of
                                     it as NULL*/
    Node* temp =*head_ref;
    if(*head_ref==NULL)
    {
        *head_ref=newNode;    /* 4. If the Linked List is empty,
                               then make the new node as head */
    }
    else
    {
        while(temp->next!=NULL)
        {
            temp=temp->next;           /* 5. Else traverse till the last node */

        }
        temp->next=newNode; return;  /* 6. Change the next of last node */
    }
}

// This function prints contents of
// linked list starting from head
void printList(Node *node)
{
    Node* temp= node;
    while(temp!=NULL)
    {
        cout<<temp->data<<" ";
        temp=temp->next;
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
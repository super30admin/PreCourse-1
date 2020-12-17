//Linked list additions//
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
    /* 1. allocate node */
    Node* temp;

    /* 2. put in the data */
    temp->data=new_data;

    /* 3. Make next of new node as head */
    temp->next=head_ref;

    /* 4. move the head to point to the new node */
    head_ref=temp;
}

/* Given a node prev_node, insert a new node after the given prev_node */
void insertAfter(Node** prev_node, int new_data)
{
    /*1. check if the given prev_node is NULL */
    if(prev_node->next==NULL)

        {
            cout<<"End of linked list";
            return -1;
        }

    /* 2. allocate new node */
    Node* newNode = new Node;

    /* 3. put in the data */
    newNode->data = new_data

    /* 4. Make next of new node as next of prev_node */
    newNode->next = prev_node->next ;

    /* 5. move the next of prev_node as new_node */
    prev_node->next = newNode;
}

/* Given a reference (pointer to pointer) to the head
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)
{
    /* 1. allocate node */
    Node* lastNode = new Node;

    /* 2. put in the data */
    lastNode->data = new_data;

    /* 3. This new node is going to be
    the last node, so make next of
    it as NULL*/
    lastNode->next = NULL;

    /* 4. If the Linked List is empty,
    then make the new node as head */
    if(head_ref->next==NULL)
    {
        head_ref = lastNode;
    }

    /* 5. Else traverse till the last node */
    else
    {
        while(head_ref->next!=NULL)
        {
           /* 6. Change the next of last node */
            lastNode->next=NULL;
        }
    }
}

// This function prints contents of
// linked list starting from head
void printList(Node *node)
{
    Node* n = node;
    if(n->next==NULL)
        cout<<"Linked List is empty"<<endl;
    else
    {
        while(n->next!=NULL)
        {
            cout<<"contents of the list"<<endl;
            cout<<n->data<<endl;
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
    cout<<"Created Linked list is: ";
    printList(head);
    return 0;
}

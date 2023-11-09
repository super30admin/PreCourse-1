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
    /* 1. allocate node */ 
    Node *new_node = new Node();
    /* 2. put in the data */  
    new_node->data = new_data;
    /* 3. Make next of new node as head */ 
    new_node->next = *head_ref;
    /* 4. move the head to point to the new node */
    *head_ref = new_node;
}  
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
/*
You check if the node is empty or not
After that you add node in between by creating a new node
pointing the new node to the prev_node -> next node.
And pointing prev_node to next_node.
*/
void insertAfter(Node* prev_node, int new_data)  
{  
    /*1. check if the given prev_node is NULL */ 
    if(!prev_node)
    {
        cout<<"Invalid can't enter after null pointer "<<endl;
        return;
    }

    /* 2. allocate new node */ 
    Node* new_node = new Node();
    /* 3. put in the data */ 
    new_node->data = new_data;
    /* 4. Make next of new node as next of prev_node */
    new_node->next = prev_node->next;
    /* 5. move the next of prev_node as new_node */ 
    prev_node->next = new_node;
}  
  
/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)  
{ 
    Node* temp = new Node(); 
    /* 1. allocate node */ 
    Node* new_node = new Node();
    /* 2. put in the data */ 
    new_node->data = new_data;
    /* 3. This new node is going to be  
    the last node, so make next of  
    it as NULL*/  
    new_node->next = NULL;
    /* 4. If the Linked List is empty, 
    then make the new node as head */
    if(!(*head_ref))
    {
        *head_ref = new_node;
        return;
    }
    /* 5. Else traverse till the last node */
    else
    {
        
        temp = *head_ref;
        while(!(temp->next))
        {
            temp = temp->next;
        }
    }
    /* 6. Change the next of last node */
    temp->next = new_node;
    return;
}  
  
// This function prints contents of 
// linked list starting from head 
/*
running until null pointer is met
if initally met then printing list empty.
*/ 
void printList(Node *node)  
{  
    //Your code here
    if(!node)
    {
        cout<<"Linked list is empty "<<endl;
    }
    else
    {
        while(node)
        {
            cout<<node->data;
            node = node->next;
            if(node)
                cout<<"->";
        }
        cout<<endl;
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
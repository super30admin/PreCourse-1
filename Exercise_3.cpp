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
    /* 1. allocate node */ 
    Node* node_to_be_pushed = new Node();
    /* 2. put in the data */  
    node_to_be_pushed->data = new_data;
    /* 3. Make next of new node as head */ 
    node_to_be_pushed->next = *head_ref;
    /* 4. move the head to point to the new node */
    *head_ref = node_to_be_pushed;
}  
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
    /*1. check if the given prev_node is NULL */ 
    if(prev_node!=NULL){
    /* 2. allocate new node */ 
    Node* node_to_be_added = new Node();
    /* 3. put in the data */ 
    node_to_be_added->data = new_data;
    /* 4. Make next of new node as next of prev_node */
    node_to_be_added->next = prev_node->next;
    /* 5. move the next of prev_node as new_node */
    prev_node->next = node_to_be_added; 
    }
}  
  
/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)  
{  
    /* 1. allocate node */ 
    Node* node_to_append = new Node();
    /* 2. put in the data */ 
    node_to_append->data = new_data;
    /* 3. This new node is going to be  
    the last node, so make next of  
    it as NULL*/  
    node_to_append->next=NULL;
    /* 4. If the Linked List is empty, 
    then make the new node as head */
    if(*head_ref == NULL){
        *head_ref = node_to_append;
    }
    /* 5. Else traverse till the last node */
    else{
        Node* trav = *head_ref;
        while(trav->next!=NULL){
            trav = trav->next;
        }
    /* 6. Change the next of last node */ 
        trav->next = node_to_append;
    }
}  
  
// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    //Your code here
    if(node!=NULL){
        while(node!=NULL){
            cout<<node->data<<endl;
            node = node->next;
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
    cout<<"Created Linked list is: "<<endl;  
    printList(head);  
    return 0;  
}  
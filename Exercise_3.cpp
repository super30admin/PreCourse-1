#include <bits/stdc++.h> 
using namespace std; 
  
// A linked list node (changes) 
class Node  
{  
    public: 
    int data;  
    Node *next;
    Node(int ndata){
        this->data=ndata;
        this->next=NULL;
    }
};  
  
/* Given a reference (pointer to pointer) 
to the head of a list and an int, inserts 
a new node on the front of the list. */
void push(Node** head_ref, int new_data)  
{  
    /* 1. allocate node */ 
    Node* t=new Node(new_data);
    Node* te= *head_ref;
    if(te==NULL){
        *head_ref=t;return;
    }
    *head_ref = t;
    t->next = te;
  
    /* 2. put in the data */  
  
    /* 3. Make next of new node as head */ 
  
    /* 4. move the head to point to the new node */
}  
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
    /*1. check if the given prev_node is NULL */ 
    Node* t=new Node(new_data);
    Node* te= prev_node;
    if(te==NULL){
         prev_node=t;return;
    }
    t->next = prev_node->next;
    prev_node->next = t;
    /* 2. allocate new node */ 
  
    /* 3. put in the data */ 
  
    /* 4. Make next of new node as next of prev_node */
  
    /* 5. move the next of prev_node as new_node */ 
}  
  
/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)  
{  
    /* 1. allocate node */ 
    Node* t=new Node(new_data);
    Node* te= *head_ref;
    if(te==NULL){
        *head_ref=t;return;
    }
    while(te->next!=NULL){
        te=te->next;
    }
    te->next = t;
    /* 2. put in the data */ 
  
    /* 3. This new node is going to be  
    the last node, so make next of  
    it as NULL*/  
  
    /* 4. If the Linked List is empty, 
    then make the new node as head */
  
    /* 5. Else traverse till the last node */
  
    /* 6. Change the next of last node */ 
}  
  
// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    //Your code here
    Node* te= node;
    if(te==NULL){
        return;
    }
    while(te!=NULL){
        cout<<te->data<<' ';
        te=te->next;
    }
    cout<<'\n';
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
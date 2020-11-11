#include <bits/stdc++.h> 
using namespace std; 
  
// A linked list node (changes) 
class Node  
{  
    public: 
    int data;  
    Node *next;  
};  

Node* newNode(int data) 
{ 
    Node* linked_list = new Node(); 
    linked_list->data = data; 
    linked_list->next = NULL; 
    return linked_list; 
}
  
/* Given a reference (pointer to pointer) 
to the head of a list and an int, inserts 
a new node on the front of the list. */
void push(Node** head_ref, int new_data)  
{  
    /* 1. allocate node */
    Node* newNode = new Node;
  
    /* 2. put in the data */  
    newNode->data = new_data;
  
    /* 3. Make next of new node as head */
    newNode->next = *head_ref;
  
    /* 4. move the head to point to the new node */
    *head_ref = newNode;
    
    return;
}  
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
    /*1. check if the given prev_node is NULL */ 
    if(prev_node!=NULL){
        cout<<"previous node exists\n";
    }
    else{
        cout<<"list seems to be empty\n";
    }
    /* 2. allocate new node */ 
    Node* insertNode = new Node;
  
    /* 3. put in the data */ 
    insertNode->data = new_data;
  
    /* 4. Make next of new node as next of prev_node */
    insertNode->next = prev_node->next;
  
    /* 5. move the next of prev_node as new_node */ 
    prev_node->next = insertNode;
    
    return;
}  
  
/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)  
{  
    /* 1. allocate node */
    Node* current;
    Node* addNode = new Node;
  
    /* 2. put in the data */ 
    addNode->data = new_data;
  
    /* 3. This new node is going to be  
    the last node, so make next of  
    it as NULL*/  
    addNode->next = NULL;
  
    /* 4. If the Linked List is empty, 
    then make the new node as head */
    if(*head_ref==NULL){
        *head_ref = addNode;
    }
  
    /* 5. Else traverse till the last node */
    else{
        //int len = 0, i; 
        current = *head_ref; 
  
        // count the number of nodes in Linked List 
        while (current->next != NULL) { 
            current = current->next; 
            //len++; 
        }
        /* 6. Change the next of last node */ 
        current->next = addNode;
    }
    
}  
  
// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    Node *current = node;
    while(current!=NULL){
        cout<<current->data<<" ";
        current = current->next;
    }
    return;
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
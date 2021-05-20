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
    Node* node = new Node(); 
    node->data = data; 
    node->next = NULL; 
    return node; 
} 

/* Given a reference (pointer to pointer) 
to the head of a list and an int, inserts 
a new node on the front of the list. */
void push(Node** head_ref, int new_data)  
{  
    /* 1. allocate node */ 
    /* 2. put in the data */  
    Node * newN = newNode(new_data);

    /* 3. Make next of new node as head */ 
    newN->next = *head_ref;
    /* 4. move the head to point to the new node */
    *head_ref = newN;
}
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
    if(prev_node!=NULL){
        Node *newN = newNode(new_data);
        newN->next = prev_node->next;
        prev_node->next = newN;
    }
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
    Node * newN = newNode(new_data);
    if(*head_ref == NULL){
        *head_ref = newN;
        return;
    }

    Node *currN = *head_ref;
    while(currN->next != NULL){
        currN = currN->next;
    }
    currN->next = newN;
}  
  
// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    while(node != NULL){
        cout << node->data << "->";
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
    insertAfter(head->next, 8);  
    cout<<"Created Linked list is: ";  
    printList(head);  
    return 0;  
}  
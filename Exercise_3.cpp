#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std; 
//TC: O(N)
//SC: O(1)
  
// A linked list node (changes) 
class Node  
{  
    public: 
    int data;  
    Node *next;  
};  
Node* newNode(int data){
    Node* nn = new Node();
    nn->data = data;
    nn->next = NULL;
    return nn;
}
  
/* Given a reference (pointer to pointer) 
to the head of a list and an int, inserts 
a new node on the front of the list. */
void push(Node** head_ref, int new_data)  
{  
    /* 1. allocate node */ 
    Node* nn = newNode(new_data);
    nn->next = *head_ref;
    *head_ref = nn;
  
    /* 2. put in the data */  
  
    /* 3. Make next of new node as head */ 
  
    /* 4. move the head to point to the new node */
}  
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
    /*1. check if the given prev_node is NULL */ 

    if(prev_node==NULL) 
    {
        return;
    }
    Node* nn = newNode(new_data);
    nn->next = prev_node->next;
    prev_node->next = nn;
  
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
    Node* nn = newNode(new_data);
    if(*head_ref == NULL) {
        *head_ref = nn;
        return;
    }
    Node* temp = *head_ref;
    Node* prev = *head_ref;
    while (temp!=NULL)
    {
        /* code */
        prev = temp;
        temp = temp->next;
    }
    prev->next = nn;
    
  
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
    Node* temp = node;
    while(temp!=NULL)
    {
        cout<< temp->data << "  ";
        temp = temp->next;
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
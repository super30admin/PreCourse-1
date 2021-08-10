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
    Node* newNode = new Node();
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}  
/* Given a reference (pointer to pointer) 
to the head of a list and an int, inserts 
a new node on the front of the list. */
void push(Node** head_ref, int new_data)  
{  
    if((*head_ref) == NULL){
        *head_ref = newNode(new_data);
        return;
    }
    Node* temp = *head_ref;
    *head_ref = newNode(new_data);
    (*head_ref)->next= temp; 

}  
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
    /*1. check if the given prev_node is NULL */ 
    if(prev_node == NULL)
    return;
    Node* temp = prev_node->next;
    prev_node->next = newNode(new_data);
    prev_node->next->next = temp;
    
}  
  
/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)  
{  
   
    if(*head_ref == NULL)
    {
        (*head_ref) = newNode(new_data);
        return;
    }

    Node* temp = *head_ref;
    while(temp->next!=NULL){
        temp = temp->next;
    }
    temp->next = newNode(new_data);
  
}  
  
// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    while(node!=NULL){
        cout<<node->data<<" ";
        node = node->next;
    }
    cout<<endl;
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
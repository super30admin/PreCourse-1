#include <bits/stdc++.h> 
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
     Node *temp=new Node();
    /* 2. put in the data */  
    temp->data=new_data;
    /* 3. Make next of new node as head */ 
    temp->next=(*head_ref);
    /* 4. move the head to point to the new node */
    (*head_ref)=temp;
}  
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
    
     if(prev_node==nullptr)
    {
        return;
    }
    
    Node* temp = new Node();
    temp->data=new_data;
    temp->next=prev_node->next;
    prev_node->next=temp;
  
}  
  
/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)  
{  
    Node *iter=(*head_ref);
    Node* newnode=new Node();
    newnode->data=new_data;
    newnode->next=nullptr;
      if((*head_ref)==nullptr)
    {
        (*head_ref)=newnode;
        return;
    }
     else{
        
        while(iter->next!=nullptr)
        {
            iter=iter->next;
        }
    }
    iter->next=newnode;
    return;
}  
  
// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    Node * iter=node;
    while(iter!=nullptr)
    {
        std::cout<<" "<<iter->data;
        iter=iter->next;
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


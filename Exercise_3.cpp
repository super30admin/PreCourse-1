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
    // TimeComplexity - O(1)
    // SpaceComplexity - O(n)  
    /* 1. allocate node */ 
    /* 2. put in the data */ 
    Node* newNode1 =  newNode(new_data);
    
    /* 3. Make next of new node as head */
    newNode1->next= *head_ref;
    
    /* 4. move the head to point to the new node */
    *head_ref = newNode1;
}  
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
    // TimeComplexity - O(1)
    // SpaceComplexity - O(n)
    /*1. check if the given prev_node is NULL */ 
     if ( prev_node == NULL){
         return;
     }
     else {
         
        /* 2. allocate new node */ 
        /* 3. put in the data */ 
        Node* newNode1 =  newNode(new_data);
        
        /* 4. Make next of new node as next of prev_node */
        newNode1->next= prev_node->next;
        /* 5. move the next of prev_node as new_node */ 
        prev_node->next = newNode1;
     }
}  
  
/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)  
{  
    // TimeComplexity - O(n)
    // SpaceComplexity - O(n)
    /* 1. allocate node */ 
    /* 2. put in the data */ 
    /* 3. This new node is going to be  
    the last node, so make next of  
    it as NULL*/ 
    Node* newNode1 =  newNode(new_data);
  
    /* 4. If the Linked List is empty, 
    then make the new node as head */
    if(*head_ref == NULL){
        *head_ref = newNode1;
    }
    else{
    
    Node* temp =*head_ref;
    
    /* 5. Else traverse till the last node */
    while(temp -> next != NULL ){
        temp = temp->next;
    }
    /* 6. Change the next of last node */ 
    temp->next = newNode1;
    }
 
}  
  
// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    // TimeComplexity - O(n)
    // SpaceComplexity - O(1)
    //Your code here
   // cout<<"printing data ";
    while(node){
        cout<<node->data<<endl;  
        node =node->next;
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
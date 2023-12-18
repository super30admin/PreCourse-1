// Time Complexity : O(1) for all push and insertAfter. O(n) for append and print
// Space Complexity : O(1)
// Any problem you faced while coding this : no
#include <iostream> 
using namespace std; 
  
// A linked list node (changes) 
class Node  
{  
    public: 
    int data;  
    Node *next;

    Node()
    {
        data = 0;
        next = nullptr;
    }

    Node(int data)
    {
        this->data = data;
        this->next = nullptr;
    }
};  
  
/* Given a reference (pointer to pointer) 
to the head of a list and an int, inserts 
a new node on the front of the list. */
void push(Node** head_ref, int new_data)  
{  
    /* 1. allocate node */ 
  
    /* 2. put in the data */  
  
    /* 3. Make next of new node as head */ 
  
    /* 4. move the head to point to the new node */
    Node* newNode = new Node();
    newNode->data = new_data;
    newNode->next = (*head_ref);
    (*head_ref) = newNode;
    return;
}  
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
    /*1. check if the given prev_node is NULL */ 
  
    /* 2. allocate new node */ 
  
    /* 3. put in the data */ 
  
    /* 4. Make next of new node as next of prev_node */
  
    /* 5. move the next of prev_node as new_node */
    if(prev_node == nullptr)
    {
        cout<<"cannot insert"<<endl;
        return;
    }

    Node* newNode = new Node();
    newNode->data = new_data;
    Node* nextNode = prev_node->next;
    prev_node->next = newNode;
    newNode->next = nextNode;
    return;
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
    Node* headNode = *head_ref;
    Node* newNode = new Node();
    newNode->data = new_data;
    newNode->next = nullptr;
    if(*head_ref == nullptr)
    {
        (*head_ref) = newNode;
        return;
    }
    while(headNode->next != nullptr)
    {
        headNode = headNode->next;
    }
    headNode->next = newNode;
    return;
}  
  
// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    //Your code here
    if(node == nullptr)
    {
        cout<<"List is empty"<<endl;
    }
    while(node != nullptr)
    {
        cout<<"Data - "<<node->data<<endl;
        node=node->next;
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
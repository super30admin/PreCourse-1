#include <iostream>
using namespace std; 
  
// A linked list node (changes)
// Approach : Implementing Singly Linked List
//          1. push :
//              a. Push requires node to be pushed at the front.
//              b. Hence, create a node and make its next as current head.
//              c. Point head to newly created node.
//              d. Time Complexity : O(1)  Constant Time.
//              e. Space Complexity : O(1) Constant Space.
//          2. insertAfter :
//              a. Create a new node.
//              b. Point previous node -> next to newNode/
//              c. Time Complexity : O(1)  Constant Time.
//              d. Space Complexity : O(1) Constant Space.
//          3. append :
//              a. Create a new node with data.
//              b. Assign next to null as it is going to be the last node.
//              c. Check if list is empty. If it is then assign this node as head node.
//              d. Else traverse till the last node and insert new node at the end.
//              e. Time Complexity : O(n)
//              f. Space Complexity : O(1) Constant Space
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
    Node* newData = new Node();

    /* 2. put in the data */  
    newData->data = new_data;

    /* 3. Make next of new node as head */ 
    newData->next = *head_ref;

    /* 4. move the head to point to the new node */
    *head_ref = newData;
}  
  
/* Given a node prev_node, insert a new node after the given  
prev_node */
void insertAfter(Node* prev_node, int new_data)  
{  
    /*1. check if the given prev_node is NULL */ 
    if(prev_node == nullptr)
    {
        return;
    }

    /* 2. allocate new node */ 
    Node* newNode = new Node();
    /* 3. put in the data */ 
    newNode->data = new_data;

    /* 4. Make next of new node as next of prev_node */
    newNode->next = prev_node->next;

    /* 5. move the next of prev_node as new_node */
    prev_node->next = newNode; 
}  
  
/* Given a reference (pointer to pointer) to the head  
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)  
{  
    /* 1. allocate node */ 
    Node* newNode = new Node();
    Node* traverseNode = *head_ref;
    /* 2. put in the data */ 
    newNode->data = new_data;
    
    /* 3. This new node is going to be  
    the last node, so make next of  
    it as NULL*/  
    newNode->next = nullptr;

    /* 4. If the Linked List is empty, 
    then make the new node as head */
    if(traverseNode == nullptr)
    {
        *head_ref = newNode; 
        return;
    }

    /* 5. Else traverse till the last node */
    else
    {
        while(traverseNode->next != nullptr)
        {
            traverseNode = traverseNode->next;
        }
    }


    /* 6. Change the next of last node */ 
    traverseNode->next = newNode;
}  
  
// This function prints contents of 
// linked list starting from head  
void printList(Node *node)  
{  
    //Your code here
    cout << endl;
    while(node != nullptr)
    {
        cout << node->data << " -> ";
        node = node->next;
    }
    cout << "null" << endl;
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
//time complexity: for push: O(1), for insertAfter(): O(1), for append: O(n) for n elements, for printList: O(n) for n elements
// space complexity: O(n) for n elements

#include <bits/stdc++.h> 
using namespace std; 
  
class Node  
{  
public: 
    int data;  
    Node *next;  
};  
  
void push(Node** head_ref, int new_data)  
{  
   
    Node* new_node = new Node();  
    new_node->data = new_data;  
    new_node->next = *head_ref;  
    *head_ref = new_node;  
}  
  
 
void insertAfter(Node* prev_node, int new_data)  
{  
    if (prev_node == NULL)  
    {  
        cout << "The given previous node cannot be NULL";  
        return;  
    }  
    Node* new_node = new Node();  
    new_node->data = new_data;  
    new_node->next = prev_node->next;  
  
    prev_node->next = new_node;  
}  
  
void append(Node** head_ref, int new_data)  
{  
    Node* new_node = new Node();  
    new_node->data = new_data;  
    new_node->next = NULL;  
    if (*head_ref == NULL)  
    {  
        *head_ref = new_node;  
        return;  
    }  
  
    Node* last = *head_ref;  
    while (last->next != NULL)  
    {  
        last = last->next;  
    }  
    last->next = new_node;  
}  
void printList(Node *node)  
{  
    while (node != NULL)  
    {  
        cout << node->data << " ";  
        node = node->next;  
    }  
    cout << endl;
}  

int main()  
{  
    Node* head = NULL;   
    
    append(&head, 6);  
    push(&head, 7);  
    push(&head, 1);    
    append(&head, 4);    
    insertAfter(head->next, 8);  
  
    cout << "Created Linked list is: ";  
    printList(head);  
  
    return 0;  
}  

// Time Complexity :
//Addition -: O(n)
//Deletion -: O(n)
//Insetion-O(n)
// Space Complexity :
//O(n)
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : Deferencing the pointer to a pointer.


// Your code here along with comments explaining your approach

//Singly linked list is implemented using linked list
//Operation : add_at_end, insertion, deletion, displaying, count_of_numbers_variables

#include <iostream>

using namespace std;

template<typename T>
struct node_s {
    T data;
    node_s * link;
};

template <typename T>
void list_add_at_end(node_s<T> **monitored_stack_head, T value){
    //create new node_s
    node_s<T> * new_node = new(node_s<T>);
    new_node->data = value;
    new_node->link =NULL;

    //edge case
    if (*monitored_stack_head==NULL){
        *monitored_stack_head = new_node;
        return;
    }
    node_s<T> * temp = *monitored_stack_head;
    while(temp->link!=NULL){
        temp=temp->link;
    }
    //Element is added
    temp->link = new_node;
}


template <typename T>
void list_insert(node_s<T> **monitored_stack_head, T value, int index){
    //create new node_s
    node_s<T> * new_node = new(node_s<T>);
    new_node->data = value;
    new_node->link =NULL;
   
    //edge case
    if (index==1 ){
        if (*monitored_stack_head==NULL){
           *monitored_stack_head = new_node;
        }
        else{
            new_node->link = *monitored_stack_head;
            *monitored_stack_head  = new_node;
        }
        return;
    }
    
    
    node_s<T> * temp = *monitored_stack_head;
    while(temp->link!=NULL && index>2){
        temp=temp->link;
        index--;
    }
    //Element is added
    new_node->link = temp->link;
    temp->link = new_node;
}


template <typename T>
void list_delete(node_s<T> **monitored_stack_head,  int index){
     node_s<T> * temp = *monitored_stack_head;
    //edge case
    if (index==1 ){
        if (*monitored_stack_head==NULL);
        else{
            *monitored_stack_head  = temp->link;
            delete(temp);
        }
        return;
    }
   
    while(temp->link!=NULL && index>2){
        temp=temp->link;
        index--;
    }
    
    node_s<T> *prev= temp;
    
    //Delete is added
    if (temp->link!=NULL)
        temp = temp->link;
    else
        return;
    
     if (temp->link!=NULL)
        prev->link = temp->link;
     delete(temp);
     return;
}

template <typename T>
void list_display(node_s<T> **head){
    node_s<T> * temp = *head;
    while(temp!=NULL){
        cout<<temp->data<<"\t";
        temp=temp->link;
    }
}



int main(){
    

    
    node_s<int> * head = NULL;
    
    bool is_func_implemented =0;
    
    list_insert(&head, 61, 1);
    list_add_at_end(&head, 88);
    list_add_at_end(&head, 71);
    list_insert(&head, 60, 1);
    list_insert(&head, 64, 4);
    list_display(&head);
    cout<<"\n";
    list_delete(&head,  6);
    list_display(&head);
    cout<<"\n";
    list_delete(&head,  1);
    list_display(&head);
    cout<<"\n";
    list_insert(&head, 63, 3);
    list_display(&head);
    cout<<"\n";


    cout <<is_func_implemented<<endl;
    

    return 0;
}

// Time Complexity :
//Addition -: O(n)
//Deletion -: O(n)
// Space Complexity :
//O(n)
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : Deferencing the pointer to a pointer.


// Your code here along with comments explaining your approach

//Stack is implemented using linked list 

#include <iostream>
#include <string>
#include <vector>
#include <stdlib.h>
#include <math.h>
#include <stack>
using namespace std;

template<typename T>
struct node {
    T data;
    node * link;
};


template <typename T>
void stack_push(node<T> **monitored_stack_head, T value){
    //create new node
    node<T> * new_node = new(node<T>);
    new_node->data = value;
    new_node->link =NULL;
    
    //edge case
    if (*monitored_stack_head==NULL){
        *monitored_stack_head = new_node;
        return;
    }
    node<T> * temp = *monitored_stack_head;
    while(temp->link!=NULL){
        temp=temp->link;
    }
    //Element is added
    temp->link = new_node;
}


template <typename T>
void stack_pop(node<T> **monitored_stack_head){
    //edge case
    if (*monitored_stack_head==NULL){
        return;
    }
    
    node<T> * prev = *monitored_stack_head;
    node<T> * temp = *monitored_stack_head;
    while(temp->link!=NULL){
        prev=temp;
        temp=temp->link;
    }
    if(temp ==  *monitored_stack_head){
        *monitored_stack_head =NULL;
        return;
    }
    prev->link = NULL;
    delete(temp);
    
}

template <typename T>
T stack_peek(node<T> **monitored_stack_head){
    //edge case
    if (*monitored_stack_head==NULL){
        return;
    }
    node<T> * temp = *monitored_stack_head;
    while(temp->link!=NULL){
        temp=temp->link;
    }
    return temp->data;
}



template <typename T>
void display_stack(node<T> **monitored_stack_head){
    node<T> * temp = *monitored_stack_head;
    while(temp!=NULL){
        cout<<temp->data<<"\t";
        temp=temp->link;
    }
}


template <typename T>
bool is_stack_empty (node<T> **monitored_stack_head){
    if (*monitored_stack_head == 0){
        return true;
    }
    return false;
}


int main(){
    

    
    node<int> * monitored_stack_head = NULL;
    
    bool is_func_implemented =0;
    
    stack_push(&monitored_stack_head, 88);
    stack_push(&monitored_stack_head, 71);
    display_stack(&monitored_stack_head);
    cout<<"\n";
    
    stack_pop(&monitored_stack_head);
    stack_pop(&monitored_stack_head);
    stack_pop(&monitored_stack_head);

    is_func_implemented =is_stack_empty(&monitored_stack_head);

    cout <<is_func_implemented<<endl;
    

    return 0;
}
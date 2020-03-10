 Time Complexity :
//Insetion -: Average : O(logn), Worst : O(n)

// Space Complexity :
//O(1)
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : Deferencing the pointer to a pointer.


// Your code here along with comments explaining your approach

//Insertion of an element in Binary Search Tree


#include <iostream>

using namespace std;


template <typename T>
struct BST_node{
    T data;
    BST_node * left;
    BST_node * right;
};

template <typename T>
BST_node<T>* create_new_node(BST_node<T>* root, T data){
    root = new BST_node<T>;
    root->data = data;
    root->left =NULL;
    root->right =NULL;
    return root;
}

template <typename T>
BST_node<T>* insert_new_node(BST_node<T>* root, T data){
    if (root ==NULL){
        root = create_new_node(root, data);
    }
    else if(data <= root->data){
        root->left = insert_new_node(root->left, data);
    }
    else{
         root->right = insert_new_node(root->right, data);
    }
     return root;
}

template <typename T>
void display_BST(BST_node<T>* root){
    
    if (root==NULL){
        return;
    }
    if (root->left !=NULL){
        display_BST(root->left);
    }
    if (root->right !=NULL){
        display_BST(root->right);
    }
    
    cout<<root->data<<"\t";
    return;
}

int main(void){
    BST_node<int> *root =NULL;
    root = insert_new_node(root, 5);
    root = insert_new_node(root, 4);
    root = insert_new_node(root, 3);
    root = insert_new_node(root, 6);
    root = insert_new_node(root, 7);
    display_BST(root);
    cout<<"\n";
    return 0;
}


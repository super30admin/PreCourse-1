#include <iostream> 
#include <queue> 
using namespace std; 
//new one
  
/* A binary tree node has key, pointer to left child 
and a pointer to right child */
struct Node { 
    int key; 
    struct Node* left, *right; 
}; 
  
/* function to create a new node of tree and r 
   eturns pointer */
struct Node* newNode(int key) 
{ 
    //Your code here
    struct Node* new_node = new Node();
    new_node->key = key;
    new_node->left = NULL;
    new_node->right = NULL;
    return new_node;
}; 
  
/* Inorder traversal of a binary tree*/
void inorder(struct Node* temp) 
{ 
    if (!temp) 
        return; 
  
    inorder(temp->left); 
    cout << temp->key << " "; 
    inorder(temp->right); 
} 
  
/*function to insert element in binary tree */
void insert(struct Node* temp, int key) 
{ 
  
    // Do level order traversal until we find 
    // an empty place.  
    
    //Your code here
    if(!temp){
        temp = newNode(key);
        return;
    }
    
    queue<Node*> q;
    q.push(temp);
    while(!q.empty()){
        Node* temp = q.front();
        q.pop();
        if(temp->left!=NULL){
            q.push(temp->left);
        }
        else{
            temp->left = newNode(key);
            return;
        }
        if(temp->right!=NULL){
            q.push(temp->right);
        }
        else{
            temp->right = newNode(key);
            return;
        }
    }
    
} 
  
// Driver code 
int main() 
{ 
    struct Node* root = newNode(10); 
    root->left = newNode(11); 
    root->left->left = newNode(7); 
    root->right = newNode(9); 
    root->right->left = newNode(15); 
    root->right->right = newNode(8); 
  
    cout << "Inorder traversal before insertion:"; 
    inorder(root); 
  
    int key = 12; 
    insert(root, key); 
  
    cout << endl; 
    cout << "Inorder traversal after insertion:"; 
    inorder(root); 
  
    return 0; 
} 

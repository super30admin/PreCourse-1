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
    Node *newN = new Node();
    newN->key = key;
    newN->left = NULL;
    newN->right = NULL;
    return newN;
    //Your code here
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
    struct Node* newN = newNode(key);
    queue<struct Node *> tempQ;
    tempQ.push(temp);
    while(!tempQ.empty()){
        struct Node *currN = tempQ.front();
        if(currN->left!=NULL){
            tempQ.push(currN->left);
        } else {
            currN->left = newN;
            return;
        }

        if(currN->right!=NULL){
            tempQ.push(currN->right);
        } else {
            currN->right = newN;
            return;
        }
        tempQ.pop();
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
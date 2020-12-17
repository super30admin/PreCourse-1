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
    struct Node *node;
    node=(struct Node*)malloc(sizeof(struct Node));
    node->key=key;
    node-> left=NULL;
    node-> right=NULL;
    return node;
    
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
  
    struct Node* temporary;
    queue<struct Node*> q;
    q.push(temp);

    while(!q.empty()) 
    {
        temporary = q.front();
        q.pop();

        /* Insert node as the left child of the parent node. */
        if(temporary->left == NULL) {
            temporary->left = newNode(key);
            break;
        }

        /* If the left node is not null push it to the queue. */
        else
            q.push(temporary->left);
        
        /* Insert node as the right child of the parent node. */
        if(temporary->right == NULL) {
            temporary->right = newNode(key);
            break;
        }

        /* If the right node is not null push it to the queue. */
        else
            q.push(temporary->right);
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
    cout << "Inorder traversal after insertion:"<< endl; 
    inorder(root); 
  
    return 0; 
} 
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
    Node* temp = new Node;
    temp->key = key;
    temp->left = NULL;
    temp->right = NULL;

    return temp; 

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

    Node *nn = newNode(key);

      

    Node* root = temp;
    queue<Node*> q;
    if(root != NULL)
      q.push(root);

    while(!q.empty()){
      Node* curr = q.front();
      q.pop();

      if(curr->left != NULL)
        q.push(curr->left);
      else {
        curr->left = nn;
        return;
      }
      
      if(curr->right != NULL)
        q.push(curr->right);
      else {
        curr->right = nn;
        return;
      }
     
    }

    //cout<<"Need to insert node!"<<endl;
    //Your code here
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
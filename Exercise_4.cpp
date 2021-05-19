//Time Complexity: O(n) for inorder traversal as we traverse only once over all nodes, O(n) for inserting as we need to traverse the queue, O(1) for newNode
//Space Complexity: O(h) where h is the height of the tree as those many call stacks will be made, O(n) for insertion if we consider the queue 
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
    struct Node *new_node = (struct Node *)malloc(sizeof(struct Node*));
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
    if(temp == NULL){
        temp = newNode(key);
    }
    else{
        queue<Node*> q1;
        q1.push(temp);

        while(!q1.empty()){
        // Do level order traversal until we find 
        // an empty place.
            struct Node *ptr = q1.front();
            q1.pop();
            if(ptr->left){
            q1.push(ptr->left);
            }  
            else{
                ptr->left = newNode(key);
                break;
            }

            if(ptr->right){
                q1.push(ptr->right);
            }
            else{
                ptr->right = newNode(key);
                break;
            }
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
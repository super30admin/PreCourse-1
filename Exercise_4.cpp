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
    struct Node* s = new Node();
    s->key = key;
    s->right = nullptr;
    s->left = nullptr;

    return s;
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
    queue<struct Node*> q;
    q.push(temp);
    bool flag = false;
    struct Node* nodeInsert = newNode(key);
    while(!q.empty() && !flag){
        int size = q.size();
        while(size-- && !flag){
            struct Node* currNode = q.front();
            q.pop();
            if(currNode && !currNode->left){
                currNode->left = nodeInsert;
                flag = true;
            }
            else{
                q.push(currNode->left);
            }
            if(currNode && !currNode->right && !flag){
                currNode->right = nodeInsert;
                flag = true;
            }
            else{
                q.push(currNode->right);
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
    insert(root, key+1); 
  
    cout << endl; 
    cout << "Inorder traversal after insertion:"; 
    inorder(root);
    cout << endl; 
  
    return 0; 
} 
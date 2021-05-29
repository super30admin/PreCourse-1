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
    struct Node *temp = (struct Node *)malloc(sizeof(struct Node));
    //Your code here
    temp->key = key;
    temp->left = temp->right= NULL;
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
    struct Node *temp1;
    queue<struct Node*> newQueue;
    newQueue.push(temp);
    while(!newQueue.empty())
    {
        temp1 = newQueue.front();
        newQueue.pop();
        if(temp1->left==NULL){
            temp1->left = newNode(key);
            break;
        }
        else
            newQueue.push(temp1->left);

        if(temp1->right==NULL){
            temp1->right = newNode(key);
            break;
        }
        else
            newQueue.push(temp1->right);
    }
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
     cout << '\b';

    return 0;
} 

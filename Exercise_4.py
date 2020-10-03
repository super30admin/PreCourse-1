# Python program to insert element in binary tree
class newNode():

    def __init__(self, data):
        self.key = data
        self.left = None
        self.right = None

""" Inorder traversal of a binary tree"""
def inorder(temp): #time complxity: O(n)
    if temp:
        inorder(temp.left)
        print(temp.key)
        inorder(temp.right)


"""function to insert element in binary tree """
def insert(temp,key): #inserting the nodes in a level order fashion
    if not temp:
        root = newNode(key)
        return
    q=[]  #queue is the best data structure to insert in level order fasion(breadth first)
    q.append(temp)
    while(len(q)):
        node = q[0]
        q.pop()
        if not node.left:
            node.left=newNode(key)
            break
        else:
            q.append(node.left)

        if not node.right:
            node.right = newNode(key)
            break
        else:
            q.append(node.right)


# Driver code
if __name__ == '__main__':
    root = newNode(10)
    root.left = newNode(11)
    root.left.left = newNode(7)
    root.right = newNode(9)
    root.right.left = newNode(15)
    root.right.right = newNode(8)

    print("Inorder traversal before insertion:", end = " ")
    inorder(root)

    key = 12
    insert(root, key)

    print()
    print("Inorder traversal after insertion:", end = " ")
    inorder(root)

#time complxity to insert a node: O(h), where h is the height of binary tree

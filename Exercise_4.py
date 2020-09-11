# Exercise_4 : Insert an element in a Binary Tree.


class Node:
    def __init__(self, data):
        # node's value
        self.data = data
        # left child
        self.left = None
        # right child
        self.right = None


# Inorder traversal of a binary tree - Recursive approach
def inorder(root):
    result = []
    if root:
        result = inorder(root.left)
        result.append(root.data)
        result = result + inorder(root.right)
    return result


# Insert an element in binary tree
def insert(temp, key):
    # Convert binary tree to a queue
    queue = [temp]

    # traverse the queue till there is an empty place to insert a new node
    while queue:
        # store the first node
        temp = queue[0]
        # remove this node from the queue
        queue.pop(0)

        if not temp.left:
            temp.left = Node(key)
            break
        else:
            queue.append(temp.left)

        if not temp.right:
            temp.right = Node(key)
            break
        else:
            queue.append(temp.right)


# Driver code  
if __name__ == '__main__':
    root = Node(10)
    root.left = Node(11)
    root.left.left = Node(7)
    root.right = Node(9)
    root.right.left = Node(15)
    root.right.right = Node(8)

    print("Inorder traversal before insertion:", end = " ")
    print(inorder(root))

    key = 12
    insert(root, key)

    print()
    print("Inorder traversal after insertion:", end = " ")
    print(inorder(root))

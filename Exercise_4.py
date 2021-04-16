# Python program to insert element in binary tree
class newNode():

    def __init__(self, data):
        self.key = data
        self.left = None
        self.right = None

""" Inorder traversal of a binary tree"""
def inorder(temp):
    stack = []
    curr = temp

    while curr or stack:
        if curr:
            stack.append(curr)
            curr = curr.left
        else:
            node =  stack.pop()
            print(node.key, end = "->")
            curr = node.right


from collections import deque
"""function to insert element in binary tree """
def insert(temp, key):
    new_node = newNode(key)
    if not temp:
        temp = new_node
        return temp
    queue = deque()
    queue.append(temp)

    while queue:
        ptr = queue.popleft()
        if not ptr.left:
            ptr.left = new_node
            break
        if not ptr.right:
            ptr.right = new_node
            break
        queue.append(ptr.left)
        queue.append(ptr.right)


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

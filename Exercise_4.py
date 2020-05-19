# Python program to insert element in binary tree  
class newNode():
    def __init__(self, data):
        self.key = data
        self.left = None
        self.right = None


""" Inorder traversal of a binary tree"""
# Time Complexity : O(n)
# Space Complexity : O(h) where h is height of the tree
# Did this code successfully run on Leetcode : Didn't try it on leetcode, ran it in the PyCharm IDE
# Any problem you faced while coding this:
def inorder(temp):
    if temp is None:
        return

    inorder(temp.left)
    print(temp.key, end = " ")
    inorder(temp.right)

"""function to insert element in binary tree """
# Time Complexity : O(n)
# Space Complexity : O(n) for the queue we used
# Did this code successfully run on Leetcode : Didn't try it on leetcode, ran it in the PyCharm IDE
# Any problem you faced while coding this:
def insert(temp,key):
    if temp is None:
        return

    #we find first available spot for the key to insert using level order traversal
    queue = []
    queue.append(temp)
    while len(queue):
        currentNode = queue.pop()
        if currentNode.left is None:
            currentNode.left = newNode(key)
        else:
            queue.append(currentNode.left)

        if currentNode.right is None:
            currentNode.right = newNode(key)
        else:
            queue.append(currentNode.right)

# Driver code
if __name__ == '__main__':
    root = newNode(10)
    root.left = newNode(11)
    root.left.left = newNode(7)
    root.right = newNode(9)
    root.right.left = newNode(15)
    root.right.right = newNode(8)

    print("Inorder traversal before insertion:", end = " ")
    print()
    inorder(root)
    key = 12
    insert(root, key)

    print()
    print("Inorder traversal after insertion:", end = " ")
    print()
    inorder(root)

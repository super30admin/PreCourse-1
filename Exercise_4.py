# Python program to insert element in binary tree
# Time Complexity: O(n) for inorder, I am not sure about insertion, I think it is O(h) where h is height
# Space Complexity: O(n) where n is the number of elements inserted
# Any problem you faced while coding this: No
# Your code here along with comments explaining your approach


class newNode():

    def __init__(self, data):
        self.key = data
        self.left = None
        self.right = None


""" Inorder traversal of a binary tree"""


def inorder(temp):  # calling the code recursively
    if temp:
        inorder(temp.left)
        print(temp.key)
        inorder(temp.right)


"""function to insert element in binary tree """


def insert(temp, key):
    """
    we do level order traversal here
    we insert into an array all the values while we traverse, the root, left and then right.
    as soon as we find a None value, we insert our key there and break the code
    """
    if not temp:
        return newNode(key)
    arr = []
    arr.append(temp)
    while arr:
        val = arr[0]
        arr.pop(0)
        if not val.left:
            val.left = newNode(key)
            break
        else:
            arr.append(val.left)
        if not val.right:
            val.right = newNode(key)
            break
        else:
            arr.append(val.right)


# Driver code
if __name__ == '__main__':
    root = newNode(10)
    root.left = newNode(11)
    root.left.left = newNode(7)
    root.right = newNode(9)
    root.right.left = newNode(15)
    root.right.right = newNode(8)

    print("Inorder traversal before insertion:", end=" ")
    inorder(root)

    key = 12
    insert(root, key)

    print()
    print("Inorder traversal after insertion:", end=" ")
    inorder(root)

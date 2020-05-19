# Time Complexity : O(n), because both inorder and insert visit every node once
#                   in the worst case, where n is the number of the nodes in tree
# Space Complexity : program: O(n) space, where n is the number of nodes in tree
#                    inorder: stack space O(h), where h is the height of the tree
#                    insert: O(n) because in the worst case the queue would have to
#                    hold all nodes, where n in the number of nodes in tree
# Did this code successfully run on Leetcode : N.A.
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
import queue
class newNode():

    def __init__(self, data):
        self.key = data 
        self.left = None
        self.right = None
          
""" Inorder traversal of a binary tree"""
def inorder(temp):
    if(temp == None):
        return
    # visit left
    inorder(temp.left)
    # print value
    print(temp.key)
    # visit right
    inorder(temp.right)
  

"""function to insert element in binary tree """
def insert(temp,key):
    if not temp == None:
        q = queue.Queue()
        q.put(temp)
        # level order traversal until the left most open spot is found
        while not q.empty():
            node = q.get()
            if node.left == None:
                node.left = newNode(key)
                break
            elif node.right == None:
                node.right = newNode(key)
                break
            else:
                q.put(node.left)
                q.put(node.right)

# Driver code  
if __name__ == '__main__': 
    root = newNode(10)  
    root.left = newNode(11)  
    root.left.left = newNode(7)  
    root.right = newNode(9)  
    root.right.left = newNode(15)  
    root.right.right = newNode(8)  
  
    print("Inorder traversal before insertion:")
    inorder(root)  
  
    key = 12
    insert(root, key)  
  
    print("Inorder traversal after insertion:")
    inorder(root)

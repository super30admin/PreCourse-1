from collections import deque

class Node:
    
    def __init__(self,val):
        self.val = val
        self.left = None
        self.right = None
    
class BinaryTree:
    def __init__(self):
        self.root=None

    def insert(self,val):
        if self.root==None:
            self.root = Node(val)
        else:
            temp = self.root
            queue = deque()
            queue.append(self.root)
            added = False
            while queue and not added:
                last = queue.popleft()
                if last:
                    if not last.left:
                        last.left = Node(val)
                        added = True
                    elif not last.right:
                        last.right = Node(val)
                        added = True
                    else:
                        queue.append(last.left)
                        queue.append(last.right)
    
    def getRoot(self):
        return self.root


def printPreOrderTraversal(node):
    if node:
        print(node.val)
        printPreOrderTraversal(node.left)
        printPreOrderTraversal(node.right)

if __name__=="__main__":
    bTree = BinaryTree()
    bTree.insert(2)
    bTree.insert(3)
    bTree.insert(4)
    bTree.insert(5)
    printPreOrderTraversal(bTree.getRoot())
        



    
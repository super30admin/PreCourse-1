class newNode(): 
 
  def __init__(self, data): 
      self.key = data
      self.left = None
      self.right = None

""" Inorder traversal of a binary tree"""
def inorder(temp):
  # if the tree is empty
  if not temp:
      return
  # if the tree is not empty then print the left tree, root node, and the right tree
  inorder(temp.left)
  print(temp.key,end = " ")
  inorder(temp.right)

"""function to insert element in binary tree """
def insert(temp, key):
  res = []
  # check if the list is empty
  if not temp:
      # add root node to the tree
      root = newNode(key)
      return
  # append root node to the tree
  res.append(temp)
  # traverse the tree
  while len(res):
    # update the temp with root/current node
    temp = res[0]
    # pop the root/current node
    res.pop(0) 
    # if the left tree is empty
    if not temp.left:
        # create and add a node to the left tree
        temp.left = newNode(key) 
        break
    else:
        # append the left tree to the list
        res.append(temp.left) 
    # if the right tree is empty
    if not temp.right:
        # create and add a node to the right tree
        temp.right = newNode(key) 
        break
    else:
        # append the right tree to the list
        res.append(temp.right)
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
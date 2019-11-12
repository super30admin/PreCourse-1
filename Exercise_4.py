# Python program to insert element in binary tree  
class newNode():  
  
    def __init__(self, data):  
        self.key = data 
        self.left = None
        self.right = None
          

def inorder(temp): 
    """
    Use stack for inorder traversal.
    Point current to root, and iterate till both stack and current are not null
    if node is not none, add it to the stack and point the current to current.left
    if node becomes none, pop the last element and set it as current, print its value and set the current to the popped elements right.
            10
           /  \
          11   9   
         /    /  \
        7    15    8

    first we will insert 10 in the stack, then current will point to 11
    then we will insert 11 in stack and current will point to 7
    then we will insert 7 in the stack and current will point to none
    we will pop from stack and current will be 7, we will point current to right of current which is none
    again we will pop from stack, current will be 11, we will point current to right of current which is none
    again we will pop from stack, current will be 10, we will point current to 9
    add 9 to stack and point current to 15
    add 15 to stack and point current to none
    pop from stack, current is equal to 15, point current to 15's left which is None
    pop from stack, current is equal to 9, point current to 9's right which is 8
    add 8 to stack, point current to 8's left which is none
    pop from stack, set current as 8 and then point current to current.right which is none
    Now stack is empty and current is also none so get out of the while loop.
    """
    stack = []
    current = temp
    while current or stack:
        if current is not None:
            stack.append(current)
            current = current.left
        else:
            current = stack.pop()
            print(str(current.key) + ' ')
            current = current.right
  
    
def insert(temp,key):
    """
    To insert, do level order traversal. Check where the child is not present and add the child there.
    Use queue
    append the item(root) to the queue
    iterate till the queue is empty
    dequeue from the queue and set it to current
    Check if it has left child, if it has, enqueue it, else set the left child to new node and break out of the loop
    Check if it has right child, if it has, enqueue it, else set the right child to the new node and break out of the loop
            10
           /  \
          11   9   
         /    /  \
        7    15    8
    
    Will add 10 in the queue
    Dequeue 10 from the queue and set it to current
    check for its left child, add 11 to the queue
    check for its right child, add 9 to the queue
    dequeue from the queue and set to current, i.e. 11 is current
    check for its left child, add 7 to the queue
    check for its right child, point 11's right to new node and break

    """
    queue = []
    queue.append(temp)
    while queue:
        current = queue.pop(0)
        if current.left:
            queue.append(current.left)
        else:
            current.left = newNode(key)
            break
        if current.right:
            queue.append(current.right)
        else:
            current.right = newNode(key)
            break
        

       
# Driver code  
if __name__ == '__main__': 
    root = newNode(10)  
    root.left = newNode(11)  
    root.left.left = newNode(7)  
    root.right = newNode(9)  
    root.right.left = newNode(15)  
    root.right.right = newNode(8)  
  
    print("Inorder traversal before insertion:", end = "\n") 
    inorder(root)  
  
    key = 12
    insert(root, key)  
  
    print()  
    print("Inorder traversal after insertion:", end = "\n") 
    inorder(root) 

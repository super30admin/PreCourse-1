Time and space complexity: O(1)
Executed in Leetcode: No Link. Executed in Jupyter notebook.
Challenges: Few errors when i din't code for self.root is none in pop() function.
    
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.root = None
        
    def push(self, data):
        NewNode = Node(data)
        NewNode.next = self.root
        self.root = NewNode   
        #return str(data)  + "successfully added to stack using Linked List"
        
    def pop(self):
        if self.root == None: 
          print("Empty string")
          return
        popItem = self.root.data
        self.root = self.root.next
        return popItem
        # return str(popItem) + "is the item popped"
        
a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
 
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break

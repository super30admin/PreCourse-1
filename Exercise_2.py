# Time Complexity : O(1)
# Space Complexity : O(n)
# O(n)

# Did this code successfully run on Leetcode : No, I did not solve this problem in leetcode

# Any problem you faced while coding this : Took sometime to write the code by myself but understood by taking help

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
 

class Stack:
    def __init__(self):
        self.head = None  # top of stack
        
    def push(self, data):
        # create new node
        new_node = Node(data)
        
        # point new node to current head
        new_node.next = self.head
        
        # update head to new node
        self.head = new_node
        
    def pop(self):
        # check if stack is empty
        if self.head is None:
            return None
        
        # store current head data
        popped = self.head.data
        
        # move head to next node
        self.head = self.head.next
        
        return popped
        
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

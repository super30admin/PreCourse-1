# // Time Complexity : O(1)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode :
# // Any problem you faced while coding this : No

class Node: 
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        # Initialization
        self.top = None  

    def push(self, data):
        new_node = Node(data)
        new_node.next = self.top
        # Shift top up
        self.top = new_node

    def pop(self):
        if self.top is None:
            return None
        popped = self.top.data
        # Shift top down to next node
        self.top = self.top.next  
        return popped
        
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
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

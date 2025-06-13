"""
Time and Space complexity for the following methods: 

1) __init__()
Time complexity: O(1)
Space complexity: O(1)

2) push()
Time complexity: O(1)
Space complexity: O(1)

2) pop()
Time complexity: O(1)
Space complexity: O(1)

3) peek()
Time complexity: O(1)
Space complexity: O(1)
"""

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        
    def push(self, data):
        newNode = Node(data)
        newNode.next = self.top
        self.top = newNode
        
    def pop(self):
        if self.top is not None:
           value = self.top.data
           self.top = self.top.next
           return value
        else:
            print('Stack Underflow')
            return 0

    def peek(self):
        if self.top is not None:
            return self.top.data
        else:
            print('Stack is empty!')
            return 0 

            
        
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

# TIME COMPLEXITY = O(1) for push, and pop operation
# SPACE COMPLEXITY = O(N)
# Did this code successfully run on Leetcode : Sorry, I did not find similar problem. This code works and it is tested by me.
# Any problem you faced while coding this: None

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.node = None

    def push(self, data):
        if self.node == None:
            # empty stack
            self.node = Node(data)
        else:
            _ = self.node
            self.node = Node(data)
            self.node.next = _

    def pop(self):
        if self.node == None:
            # empty stack
            return None
        else:
            _ = self.node.data
            self.node = self.node.next
            return _


a_stack = Stack()
while True:
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')

    do = input('What would you like to do? ').split()
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
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


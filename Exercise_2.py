"""
Time Complexity -> O(1) for push and pop operation
Space Complexity ->O(n) where n is the number of nodes

I have used a total variable to keep track of stack size to be used in
the pop function. This makes it easier to check if stack has values/ not
"""


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.top = None
        self.total = 0

    def push(self, data):
        new_node = Node(data)
        new_node.next = self.top
        self.top = new_node
        self.total += 1

    def pop(self):
        if self.total <= 0:
            return None
        else:
            elem = self.top.data
            self.top = self.top.next
            self.total -= 1
            return elem


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

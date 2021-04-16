class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.start = None

    def isEmpty(self):
        if self.start is None:
            return True
        else:
            return False

    def push(self, data):
        if self.start is None:
            self.start = Node(data)
        else:
            new_node = Node(data)
            new_node.next = self.start
            self.start = new_node

    def pop(self):
        if self.isEmpty():
            return None
        else:
            val = self.start.data
            self.start = self.start.next
            return val


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

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.root = None

    def push(self, data):
        if self.root:
            newnode = Node(data)
            newnode.next = self.root
            self.root = newnode
        else:
            self.root = Node(data)
        self.show()

    def pop(self):
        if self.root:
            poppedData = self.root.data
            self.root = self.root.next
            return poppedData

    def show(self):
        forward = self.root
        while forward:
            print(forward.data)
            forward = forward.next

    def isEmpty(self):
        return not self.root


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
        if not popped:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break

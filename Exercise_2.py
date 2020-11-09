class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = Node(None)
        self.top = self.head.next

    def push(self, data):
        node = Node(data)
        node.next = self.head.next
        self.head.next = node
        self.top = self.head.next

    def pop(self):
        val = self.top
        if val is None:
            return None
        self.head.next = self.top.next
        self.top = self.head.next
        return val.data

    def print_stack(self):
        curr = self.head.next
        while curr:
            print(curr.data, end = "->")
            curr = curr.next
        print("\n")

a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('print')
    print('quit')
    do = input('What would you like to do? ').split()
 
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
    elif operation == 'print':
        a_stack.print_stack()
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def insertAtBegin(self, data):
        new_node = Node(data)
        if self.head:
            new_node.next = self.head
        self.head = new_node

    def removeFromBegin(self):
        if not self.head:
            return None
        temp = self.head
        self.head = self.head.next
        return temp


class Stack:
    def __init__(self):
        self.stack_list = LinkedList()

    def push(self, data):
        self.stack_list.insertAtBegin(data)

    def pop(self):
        top = self.stack_list.removeFromBegin()
        if top:
            return top.data
        return None

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

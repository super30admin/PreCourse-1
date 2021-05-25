class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.head = None

    def push(self, data):
        if self.head == None:
            self.head = Node(data)
        else:
            new_node = Node(data)
            new_node.next = self.head
            self.head = new_node

    def pop(self):
        if self.head == None:
            print ("List is Empty")
            return self.head
        else:
            removed_node = self.head
            self.head = self.head.next
            return removed_node.data


a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    print('show')
    do = raw_input('What would you like to do? ').split()

    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == "show":
        node = a_stack.head
        while node:
            print(node.data)
            node = node.next
    elif operation == 'quit':
        break

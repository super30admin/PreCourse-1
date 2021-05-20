class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
    def push(self, data):
        if self.head is None:
            self.head = Node(data)
        else:
            node = Node(data)
            node.next = self.head
            self.head = node
    def pop(self):
        if self.head is not None:
            pop_node = self.head
            self.head = self.head.next
            pop_node.next = None
            return pop_node.data
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

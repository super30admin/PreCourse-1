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
            self.head.next = None
        else:
            new_element = Node(data)
            new_element.next = self.head
            self.head = new_element

    def pop(self):
        if self.head:
            to_pop = self.head
            self.head = self.head.next
            to_pop.next = None
            return to_pop.data


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
            print(' ')
            print('Stack is empty.')
            print(' ')
        else:
            print('---')
            print('Popped value: ', int(popped))
            print('---')
    elif operation == 'quit':
        break

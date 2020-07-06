class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:

    def __init__(self):
        self.root = Node(None)
    
    def push(self, data):
        if self.root.data is None:
            self.root.data = data
        else:
            temp = Node(data)
            temp.next = self.root
            self.root = temp

    def pop(self):

        if self.root.next is None:
            temp = self.root.data
            self.root = Node(None)
            return temp

        temp = self.root
        self.root = self.root.next
        return temp.data

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

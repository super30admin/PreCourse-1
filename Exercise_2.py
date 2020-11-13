class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.stack = None


    def push(self, data):
        if self.stack == None:
            self.stack = Node(data)
        else:
            newNode = Node(data)
            newNode.next = self.stack
            self.stack = newNode

    def pop(self):
        if self.stack == None:
            return None
        else:
            node = self.stack.data
            self.stack = self.stack.next
            return node

        
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

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = Node(None)
    def push(self, data):
        newNode = Node(data)
        if(self.head is None):
            self.head = newNode
        else:
            newNode.next = self.head
            self.head = newNode
    def pop(self):
        if(self.head is None):
            return None
        else:
            popNode = self.head
            self.head = popNode.next
            popNode.next = None
            return popNode.data

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

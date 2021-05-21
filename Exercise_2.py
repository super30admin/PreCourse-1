class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.first = None

    def push(self, data):
        if self.first is None:
            self.first = Node(data)
            return self.first
        else:
            newNode = Node(data)
            newNode.next = self.first
            self.first = newNode
            return self.first
        
    def pop(self):
        if self.first is None:
            return None
        else :
            removedNode = self.first
            self.first = self.first.next
            removedNode.next = None
            print(removedNode)
            return removedNode.data

a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
 
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
        # print(val)
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break

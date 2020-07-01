

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=None
    def push(self, data):
        node= Node(self.data)
        if self.head==None:
            self.head=node
        else:
            node.next= self.head
            self.head= node


        
    def pop(self):
        if self.head==None:
            return "stack is empty"

        temp=self.head
        self.head=temp.next
        temp.next=None
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

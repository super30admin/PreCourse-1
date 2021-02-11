class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        
        self.head=Node(10)
        
        
        
    def push(self, data):
        
        newNode=Node(data)
        newNode.next=self.head
        self.head=newNode
        
        
        
    def pop(self):
        
        if self.head==None:
            return 'stack is empty'
        
        else:
            popped=self.head
            self.head=self.head.next
            popped.next=None
            return popped.data
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

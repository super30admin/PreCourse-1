
class Stack:
    class Node:
       def __init__(self, data,next):
          self.data = data
          self.next = next

    def __init__(self):
        self.head=None

    def push(self, data):
        self.head=self.Node(data,self.head)
        
    def pop(self):
        if self.head is None:
            raise IndexError
        result=self.head.data
        self.head=self.head.next
        return result
        
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

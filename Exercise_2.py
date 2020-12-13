class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def isEmpty(self):
          return True if self.head == None else False
    
    def push(self, data):
        if self.head == None:
            self.head = Node(data)
        else:
            newnode = Node(data)
            newnode.next = self.head
            self.head = newnode
        return

    def pop(self):
        if self.isEmpty():
            return
        else:
            poppednode = self.head
            self.head = poppednode.next
            return poppednode.data

    def peek(self):
        if self.isEmpty():
            return
        else:
            return self.head.data
    
    def show(self):
        if self.isEmpty():
            return
        else:
            i = self.head
            out = '[TOP] '
            while i != None:
                out = out + str(i.data) + ' -> '
                i = i.next
            return out

        
a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('peek')
    print('show')
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
    elif operation == 'peek':
        top = a_stack.peek()
        if top is None:
            print('Stack is empty.')
        else:
            print('Top value: ', int(top))
    elif operation == 'show':
        curr_stack = a_stack.show()
        if curr_stack is None:
            print('Stack is empty.')
        else:
            print('Current state of stack: ', curr_stack)
    elif operation == 'quit':
        break

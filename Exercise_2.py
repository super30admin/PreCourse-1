class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Node:
      
    # Class to create nodes of linked list
    # constructor initializes node automatically
    def __init__(self,data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        self.head = None

    def push(self, data):
        if self.head is not None:
          nn = Node(data)
          nn.next = self.head
          self.head = nn
        else:
          self.head = None
          nn = Node(data)
          nn.next = self.head
          self.head = nn
        
    def pop(self):
      if self.head is not None:
        val = self.head.data
        self.head = self.head.next
        return val
        
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
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

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = Node('start')
        
    def push(self, data):
        curr = self.head
        while curr.next:
            curr = curr.next

        curr.next = Node(data)
        
    def pop(self):
        if not self.head.next:
            return 'Empty'

        curr = self.head.next
        prev = self.head

        while curr.next:
            curr = curr.next
            prev = prev.next

        prev.next = None

        
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

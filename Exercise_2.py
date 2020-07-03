class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = Node(0)
        self.end = self.head

    def push(self, data):
        self.end.next = Node(data)
        self.end = self.end.next

        
    def pop(self):
        if not self.head.next:
            return None

        curr = self.head
        while curr.next:
            if not curr.next.next:
                temp = curr.next.data
                curr.next = None
                self.end = curr
                return temp
            curr = curr.next

        
a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split(' ')
 
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
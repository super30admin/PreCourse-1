
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.start = None
    def push(self, data):
        node = Node(data)
        if self.start == None:
            self.start = node
        else:
            var = self.start
            while var.next != None:
                var = var.next
            var.next=node
    def pop(self):
        if self.start==None:
            return None
        elif self.start.next==None:
            d=self.start.data
            self.start=None
            return d
        else:
            var = self.start
            while var.next.next != None:
                var = var.next
            last=var.next
            var.next=None
            d=last.data
            last=None
            return d

        
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

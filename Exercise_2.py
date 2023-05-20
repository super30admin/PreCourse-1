
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.dummy = Node(None)
        self.head = self.dummy
        
    def push(self, data):
        nxt = Node(data)
        self.head.next = nxt
        self.head = self.head.next
        
    def pop(self):
        if self.dummy == self.head:
            raise Exception('Cannot pop from an empty Stack')
        curr = self.dummy
        popped = None
        while curr.next != None:
            if curr.next.next == None:
                popped = curr.next
                curr.next = None
                self.head = curr
                break
            curr = curr.next
        return popped.data
                    



        
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

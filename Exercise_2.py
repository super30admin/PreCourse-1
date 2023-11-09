# Time complexity
    # push = o(1) 
    # pop = o(1)
# Space complexity = o(n)

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None

    def push(self, data):
        if self.head:       #pushing in the front of linkedList
            nxt = Node(data)
            nxt.next = self.head
            self.head = nxt
        else:
            self.head = Node(data)    
    def pop(self):
        if self.head:
            pop = self.head
            self.head = self.head.next  #popping head and making the next one head
            pop.next = None             #removing the link
            return pop.data
        else:
            return None    
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


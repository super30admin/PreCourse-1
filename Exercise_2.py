class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.root = None
        self.iterator = None
    def push(self, data):
        if self.root == None:
            self.root = Node(data)
            self.iterator = self.root
            return True
        else:
            newNode = Node(data)
            self.iterator.next = newNode
            self.iterator = self.iterator.next
            return True
    def pop(self):
        if self.root == None:
            return None
        if self.iterator == self.root:
            value = self.iterator.data
            self.root = None
            self.iterator = None
            return value
        else:
            reach = self.root
            while reach.next != None and reach.next != self.iterator:
                reach = reach.next
            value = reach.next.data
            reach.next = None
            self.iterator = reach
            return value
        
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

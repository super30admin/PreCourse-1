class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head=None
    def push(self, data):
        if self.head==None:
            self.head=Node(data)
        else:
            new=Node(next)
            new.next=self.head
            self.head=new
    def pop(self):
        if self.head == None:
            return None
        else:
            pop=self.head
            self.head=pop.next
            print(pop.data)
            return pop.data

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

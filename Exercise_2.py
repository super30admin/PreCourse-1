class Node:
    def __init__(self, data=None, next=None):
       self.data = data
       self.next = next # next store previous nodes
 
class Stack:
    def __init__(self):
        self.head = Node(None,None)
        self.length=0

    def push(self, data):
        if self.head.data != None:
            self.head=Node(data,self.head)
        else:
            self.head.data = data
        self.length+=1

    def pop(self):
        return_value=self.head.data
        self.head=self.head.next
        return return_value

    def show(self):
        ptr=self.head
        while True:
            print(ptr.data)
            if ptr.next != None:
                ptr=ptr.next
            else:
                break

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
        a_stack.show()
        break

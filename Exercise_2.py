
class Node:
    def __init__(self, data,next):
       self.data = data
       self.next = next
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        node = Node(data,self.head)
        self.head =node
        
    def pop(self):
        if self.head is None:
            print("Stack Is Empty")
            return
        self.head = self.head.next
    def printLL(self):
        if self.head is None:
            print('Stack Is Empty')
            return
        itr = self.head
        llstr = ''
        while itr:
            llstr += str(itr.data) + '->'
            itr = itr.next
        print(llstr)
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('print')
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
    elif operation == 'print':
        a_stack.printLL()
    elif operation == 'quit':
        break

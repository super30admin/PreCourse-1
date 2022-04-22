
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None

    def push(self, data):
        if self.top is None:
            self.top = Node(data)
        else:
            a = Node(data)
            a.next = self.top
            self.top = a

    def pop(self):
        if self.top is None:
            print("LL is empty")
        else:
            temp = self.top.data
            self.top = self.top.next
            return temp



    
    def printll(self):
        if self.top is None:
            print("LL is empty")
        else:
            itr = self.top
            while itr:
                print(itr.data)
                itr = itr.next

        
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
    elif operation == 'print':
        a_stack.printll()

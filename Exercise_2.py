
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        self.cur = None

    def push(self, data):
        node = Node(data)
        if self.head == None:
            self.head = node
            self.cur = node
        else:
            self.cur.next = node
            self.cur = self.cur.next

    def pop(self):
        if self.head == None:
            return None
        
        temp = self.head
        while temp and temp.next and temp.next.next:
            temp = temp.next
        
        if temp.next == None:
            # head
            self.head = None
            self.cur = None
            return temp.data
        
        popped = temp.next.data
        temp.next = None
        self.cur = temp
        return popped

    def printStack(self):
        temp = self.head
        while temp:
            print(temp.data)
            temp = temp.next
        
        
        
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
        a_stack.printStack()
        break

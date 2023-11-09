class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
class myStack:
    def __init__(self):
        self.head = None
        self.size = 0
    def isEmpty(self):
        if self.head is None:
            return True
        else:
            return False     
    def push(self, data):
        if self.head == None:
            self.head = Node(data)
            self.size = 1
        else: 
            temp = self.head
            self.head = Node(data)
            self.head.next = temp
            self.size += 1    
    def pop(self):
        if self.isEmpty():
            return None	
        else:
            self.size -= 1
            poppednode = self.head
            self.head = self.head.next
            poppednode.next = None
            return poppednode.data 
    def peek(self):
        if self.isEmpty():
            return None	
        else:
            return self.head.data
    def show(self):
        if self.isEmpty():
            return None
        else:
            temp = self.head
            while temp != None:
                print(temp.data)
                temp = temp.next
    def size(self):
        return self.size
    
a_stack = myStack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('peek')
    print('isEmpty')
    print('show')
    print('quit')
    print('size')
    do = input("What would you like to do?").split()
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
    elif operation == 'peek':
        print(a_stack.peek())
    elif operation == 'show':
        print(a_stack.show())   
    elif operation == 'isempty':
        print(a_stack.isEmpty())
    elif operation == 'size':
        print(a_stack.size)
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        if self.head == None:
            self.head = Node(data)
        else:
            node = Node(data)
            node.next = self.head
            self.head = node
        
    def pop(self):
        res = self.head.data
        self.head = self.head.next
        return res
    
    def peek(self):
        if self.head:
            return self.head.data
    
    def isEmpty(self):
        if self.head:
            return False
        return True

    def size(self):
        count = 0
        ptr = self.head
        while ptr != None:
            count += 1
            ptr = ptr.next
        return count

    def show(self):
        ptr = self.head
        while ptr != None:
            print(ptr.data)
            ptr = ptr.next
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

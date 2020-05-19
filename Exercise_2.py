class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = Node(None)
        self.siz = 0

    def push(self, data):
        self.siz += 1
        toAdd = Node(data)
        toAdd.next = self.top
        self.top = toAdd
        
    def pop(self):
        self.siz -= 1
        toReturn = self.top
        self.top = self.top.next
        return toReturn.data

    def peek(self):
        return self.top.data

    def isEmpty(self):
        return self.size == 0

    def size(self):
        return self.siz

s = Stack()
for i in range(0, 10):
     s.push(i)
     print(s.size())

print(s.isEmpty())
print(s.pop())
print(s.peek())
print (s.pop())

        
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

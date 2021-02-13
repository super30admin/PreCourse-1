class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        self.size = 0

    def is_empty(self):
      return self.size == 0

    def __len__(self):
        return self.size

    def push(self, data):
        if self.head == None:
            self.head = Node(data)
            self.size +=1
        else:
            newnode = Node(data)
            newnode.next = self.head
            self.head = newnode
            self.size += 1
        
    def pop(self):
        if self.is_empty():
            return None
        else:
            poppednode = self.head
            self.head = self.head.next
            poppednode.next = None
            self.size -= 1
            return poppednode.data

a_stack = Stack()
while True:
    print('===============================')
    print('Operations :')
    print('push <value>')
    print('pop')
    print('quit')
    print('===============================')
    print("Current Length is : " + str(a_stack.__len__()))
    print('===============================')
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

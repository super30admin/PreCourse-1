
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        newNode = Node(data)
        if self.head:
            cur = self.head
            while cur.next!= None:
                cur = cur.next
            cur.next = newNode
        else:
            self.head = newNode
        
    def pop(self):
        temp = self.head
        #head node case check

        while(temp.next!=None):
            prev = temp
            temp = temp.next

        prev.next = None
        temp = None
    def print(self):
        current = self.head
        while(current):
            print(current.data)
            current = current.next
        
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
        a_stack.print()
        break

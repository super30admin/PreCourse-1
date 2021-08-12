
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = Node(None)
        
    def push(self, data):
        insertNode = Node(data)
        tempNode = self.head
        while tempNode.next != None:
            tempNode = tempNode.next
        tempNode.next = insertNode

        
    def pop(self):
        if self.head.data == None:
            return None

        else:
            tempNode = self.head

            while tempNode.next.next != None:
                tempNode = tempNode.next
            tempNode.next = None

        
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

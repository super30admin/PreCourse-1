""" 
Stack - FILO

Two approaches - 
1. push/pop and add/remove first from list
2. add/remove from last of the list will require additional O(n) 
time to iterate the list before performing the operation.

Time -
Push - O(1)
Pop - O(1)
"""
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
class Stack:
    def __init__(self):
        self.top = None
        self.size = 0

    def addFirst(self, data):
        # 3 [top], push(data = 2)
        # 3 <- 2 [top]
        newNode = Node(data)
        newNode.next = self.top
        self.top = newNode
        self.size += 1
        
    def removeFirst(self):
        # 3 <- 2 [top], pop
        # 3 [top]
        node = self.top
        self.top = node.next
        node.next = None
        self.size -= 1
        return node.data

    def push(self, data):
        self.addFirst(data)
        print('Pushed: ', data)
        
    def pop(self):
        if self.size is not 0:
            data = self.removeFirst()
            return data
        else:
            return None
    
    def show(self):
        stack = ""
        curr = self.top
        while curr != None:
            data = curr.data
            stack += str(data) + " "
            curr = curr.next
        print('Stack: ', stack)
            

a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('show')
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
    elif operation == 'show': 
        a_stack.show()

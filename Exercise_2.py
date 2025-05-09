"""
T.C. = push is O(1). Pop is O(n)
S.C. = O(n)
"""

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.size = 0
        self.head = Node(-1)
        self.headRef = self.head
        
    def push(self, data):
        self.head.next = Node(data)
        self.head = self.head.next
        self.size += 1
        
    def pop(self):
        tempHead = self.headRef
        prePopNode = None
        print(tempHead.data, self.head.data)
        while tempHead.next:
            prePopNode = tempHead
            tempHead = tempHead.next
        if prePopNode:
            self.head = prePopNode
            prePopNode.next = None
            self.size -= 1
        else:
            return None
        return tempHead.data
        
        
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

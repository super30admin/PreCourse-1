"""Space Complexity : O(N)"""
"""Time Complexity : O(1)"""
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        
    def push(self, data):
        stackNode = Node(data)
        if self.top == None:
            self.top = stackNode  
        else: 
            tempTop = self.top
            stackNode.next = tempTop
            self.top = stackNode 
            
    def pop(self):
        if self.top is None:
            return None
        tempTopData = self.top.data
        self.top = self.top.next
        return tempTopData
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

# Time Complexity : O(1) for all operations.
# Space Complexity : O(n) where n is the length of the stack. O(1) for all methods. 
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NA

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        newNode = Node(data)
        if self.head == None:
            self.head = newNode
            return
        newNode.next = self.head
        self.head = newNode
        
    def pop(self):
        if self.head == None:
            return None
        node = self.head
        self.head = self.head.next
        return node.data
        
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

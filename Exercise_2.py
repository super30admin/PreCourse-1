# Time Complexity : all O(1) 
# Space Complexity : all O(1) data structire itself O(n)
# Did this code successfully run on Leetcode : na
# Any problem you faced while coding this : na

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        self.head = None

        
    def push(self, data):
        newNode = Node(data)
        if not self.head:
            self.head=newNode
            self.head.next= None
        else:
            newNode.next=self.head
            self.head = newNode

        
    def pop(self):
        if not self.head:
            print("Stack Underflow")
            return 0
        newHead = self.head.next
        self.head.next = None
        retVal = self.head.data
        self.head = newHead
        return retVal
        
        





        
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

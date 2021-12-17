# Time Complexity : 
# For Push: O(1) and For Pop: O(N)

# Space Complexity : 
# O(N) worst case space complexity.

# Did this code successfully run on Leetcode : NA

# Any problem you faced while coding this : No

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        self.stackTop = None

        
    def push(self, data):
        newNode = Node(data)

        if self.head == None:
            self.head = newNode
            self.stackTop = self.head
            return

        self.stackTop.next = newNode
        self.stackTop = newNode

        
    def pop(self):
        if self.head == None:
            return None

        if self.head.next == None:
            ret = self.head.data
            self.head = None
            return ret
        
        curr = self.head
        while curr.next.next != None:
            curr = curr.next
        ret = curr.next.data
        curr.next = None
        return ret
        

        
        
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

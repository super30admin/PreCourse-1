# Time Complexity: O(1) as we're only moving a pointer
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: I did not find this exact question on Leetcode
# Any problem you faced while coding this: No

class Node:
    def __init__(self, data=None):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = Node()
        
    def push(self, data):
        if self.head is None:
            self.head = data
        else:
            newnode = Node(data)
            newnode.next = self.head
            self.head = newnode

        
    def pop(self):
        temp = self.head
        self.head = self.head.next
        temp.next = None
        return temp.data
        
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

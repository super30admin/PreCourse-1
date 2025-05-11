# Time Complexity :
# push - O(1)
# pop - O(1)

# Space Complexity : O(n)

# Did this code successfully run on Leetcode : Did not find corresponding problem on LeetCode
# 
# Any problem you faced while coding this :
# No instructions for handling empty stack for peel operation, chose to return -1

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
        
    def push(self, data):
        self.head = Node(data)
        
    def pop(self):
        if self.is_empty:
            print("stack underflow")
        item = self.head.data
        self.head = self.head.next
        return item
        
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

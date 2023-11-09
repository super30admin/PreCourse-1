"""
Problem: Implement Stack Using LinkedList

Time Complexity:
    * __init__  : O(1)
    * push      : O(1)
    * pop       : O(1)

Space Complexity:
    * __init__  : O(1)
    * push      : O(1)
    * pop       : O(1)

Pass on LeetCode: N/A
Problems Occurred: N/A
"""


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = Node(None)
        
    def push(self, data):
        node = Node(data)
        node.next = self.head 
        self.head = node 

        
    def pop(self):
        data = self.head.data
        if self.head.next:
            self.head = self.head.next
        return data

        
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

# Time Complexity : O(1)
# Space Complexity : O(N) : number of elements
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
"""
1. initializing stack with head
2. push : assign new node to head and move previous head to next of new head
3. pop : return data of head and assign head.next to head

"""


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.head = None

    def push(self, data):
        if self.head:
            node = Node(data)
            node.next = self.head
            self.head = node
        else:
            self.head = Node(data)

    def pop(self):
        if self.head:
            node = self.head
            self.head = node.next
            return node.data
        else:
            return None


a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
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

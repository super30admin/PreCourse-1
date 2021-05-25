# Author: Ritika Chadha
# Exercise_2: Implement Stack using Linked List

# Time Complexity: O(1)
# Space Complexity: O(n)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: Yes, I considered the head as the original head of the list. On reading more about stack, I later changed the head to be the top of the linked list.

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        if self.head is None:
            self.head = Node(data)

        else:
            tempNode = Node(data)
            tempNode.next = self.head
            self.head = tempNode
        
    def pop(self):
        if self.head is None:
            return None
        
        else:
            tempNode = self.head
            self.head = self.head.next
            tempNode.next = None
            return tempNode.data

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

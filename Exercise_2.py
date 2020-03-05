"""
// Time Complexity : O(1) to add and delete nodes at the head of the linkedlist
// Space Complexity : O(n) to store the nodes in the linkedlist
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : None
// Your code here along with comments explaining your approach

Algorithm explanation
- Initialize the linked list with dummy node.
- In case of push operation, add the newnode with data at the head of the linked list
- In case of pop operation, we check for two cases
    - If the head is pointing to dummy node - return -1
    - Else fetch the head element and delete the node at the head of the list
        - return the element
"""


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None

class Stack:
    def __init__(self):
        self.head = Node(float("inf"))
        self.size = 0
        
    def push(self, data):
        newnode = Node(data)
        newnode.next = self.head
        self.head = newnode

    def pop(self):
        if self.head and self.head.data !=float("inf"):
            ele = self.head.data
            self.head = self.head.next
        else:
            ele = -1
        return ele

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

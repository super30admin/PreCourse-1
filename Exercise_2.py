# Time Complexity: O(1)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Not in Leetcode, Executed in PyCharm
# Any problem you faced while coding this: Figuring out .prev
#Implement Stack using Linked List:
class Node:
    def __init__(self, data):
       self.data = data
       self.prev = None
 
class Stack:
    def __init__(self):
        self.head = None #There are no nodes when the list is first initialized
        
    def push(self, data):
        if self.head == None:
            self.head = Node(data)
        else:
            new_node = Node(data)
            new_node.prev = self.head
            self.head = new_node #add data to the stack

    def pop(self):
        if self.head == None:
            return None
        else:
            popped_node = self.head
            self.head = self.head.prev
            return popped_node.data

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

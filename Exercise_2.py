"""
Time Complexity: O(n)
Space Complexity: O(n)
Did this code successfully run on Leetcode: Yes
Any problem you faced while coding this: No

Your code here along with comments explaining your approach:

used top as a pointer incrementing it while pushing and 
while popping checking if stack is empty or not
if its not empty getting the top element
and then decrementing top pointer one

1. push():
  1. creating a new node with the given data
  2. pointing the new node to the current top
  3. updating the top to the new node

2. pop():
  1. checking if the stack is empty
  2. if not empty, getting the top element
  3. updating top to the next node

"""
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
         self.top = None
    def push(self, data):
        new_node = Node(data)
        new_node.next = self.top
        self.top = new_node
    def pop(self):
        if self.top is None:
            return None
        popped_node = self.top
        self.top = self.top.next
        return popped_node.data
        
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

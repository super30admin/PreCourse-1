# Time Complexity : N/A
# Space Complexity : N/A
# Did this code successfully run on Leetcode : No
# Any problem you faced while coding this : EOF error. Not taking any input.


# Your code here along with comments explaining your approach
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
        if self.is_empty():
            raise IndexError("Stack is empty")
        popped_data = self.top.data
        self.top = self.top.next
        return popped_data
        
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

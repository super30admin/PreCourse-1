# Time Complexity --> O(1) for both pushing a value and popping value
# Space Complexity --> O(1) for both pushing a value and popping value
# Code ran with driver code below
# No issues coming up with this solution

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:

    # declare a 'top' pointer which will point to the last element in the stack.
    def __init__(self):
        self.top = None
        
    # Condition 1: Check if top node exists -- if not we are pushing into an empty stack
    # Condition 2: If top is NOT None, then push value to the top
    def push(self, data):
        if self.top:
            new_data = Node(data)
            new_data.next = self.top
            self.top = new_data
        else:
            self.top = Node(data)
        
    
    # Condition 1: If top node does not exists, then popping from empty stack is not possible
    # Condition 2: Otherwise pop value pointed by 'top' and assign top to the next node in stack
    def pop(self):

        if self.top is None:
            print("Cannot pop from an empty stack")
            return False
        
        else:
            node_to_pop = self.top.data
            self.top = self.top.next
            return node_to_pop


        
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


# s = Stack()
# s.top = Node(3)
# print(s.push(4))
# print(s.push(5))
# print(s.pop())
# print(s.top.data)
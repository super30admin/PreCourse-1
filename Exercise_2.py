
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None

class Stack:
    # Time Complexity : O(1)
    # Space Complexity : O(1)
    # Did this code successfully run on Leetcode : N/A
    # Any problem you faced while coding this : No
    # Initialize the stack with None
    def __init__(self):
        self.head = None

    # Time Complexity : O(1)
    # Space Complexity : O(1)
    # Did this code successfully run on Leetcode : N/A
    # Any problem you faced while coding this : No
    # Create a node and add it to the start of the list
    def push(self, data):
        toAdd = Node(data)
        if self.head == None:
            self.head = toAdd
        else:
            toAdd.next = self.head
            self.head = toAdd

    # Time Complexity : O(1)
    # Space Complexity : O(1)
    # Did this code successfully run on Leetcode : N/A
    # Any problem you faced while coding this : No
    # Pop the top and make the next item the top
    def pop(self):
        if self.head == None:
            print("Stack is Empty!")
            return None
        else:
            toRet = self.head
            self.head = self.head.next
            toRet.next = None
            return toRet.data

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

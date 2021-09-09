# // Time Complexity : O(1)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        # Intializing head of the stack
        self.head = None

    def push(self, data):
        # Insert the data in such a way that head points to latest
        # inserted element
        if self.head == None:
            self.head = Node(data)
        else:
            temp = Node(data)
            temp.next = self.head
            self.head = temp

    def pop(self):
        # Popping the element and setting a head to "next"
        if self.head == None:
            return None
        else:
            popped = self.head
            self.head = self.head.next
            popped.next = None
        return popped.data

    def print(self):
        temp = self.head
        while temp is not None:
            print(temp.data)
            temp = temp.next


a_stack = Stack()
while True:
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
        a_stack.print()
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
            a_stack.print()
    elif operation == 'quit':
        break

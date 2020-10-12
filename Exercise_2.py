# Time Complexity: O(1)
# Space Complexity: O(n) where n is the number of elements inserted
# Did this code successfully run on Leetcode: I don't think this exact question is on Leetcode.
#                                             Please let me know in case it is on Leetcode
# Any problem you faced while coding this: No
# Your code here along with comments explaining your approach
# I created a node called head. This pointer would be updated each time a new wlwmnt is added.
# When i pop, i fetch the head node, change head to head.next and return the fetched node


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.head = None

    def push(self, data):
        if not self.head:
            self.head = Node(data)
        else:
            new = Node(data)
            new.next = self.head
            self.head = new

    def pop(self):
        if not self.head:
            return None
        topop = self.head
        self.head = self.head.next
        topop.next = None
        return topop.data


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

# Time Complexity : O(1)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : n/a
# Any problem you faced while coding this : n/a


# Your code here along with comments explaining your approach
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        self.root = Node(None)

    def push(self, data):
        node = Node(data)
        node.next = self.root
        self.root = node
        print("Pushed " + str(data) + " to stack")

    def pop(self):
        if self.root.data is None:
            return None
        popped = self.root.data
        self.root = self.root.next
        return popped


a_stack = Stack()
print('push <value>')
print('pop')
print('quit')
while True:
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    do = input('What would you like to do? ').split()
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
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
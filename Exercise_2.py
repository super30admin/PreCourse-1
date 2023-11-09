"""
- Space complexity is O(n) as I'm using a linked list to add and remove the
elements where n is the number of elements
- Time complexity to push the element is O(1) as we're just adding
the element at the beginning
- Time complexity to pop the element is O(1) as well as we're removing
 the element from the beginning
"""

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None

    def push(self, data):
        # Insertion at the beginning
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
        else:
            new_node.next = self.head
            self.head = new_node

    def pop(self):
        # Deletion from the beginning
        if self.head is None:
            return None
        else:
            curr = self.head
            self.head = curr.next
            return curr.data
        
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

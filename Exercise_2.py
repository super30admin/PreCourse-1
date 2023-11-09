# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Stumbled with push for a bit, but could find my way eventually

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        new_node = Node(data)
        if self.head:
            node = self.head
            while node.next is not None:
                node = node.next
            node.next = new_node
        else:
            self.head = new_node

    def pop(self):
        node = self.head
        if node is None:
            return None  # If stack is empty
        elif node.next is None:
            val = node.data
            self.head = None
            return val
        else:
            while node.next.next is not None:
                node = node.next
            val = node.next.data
            node.next = None
            return val

        
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

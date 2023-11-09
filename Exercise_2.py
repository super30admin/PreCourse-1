# Time Complexity: O(1)
# Space Complexity: O(n)

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None

    def push(self, data):
        if self.top == None:
            self.top = Node(data)
        else:
            next_node = Node(data)
            next_node.next = self.top
            self.top = next_node

    def pop(self):
        if self.top == None:
            return None
        else:
            old_node = self.top
            self.top = self.top.next
            old_node.next = None

        return old_node.data

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

# Approach:
# Create a linked list for the stack and the first element i.e. head of the linked list
# is used as the top element in the stack. When pop is performed the head to list is changed to the second element in linkedlist
# and when push is performed the new element is made the head of the linked list and the next elements
# is the previous head of the linked list.

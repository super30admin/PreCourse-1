# Time Complexity : O(1)
# Space Complexity :O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        # create head and initialise it to None
        self.head = None

    def push(self, data):
        
        if self.head is None:
            # if head is none, create a node with the value pushed and assign the node to head
            self.head = Node(data)
        else:
            # create a node with the value pushed, add the head as the next node to the new node created
            new_node = Node(data)
            new_node.next = self.head
            # Now move the head to the new node
            self.head=new_node

    def pop(self):
        if self.head is not None:
            # check if linked list is not empty and return the data at the head node
            value_to_return = self.head.data
            # assign the next node of head as the head node
            self.head = self.head.next
            return value_to_return


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
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break
# // Time Complexity : O(1)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode :
# // Any problem you faced while coding this : Yes, I thought in we push a new element at the end of the linked list instead of adding it at the head.
# // Your code here along with comments explaining your approach


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.stack = None

    def push(self, data):
        """
        Create a linked list and adds at the head of the list
        Takes O(1) time.
        """
        if self.stack is None:
            self.stack = Node(data)
        else:
            new_node = Node(data)
            new_node.next = self.stack
            self.stack = new_node
        self.printStack()

    # Display stack for checking if the functions are able to push and pop the elements.
    def printStack(self):
        """
        Takes O(n) time.
        """
        current = self.stack
        while(current != None):
            print(current.data)
            current = current.next

    def pop(self):
        """
        Pops the element at the head node
        Takes O(1) time.
        """
        if self.stack is None:
            return None
        else:
            poppedNode = self.stack.data
            self.stack = self.stack.next
            return poppedNode


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

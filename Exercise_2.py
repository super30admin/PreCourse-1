## Implement Stack using Linked List.

# Stack is a linear and abstract data type that follows the principle of Last in First out
# Operations: Push, Pop and isEmpty
# Time complexity for all the operations :
            # To Insert at current location: O(1)
            # To Delete at Current location : O(1)
            # To Insert at the end : O(n)
            # To Delete at the end : O(n)
# Space complexity : O(n)

# Did this code successfully run on Leetcode : Unable to point question on leetcode. Ran locally and code looks fine

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        if self.head == None:
            self.head = Node(data)
        else:
            newnode = Node(data)
            newnode.next = self.head
            self.head = newnode

    def isEmpty(self):
        if self.head is None:
            return True
        else:
            return False

    def pop(self):
        if self.isEmpty():
            return None
        else:
            popnode = self.head
            self.head = self.head.next
            popnode.next = None
            return popnode.data

        
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

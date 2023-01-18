# Note: Time and space complexity provided in the comment
# section of each stack function implemented

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:

    # initializes the head of linked list
    # Time Complexity - O(1)
    # Space complexity - O(1)
    def __init__(self):
        self.head = None

    # check if head of linked list exists or not. If empty then create new Node
    # object and assign it to head of linked list. If not empty then traverse
    # linked list till the end and append a new Node of data at the end.
    # Time Complexity - O(n)
    # Space complexity - O(n)
    def push(self, data):
        if not self.head:
            self.head = Node(data)
            return

        cur = self.head
        while cur.next:
            cur = cur.next
        cur.next = Node(data)


    # check if head of linked list exists or not. If empty then return None. If only 1 element
    # exists in linked list then assign head to None and return. If more than 1 elements exist
    # then traverse linked list till last but one element and point its next pointer to None.
    # Time Complexity - O(n)
    # Space complexity - O(n)
    def pop(self):
        if not self.head:
            return None

        if not self.head.next:
            temp = self.head.data
            self.head = None
            return temp

        prev = None
        cur = self.head
        while cur.next:
            prev = cur
            cur = cur.next
        prev.next = None
        return cur.data


a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')

    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
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

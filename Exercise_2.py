"""
LeetCode: NA
TC/SC: see below
Challenge: Setting pivots for operations
"""
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None

    # TC - O(N), SC - O(1)
    def push(self, data):
        # when no head found
        if self.head is None:
            self.head = Node(data)
        else:
            #  find the last node and append a new node to it
            curr = self.head
            while curr.next:
                curr = curr.next
            newNode = Node(data)
            curr.next = newNode

    # TC - O(N), SC - O(1)
    def pop(self):
        #  return none if the stack is empty. Main will take care of it
        if self.head is None:
            return self.head

        #  If only one node in the list, return the node and reset LL
        elif self.head and self.head.next is None:
            poppedElement = self.head.data
            self.head = None
            return poppedElement

        # More than two elements in linked list stack - use prev and current node pivots to perform logic -
        # returning last node nad deleting from the list
        else:
            prev, curr = None, self.head

            # curr should be the last node and prev should be second last
            while curr.next:
                prev = curr
                curr = curr.next

            if prev:
                prev.next = None

            return curr.data

#   print LL
    def show(self):
        res = []
        curr = self.head

        while curr:
            res.append(curr.data)
            curr = curr.next

        print(res)


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
        # a_stack.show()
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
        # a_stack.show()
    elif operation == 'quit':
        break
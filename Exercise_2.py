## Exercise_2 : Implement Stack using Linked List.
# Time Complexity : O(1) for all functions
# Space Complexity : O(n) where n is length of linked list.
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NA

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        

    def push(self, data):
        if self.head is empty:
            n = Node(data)
            self.head = n
            self.temp = self.head
        n = Node(data)
        self.head = n

    def pop(self):
        if self.head is None:
            return None
        poppedData = self.head.data
        self.head = self.temp.next
        return poppedData
        

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

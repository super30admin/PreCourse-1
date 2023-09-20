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
        self.prev = None
        
    def push(self, data):

        # if list is empty
        # head point to new node
        if self.head is None:
            n = Node(data)
            self.head = n
        
        # create new node and append it
        # head always point to last node
        # prev pointing to a node before head
        else:
            n = Node(data)
            self.head.next = n
            self.prev = self.head
            self.head = self.head.next

    def pop(self):

        # check if list is empty, return None
        if self.head is None:
            return None
        
        # get the data from last node
        poppedData = self.head.data

        # if there is one and only node and its popped, head point back to None
        # else, head again point to last node held in prev
        self.head = self.prev
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

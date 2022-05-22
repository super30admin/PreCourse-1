# Time Complexity : o(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None # initializing head of the LinkedList


    def push(self, data):

        if self.head is None: 
            self.head = Node(data) # if LinkedList is empty then adding node as head
        else:
            new_node = Node(data) 
            new_node.next = self.head # adding new node at thr beginning of the linkedlist
            self.head = new_node
 

    def pop(self):
        if self.head is None:
            return "Already empty"
        else:
            popped = self.head.data
            self.head = self.head.next
            return popped
 
        
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




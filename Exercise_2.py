# Submitted by : Aryan Singh_RN12MAY2023 
# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Not applicable
# Any problem you faced while coding this : No

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        new_node = Node(data)
        if self.head == None:
            self.head = new_node
        else:
            pointer = self.head
            while(pointer.next != None):
                pointer = pointer.next
            pointer.next = new_node
                
        
    def pop(self):
        if self.head == None:
            value = None
        elif self.head.next == None :
            value = self.head.data
            self.head = None
        else:
            pointer = self.head
            while(pointer.next.next != None):
                pointer = pointer.next
            value = pointer.next.data
            pointer.next = None
        return value
        
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

# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : struggled with Linked List as I do not have good hands on Linked List, iteration is fine, but deletion, insertion gets
# tricky for me sometimes



class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        self.head = None
        
    def push(self, data):
        if self.head is None:
          self.head = Node(data)
        else:
          temp = Node(data)
          temp.next = self.head
          self.head = temp

        
    def pop(self):
        if self.head is None:
          return None
        else:
          popped = self.head
          self.head = self.head.next
          popped.next = None
          return popped.data

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

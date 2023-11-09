#Time Complexity : O(1)
#Space Complexity : O(N)
#Did this code successfully run on Leetcode : Not found
#Any problem you faced while coding this : Comparatively straight to get through.


#Your code here along with comments explaining your approach

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
            next_node = Node(data)
            next_node.next = self.head
            self.head = next_node
    def pop(self):
        if self.head is None:
            return None
        else:
            pop_node = self.head.data
            self.head = self.head.next
            return pop_node
        
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

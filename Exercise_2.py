  # // Time Complexity : O(1) 
  # // Space Complexity : O(n) where n is the number of nodes added in the linked list
  # // Did this code successfully run on Leetcode : Couldn't find it on leetcode. Any link?
  # // Any problem you faced while coding this : nothing


  # // Your code here along with comments explaining your approach


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 

class Stack:
    def __init__(self):
        self.front = Node(0)
        self.size = 0

    def push(self, data):
        node = Node(data)
        node.next = self.front
        self.front = node
        self.size += 1


    def pop(self):
        if self.size:
            top = self.front.data
            self.front = self.front.next
            self.size -= 1
            return top
        return 0

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

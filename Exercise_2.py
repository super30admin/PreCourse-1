# Time Complexity :
#   push: O(1)
#   pop: O(1)
# Space Complexity : O(n) where n is the number of elements in the stack
# Did this code successfully run on Leetcode : Not available at LeetCode
# Any problem you faced while coding this : No
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
    def push(self, data):
        new_Node = Node(data)
        new_Node.next = self.top
        self.top = new_Node
    def pop(self):
        if self.top is None:
            return None
        popped_Node = self.top
        self.top = self.top.next
        return popped_Node.data
        
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

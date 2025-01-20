# Implement Stack using Linked List.
# Time Complexity : O(n) for all operations
# Space Complexity : O(n) since we're using a list
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :


# Your code here along with comments explaining your approach
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head= None
        
    def push(self, data):
        tmp = self.head
        while tmp.next != None:
            tmp = tmp.next
        tmp.next = Node(data)

    def pop(self):
        tmp = self.head
        if tmp is None:
            return None
        while tmp.next.next != None:
            tmp = tmp.next
        popped = tmp.next.data
        tmp.next = None
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

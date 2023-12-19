""" 
// Time Complexity : O(1)
// Space Complexity : Worst case O(n), Best case O(1)
// Did this code successfully run on Leetcode : Didn't try, runs on machine
// Any problem you faced while coding this : Remembering class concepts while doing it.


// Your code here along with comments explaining your approach
Most of the functions are straight forward. Followed same approach as exercise_1.py
"""
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.items = []
        
    def push(self, data):
        self.items.append(data)
        
    def pop(self):
        if not (len(self.items) == 0):
            return self.items.pop()
        else:
            print("Can not remove from empty list")
        
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

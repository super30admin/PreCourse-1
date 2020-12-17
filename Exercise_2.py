'''
Time Complexity :
init(): O(1)
push(): O(1)
pop(): O(1)

Space Complexity :
init(): O(1)
push(): O(1)
pop(): O(1)

Did this code successfully run on Leetcode :
Didnt run since the identifiers used had different names and I was running late to individually rename all.

Any problem you faced while coding this :
Yes, tried implementing the stack without adding the variable "prev" in the Node class but was not successful.
'''

#Your code here along with comments explaining your approach
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None


class Stack:
    def __init__(self):
        self.top = None

    def push(self, data):
        if self.top is None:
            self.top = Node(data)
        else:
            new_node = Node(data)
            new_node.prev = self.top
            self.top.next = new_node
            self.top = self.top.next


    def pop(self):
        if self.top is not None:
            if self.top.prev is None:
                temp = self.top.data
                self.top = None
                return temp
            else:
                temp = self.top.data
                self.top.prev.next = None
                self.top = self.top.prev
                return temp
        else:
            return -1






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

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



class Stack:
    def __init__(self):
        self.stack_head = None # self-note: this is the head of the stack, not the head of the linked list.

    def push(self, data):
        if self.stack_head is None:
            self.stack_head = Node(data)
        else:
            new_node = Node(data)
            new_node.next = self.stack_head
            self.stack_head = new_node





    def pop(self):
        if self.stack_head is not None:
            popped_elem = self.stack_head
            self.stack_head = self.stack_head.next
            return popped_elem.data

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

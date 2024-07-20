# Time Complexity : O(n) , push takes O(1),  pop takes O(n) as we need to traverse to the last node 
# Space Complexity : O(n) n - no of elements pushed
# Any problem you faced while coding this :
"""Initially Implemented append and removal from the end and thenc changed to addition and removal from head of the list"""

# Your code here along with comments explaining your approach
"""Push - Adding the new node to the head of the linked list to obtain O(1) time complexity..assigning node to head if
list if empty or otherwise"""
"""Pop - Removing the node from the hed of the list list, dropping the first node by using cur pointer and moving head to cur.next"""
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.stack = self.cur = None
        
    def push(self, data):
        node = Node(data)
        # adding at the beginning O(1)
        if self.stack:
            node.next = self.stack
        self.stack = node

        # adding at the end
        # if self.stack:
        #     self.cur.next = node
        # else:
        #     self.stack = node
        #     self.cur = node
        
    def pop(self):
        if self.stack:
            # pop from head
            data = self.stack.data
            cur = self.stack
            self.stack = self.stack.next
            cur.next = None
            return data

            # pop from end
            # prev = self.stack
            # while prev.next != self.cur:
            #     prev = prev.next
            # data = self.cur.data
            # self.cur = prev
            # self.cur.next = None
            # return data
        return 
        
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

# Time Complexity : PUSH O(1), POP O(1)
# Space Complexity : O (1)
# Did this code successfully run on Leetcode : No
# Any problem you faced while coding this : yes
# Yes the Push operation does not work as per the expectation
# Please help with this code unable to debugthe issue here
# Your code here along with comments explaining your approach

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    def __init__(self):
        self.head = None

    # Stack push operation
    # For a linked list the new node
    # becomes the head
     
    def push(self, data):
        if not self.head:
            self.head = Node(data)
        else:
            temp_node = Node(data)
            temp_node.next = self.head
            self.head = temp_node

    # Stack pop opertion 
    # Remove the head
    def pop(self):

        if not self.head:
            return None
        else:
            popped_node = self.head
            self.head = self.head.next
            popped_node.next = None
            return popped_node.data

a_stack = Stack()
while True:
        print("push")
        print("pop")
        print("quit")
        do = input('What would you like to do?').split()
        operation = do[0].strip().lower()
        if operation == 'push':
            a_stack.push(int(do[1]))
        elif operation == 'pop':
            popped = a_stack.pop()
            if popped == None:
                print('Stack is empty!')
            else:
                print('Popped Value: %d', popped)
        elif operation == 'quit':
            break


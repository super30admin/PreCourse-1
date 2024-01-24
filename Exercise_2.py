# Time Complexity : O(1)
# Space Complexity : O(n)
"""
push, pop have a time complexity of O(1)
space complexity should be O(n)
"""

# Did this code successfully run on Leetcode :
# Any problem you faced while coding this : none


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.top = None

    def push(self, data):
        new_node = Node(data)
        new_node.next = self.top
        self.top = new_node

    def pop(self):
        if self.top == None:
            return None
        else:
            node_popped = self.top
            self.top = self.top.next
            node_popped.next = None
            return node_popped.data


a_stack = Stack()
while True:
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print("push <value>")
    print("pop")
    print("quit")
    do = input("What would you like to do? ").split()
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    if operation == "push":
        a_stack.push(int(do[1]))
    elif operation == "pop":
        popped = a_stack.pop()
        if popped is None:
            print("Stack is empty.")
        else:
            print("Popped value: ", int(popped))
    elif operation == "quit":
        break

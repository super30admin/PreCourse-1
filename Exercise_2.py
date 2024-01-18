# Time Complexity : all operations O(1)
# Space Complexity : O(n) where n is the maximum size of the list at any point
# Did this code successfully run on Leetcode : Not available on leetcode
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.head = None

    def push(self, data):
        newNode = Node(data)
        # if head already exists
        if self.head:
            newNode.next = self.head
        self.head = newNode

    def pop(self):
        # nothing to pop; head == None
        if not self.head:
            return
        poppedValue = self.head.data
        self.head = self.head.next
        return poppedValue


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

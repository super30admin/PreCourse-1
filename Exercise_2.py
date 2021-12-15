# Time Complexity:
#   * push: O(1) - assign the item to the head of the list
#   * pop: O(1) - pop the head of the list
# Space Complexity: O(n) - for n nodes in the stack
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No


class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.head = None

    def push(self, data):
        # create new node with data and replace the head of the list with it
        newhead = Node(data)
        newhead.next = self.head
        self.head = newhead

    def pop(self):
        # if head is not set, there are no items, so return none
        if not self.head:
            return None
        # otherwise, return the head's data and remove it by assigning
        # the next item to the head
        r = self.head.data
        self.head = self.head.next
        return r


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

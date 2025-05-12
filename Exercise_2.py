# Time Complexity:
# push - I think O(1) because we just add to the top
# pop - also O(1) cause we just remove the top node


# Space Complexity:
# O(n) because for each new element we add a node


# Any problem you faced while coding this :
# I forgot to update the top after popping.
# Also got confused between top and current in the beginning.
# Wasn’t sure what to return when popping from an empty stack. I just returned None.



class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self.top = None  # top of stack is the head of the linked list
        print("Stack created!")

    def push(self, data):
        print(f"Trying to push: {data}")
        new_node = Node(data)
        new_node.next = self.top
        self.top = new_node
        print(f"Pushed {data} on stack.")

    def pop(self):
        if self.top is None:
            print("Stack is empty! Nothing to pop.")
            return None
        popped_data = self.top.data
        print(f"Popping: {popped_data}")
        self.top = self.top.next
        return popped_data


a_stack = Stack()

while True:
    print("\npush <value>")
    print("pop")
    print("quit")

    try:
        do = input("What would you like to do? ").split()
    except EOFError:
        print("Input error. Try using string input like: push 10")
        break

    if len(do) == 0:
        continue

    operation = do[0].strip().lower()

    if operation == 'push':
        if len(do) < 2:
            print("Oops! No value provided to push.")
            continue
        try:
            value = int(do[1])
            a_stack.push(value)
        except ValueError:
            print("Please enter a number like: push 5")
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print("Stack is empty.")
        else:
            print("Popped value:", popped)
    elif operation == 'quit':
        print("Quitting the program.")
        break
    else:
        print("Invalid command. Please type push, pop, or quit.")

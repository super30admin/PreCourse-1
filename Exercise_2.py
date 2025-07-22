# Time Complexity : 
#   push() → O(1)  
#   pop()  → O(1)  
#   isEmpty() → O(1)  


# Space Complexity : O(n), where n is the number of elements in the stack (each stored as a node in the linked list)

# Did this code successfully run on Leetcode : N/a

# Any problem you faced while coding this :
# Initially forgot to define isEmpty(), which caused an AttributeError.

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
        if self.isEmpty():
            return "Stack is empty"
        popped_data = self.top.data
        self.top = self.top.next
        return popped_data

a_stack = Stack()
while True:
    print('\nOptions:')
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    if len(do) == 0:
        continue
    operation = do[0].strip().lower()
    if operation == 'push':
        if len(do) < 2:
            print("Please provide a value to push.")
            continue
        a_stack.push(int(do[1]))
        print(f"Pushed {do[1]}")    
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', popped)
    elif operation == 'quit':
        print("Exting.....")
        break
    else:
        print("Invalid operation. ")

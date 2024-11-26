# Time Complexity : 
# All the methods defined in below have time complexity O(1) except show method, show method prints the stack so it has time complexity of O(n) where n being the number of elements in the stack
# Space Complexity :
# Space complexiy for all the methods is O(1) since its constant like length, pop or peek will return just one single element. However for the show method it would be O(n) were n being the number of elements in the stack.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : I had to revise concepts on linked list.

class Node:
    
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        # stack is node, like linked list so initially it would be empty
        self.top = None # Basically I am initilizaling a node named top which is None.
        # top is just a variable
        
    def push(self, data):
        # inserting data
        # create new node
        new_node = Node(data)
        new_node.next = self.top # linking new node to top, so its basically (0)newNode --> top
        # make the new node as top
        self.top = new_node
        
    def pop(self):
       # first check if stack is empty
       if self.top is None:
         # stack is empty 
         raise Exception("pop can not be done on empty stack")
       else:
        pop_data = self.top.data
        # unlink that top mode
        # plus one the pointer of stack
        self.top = self.top.next
    
    def show(self):
       # Traverse the stack and collect all values into a list
        elements = []
        current = self.top
        while current is not None:
            elements.append(current.data)
            current = current.next
        return elements
        
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
    elif operation == 'show':
        print(a_stack.show())
    elif operation == 'quit':
        break

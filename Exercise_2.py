"""
Time Complexity
isEmpty(): O(1)
push(): O(1)
pop(): O(1)
peek(): O(1)
size(): O(1)
show(): O(n)
Space Complexity: O(n)
"""

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        self.size = 0
        
    def isEmpty(self):
        return self.size == 0
    
    def push(self, data):
        new_node = Node(data)
        new_node.next = self.top # here you join new_node with the old_node i.e. next will be the old_node or None.
        # You only have to keep track of the top node which is the new_node because its next will help you track 
        # the items in the stack.
        self.top = new_node
        self.size += 1
        
    def pop(self):
        if self.isEmpty():
            raise IndexError("Stack is Empty")
        item = self.top.data
        self.top = self.top.next
        self.size -= 1
        return item
    
    def peek(self):
        if self.isEmpty():
            raise IndexError("Stack is Empty")
        return self.top.data
    
    def size(self):
        return self.size
    
    def show(self):
        return str(self)
    
    def __str__(self):
        current = self.top
        items = []
        while current:
            items.append(current.data) # if item pushed is not a string, then you will get an error. Typecast
                                       # into string --> str(current.data). Python expects each element in items 
                                       # to be a string as join() can only join strings..
            current = current.next
        return "Stack displayed from top to bottom: " + " --> ".join(items)
        
a_stack = Stack()
a_stack.push('1')
a_stack.push('2')
a_stack.push('4')
print(a_stack.pop())
print(a_stack.show())

# while True:
#     #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
#     print('push <value>')
#     print('pop')
#     print('quit')
#     do = input('What would you like to do? ').split()
#     #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
#     operation = do[0].strip().lower()
#     if operation == 'push':
#         a_stack.push(int(do[1]))
#     elif operation == 'pop':
#         popped = a_stack.pop()
#         if popped is None:
#             print('Stack is empty.')
#         else:
#             print('Popped value: ', int(popped))
#     elif operation == 'quit':
#         break
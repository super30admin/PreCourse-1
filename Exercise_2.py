# Time Complexity - All operations (push, pop) are constant time: O(1)
# Space Complexity - O(n) for all n elements being pushed.


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None # To point to top of the stack
        
    def push(self, data):
        newNode = Node(data) # Create Node with new element 
        newNode.next = self.top # Link to current top node
        self.top = newNode # Mark it as the new top node
        
    def pop(self):
        if self.top is None:
            print("Stack Underflow") # Checking underflow
            return None 
        pop_value = self.top.data   # Get top elelment to pop
        self.top = self.top.next   # Move top to next new top 
        return pop_value
        

if __name__== "__main__" :        
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

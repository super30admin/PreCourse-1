# Kindly include Time and Space complexity at top of each file

# Time Complexity:
  # push() - O(1)
  # pop()  - O(1)

# Space Complexity: O(N)

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None
        self.size = 0 # Optional: To keep track of the size of the stack.
        
    def push(self, data):
        # Since we are implementing a stack, the push will always happen at the start of the linked list
        # so we can achieve push and pop in O(1) time complexity.
        # Create a Node from the given data
        new_node = Node(data)
        # Assign the node's next pointer to the head, so the new node is before head.
        new_node.next = self.head
        # Update the head to point to the new node. This ensures that we can access the last insterted node by referencing the head pointer.
        self.head = new_node
        self.size += 1
        
    def pop(self):
        # Check if the stack is empty or not.
        if self.head == None:
            # Means stack is empty. Nothing to pop
            return
        # From push we have ensured that the last inserted data is at the head. So we need to remove the element at the head and return that.
        popped_data = self.head.data
        self.head = self.head.next
        self.size -= 1
        return popped_data
        
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

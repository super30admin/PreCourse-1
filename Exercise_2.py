# Implementing a Stack using a Linked List.

# Time complexity:
# push function - O(1)
# pop function - O(1)
# Space complexity: O(n)
# Any problem you faced while coding this: No.

# This class creates the node of the linked list.
class Node():
    def __init__(self, data):
        self.data = data
        self.next = None

# The functions in this class will implement stack using a linked list.
class Stack():
    def __init__(self):
        # This will create the head of the linked list.
        self.head = None
    
    # This function will push the value into the stack.
    # The given value is prepended in the beginning of the linked list as the time complexity to prepend a value to a linked list is O(1).
    def push(self, data):
        new_node = Node(data)
        # if the linked list is empty, given value is made the head of the linked list. 
        if self.head is None:
            self.head = new_node
            return 
        # if the linked list is not empty, then we add the given value at the beginning of the linked list.
        else:
            new_node.next = self.head 
            self.head = new_node
            return 
    
    # This function pops the top value of the stack. 
    # So, we remove the first element of the linked list. The time complexity to do so is O(1).
    def pop(self):
        current_node = self.head
        self.head = current_node.next
        popped_value = current_node.data
        current_node = None
        return popped_value
        
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

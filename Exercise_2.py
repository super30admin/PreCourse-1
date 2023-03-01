
# Time Complexity : O(1)
# Space Complexity : O(n)
class Node:
    def __init__(self, data):
       self.data = data     # initialize the data and store the date passed in the arguments
       self.next = None     # Inintialize the next pointer and set it to the NONE
 
class Stack:
    def __init__(self):
        self.head_pointer = None # head pointer pointing at none
        self.stack_size = 0 # initializing the stakc size as 0


    def push(self, data):
        new_node = Node(data) # create obj for the Node class
        if self.head_pointer is None: # if the head pointer is pointing NONE
            self.head_pointer = new_node # then update the pointer and now the head pointer will point to the new node
        else:
            new_node.next = self.head_pointer # if there is already items in stack point the header to the new node
            self.head_pointer = new_node        # and also increment the stack size to 1
            self.stack_size += 1
        
    def pop(self):              # pop the value if stack is not NONE 
        if(self.isEmpty()):     # if NONE set heaader to None and return
            deleted_node=None
            return None
        else:
            deleted_node=self.head_pointer.data # if NOT NONE pop out the item and set the header to next node
            self.head_pointer=self.head_pointer.next 
            self.stack_size -= 1    # also update the stack size
        return deleted_node            # return the popped node
    
    def isEmpty(self):              # check if the stack is Empty or not.
          return self.stack_size == 0 # returns TRUE if Empty.
    

a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push')
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


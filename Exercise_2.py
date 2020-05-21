"""

     Student : Shahreen Shahjahan Psyche

"""

class Node:
    """
              Run Time Complexities of each functions are as follows:


                        def push : O(1)
                        def pop : O(N)

              Memory Complexity:

                        O(len(size of the linked list)) or O(N)


              The code ran successfully!
         """
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):

        # Initializing the place holders for the root of the stack and the last address of the stack.
        self.root_adr = None
        self.curr_adr = None

    def push(self, data):
        new_node = Node(data)

        # Creating a new node and saving it in the root_adr when root is none.
        if self.root_adr is None:
            self.root_adr = new_node
            self.curr_adr = self.root_adr

        # Otherwise creating a new node and saving it to the next position of the curr_adr node.
        else:
            self.curr_adr.next = new_node
            self.curr_adr = self.curr_adr.next

    def pop(self):

        # Checking whether the root node is empty.
        if self.root_adr is None:
            return None

        return_node = self.curr_adr
        val = return_node.data


        # Checking whether there is only 1 value in the stack.
        if self.root_adr == self.curr_adr:
            self.root_adr = None
            self.curr_adr = None
            return val

        # Iterating through the stack until the second last Node. Then making None the next pointer of the second last node.
        current_node = self.root_adr
        while(current_node is not None):
            if current_node.next == return_node:
                current_node.next = None
                self.curr_adr = current_node
                break
            else:
                current_node = current_node.next
        del return_node
        return val


        
a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
 
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

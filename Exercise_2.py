
class Node: # creating a specific node for the Linked List
    def __init__(self, data):
       self.data = data# for storing the data of the node
       self.next= next# to point to its next location.
 
class Stack:
    def __init__(self):
        self.header = None
    def push(self, data):
        node = Node(data) # creating the node for insertion
        temp = self.header
        if temp is None: # Insertion if the LinkedList
            self.header = node
        else:
            while temp.next is not None:
                temp= temp.next
            temp.next= node# insertion at the end of the list.
    def pop(self): # Function to remove the last element in this stack.
        temp = self.header
        if self.header is None: # if the stack is empty, return none.
            return
        while temp.next is not None:
            prev = temp
            temp = temp.next
        a = temp.data
        prev.next = None # setting the second last node's next to NONE, thereby removing the last node
        return a
    def print(self):        #Displaying the LinkedList 
        if self.header is None:
            print('Linked List is empty')
            return
        itr = self.header
        llstr = []
        while itr:
            llstr.append(itr.data)
            itr = itr.next

        print(llstr) 
a_stack = Stack()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    print('print')
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
    elif operation == 'print':
        a_stack.print()



# Time Complexity: As there is a while loop used for traversing into the series once, the time complexity is O(n)
# Space Complexity: Space complexity is O(1) .
# This code is checked and verifies by the python editor.
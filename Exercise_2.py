
# Exercise_2 : Implement Stack using Linked List.
  # push : O(1)
  # pop : O(1)

  
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None

    def push(self, data):
        # create a node 
        new_node = Node(data)
        # update the pointer and head always tracks top element
        new_node.next = self.head
        # update the head variable that tracks top element
        self.head = new_node
        print(self.head)
    def pop(self):
        if self.head is None:
            return IndexError("Cannot perform pop on Empty List")
        else:
            # catch head value
            popped_val = self.head.data
            # update the point to next element 
            self.head = self.head.next
            # return value 
            return popped_val
        

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

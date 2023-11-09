
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None


class Stack:
    def __init__(self):
        """
        Time Complexity : O(1)
        Space Complexity : O(1)
        """
        self.head = None
        
    def push(self, data):
        """
        Time Complexity : O(1)
        Space Complexity : O(1)
        check if head exists, if not than add head else change head to new node
        """
        new_node = Node(data)
        if not self.head:
            self.head = new_node
        else:
            new_node.next = self.head
            self.head = new_node
        
    def pop(self):
        """
        Time Complexity : O(1)
        Space Complexity : O(1)
        check if head exists, if not return null else make head.next as new head & remove head node.
        """
        if not self.head:
            return None
        else:
            pop_node = self.head
            self.head = self.head.next
            pop_node.next = None
            return pop_node.data

        
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

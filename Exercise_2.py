#// Time Complexity :O(1)
#// Space Complexity :O(n)
#// Did this code successfully run on Leetcode :Not found in leetcode
#// Any problem you faced while coding this :None


#// Your code here along with comments explaining your approach
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.top = None
        
    def push(self, data):
        """
        Push an element onto the stack.
        Time Complexity: O(1)
        """
        new_node = Node(data)
        new_node.next = self.top
        self.top = new_node
        print(f"Pushed {data} onto the stack")
        
    def pop(self):
        """
        Pop an element from the stack.
        Time Complexity: O(1)
        """
        if self.top is None:
            return None
        popped_value = self.top.data
        self.top = self.top.next
        print(f"Popped {popped_value} from the stack")
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

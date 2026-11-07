# Time Complexity :
#       push: O(1) - adding a new node at the head of the linked list.
#       pop: O(1) - removing the node at the head of the linked list.
# Space Complexity : O(N) - N is the number of elements in the stack, each element is stored as a node in the linked list.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding : Kind of confused when trying to implement push. so basically when we try to add a new node, I think thinking vertically helps. so new code added should point to previous node which head points to and the head should point to this new node next. so we create a new node and then we set new_node.next to self.head and then we set self.head to new_node.


# Your code here along with comments explaining your approach

#Trying to push again.


class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None


    #Thinking vertically helps. lets assume we got a first push operation, so we create a new node with the given data and then we point new_node.next to self.head which is intially None and then we updat this head to point to this new node.
    def push(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node


    # we already have self.head pointing to latest element, so we remove and return that element by getting value using self.head.data and then we move self.head to self.head.next so that head now points to the next element in the stack and we return data.
    def pop(self):
        if self.head is None:
            return None
        data = self.head.data
        self.head = self.head.next
        return data

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

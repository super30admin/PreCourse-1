
# Time Complexity : isEmpty O(1), push O(1), pop O(1), peek O(1), size O(n), show O(n) n being the size of the stack
# Space Complexity : O(n) number of elements added in the stack 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : needed time to brush up linked list concept

class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = None # this is the head of the linked list, linked list will be like [value,pointing to next node ]
        # like [30|->next [20 | ->next [10 | next -> None]]]
        
    def push(self, data):
        push_node = Node(data)
        push_node.next = self.head # push_node is of type node and its next should point to the top head of the linked list, 
        # why keeping the new data at the top of it ? because since its stack, we want to retrive the top element etc, so its better to put at the top of the linked list 
        self.head = push_node 

        # lets walk through an example to understand better
        # lets sya intial linked list is having data 10 [10 | next-> None], head = [None] intially none
        # new node is added of data say 20 
        # push_node = Node(data), push_node = [20 | next-> None]
        # so push_node.next -> [10 | next-> None]
        # so now the push_node = [20 | [10 | next -> None]]
        # and again keeping the head to the top of the linked list head = push_node

    def isEmpty(self):
        return self.head is None
        
    def pop(self):
        # edge case
        if self.isEmpty():
            return None  # is stack has no elements ntg gets poped
        pop_data = self.head.data # we got the top of the stack data and to pop we should move the head to the next pointer 
        self.head = self.head.next # now we no longer have the top element node in the linked list 
        return pop_data
    
    def peek(self):
        if self.isEmpty():
            return None
        return self.head.data # just peeking hte top most value no need to remove it from stack
    
    def size(self):  # sixe fo linked list is of more time complexity because we have to pass throughthe end of the code to know the size 
        size = 0
        current = self.head
        while current :
            size += 1
            current = current.next 
        return size

    def show(self): # same with the show as well we need to parse the whole linked list to show the elements of the linked list 
        elements = []
        current = self.head
        while current :
            elements.append(current.data)
            current = current.next
        return elements

        
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
    elif operation == 'show':
        print("Stack is : ",a_stack.show())
    elif operation == 'quit':
        break

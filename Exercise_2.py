
'''
Stack:
  Space Complexity: O(n) where n is the number of current elements in the stack
push():
  Time Complexity: O(1) as we have used a doubly linked list we can access the last element in the stack in constant time using self.head.prev 
pop():
  Time Complexity: O(1) as we have used a doubly linked list we can remove the last element by accessing self.head.prev in constant time
  
'''


class Node:
    def __init__(self, data, prev=None, next=None):
        self.data = data
        self.prev = prev
        self.next = next


class Stack:
    def __init__(self):
        self.head = None
        self.length = 0

    def push(self, data):
        if self.length == 0:
            self.head = Node(data)
            self.head.prev, self.head.next = self.head, self.head

        else:
            temp = self.head.prev
            temp.next = Node(data, temp, self.head)
            self.head.prev = temp.next
        self.length += 1
        return True

    def pop(self):
        if self.length == 0:
            return None

        if self.length == 1:
            temp = self.head.data
            self.head = None
            self.length -= 1
            return temp

        popped_data = self.head.prev.data
        temp = self.head.prev.prev
        temp.next = self.head
        self.head.prev = temp
        self.length -= 1
        return popped_data

    def show(self):
        res = []
        curr = 0
        temp = self.head

        while curr != self.length:
            res.append(temp.data)
            temp = temp.next
            curr += 1
        return res


# Default Test Case
a_stack = Stack()
while True:
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
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


# ######################Additional Test Cases##########################
# (1) Push Stack
s = Stack()
s.push(1)
s.push(2)
s.push(3)
op = s.push(4)
assert op == True, f"Expected True as output but instead got {op}"
assert s.show() == [
    1, 2, 3, 4], f"Expected [1,2,3,4] as output but instead got {s.show()}"


# (2) Stack Pop
s = Stack()
a = s.pop()
assert a == None, f"Expected None as output but instead got {a}"
s.push('1')
s.push('2')
a = s.pop()
assert a == '2', f"Expected 2 as output but instead got {a}"
a = s.pop()
assert a == '1', f"Expected 1 as output but instead got {a}"
a = s.pop()
assert a == None, f"Expected None as output but instead got {a}"
# #######################################################################

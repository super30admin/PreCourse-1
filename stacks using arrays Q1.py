# stack
class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.top = None
        self.items = []

    def isEmpty(self):
        if self.top is None:  # O(1) - TC   #SC - 1
            print('The stack is empty')

    def push(self, item):  # O(n) for inserting n items
        if len(self.items) is None:  # SC -  O(1)
            self.items.append(item)  #tc- 0(1)
        else:
            self.items.insert(0, item)

    def pop(self):  # O(n) for popping item
        if len(self.items) is None:           #SC - O(1)
            print('stack has no elements')
        else:
            print('popped element is ', self.items[0])
            del self.items[0]

    def peek(self):  # O(1) + O(1) peeking two elements
        print('first value of stack is', self.items[0])
        print('last value of stack is', self.items[-1])   #tc: 0(1)  sc-o(1)

    def size(self):  # O(1)
        print('the size is', len(self.items))    #tc - 0(1)  sc- 0(1)

    def show(self):  # O(1)         #tc= O(1) and       O(1)
        print('stack is', self.items)


s = myStack()
s.push('1')
s.push('2')
s.pop()
s.show()
class myStack:
    def __init__(self):
        '''
        We need to use lists for stacks in python.
        '''
        self.items = []

    def isEmpty(self):
        '''
        Time Complexity: O(1)
        Space Complexity: O(1)
        '''
        return self.items == []

    def push(self, item):
        '''
        Time Complexity: O(n)
        Space Complexity: O(1)
        '''
        self.items.insert(0, item)

    def pop(self):
        '''
        Time Complexity: O(1)
        Space Complexity: O(1)
        '''
        return self.items.pop(0)        
        
    def peek(self):
        '''
        Time Complexity: O(1)
        Space Complexity: O(1)
        '''
        return self.items[0]

    def size(self):
        '''
        Time Complexity: O(n)
        Space Complexity: O(1)
        '''
        return len(self.items)

    def show(self):
        '''
        Time Complexity: O(1)
        Space Complexity: O(1)
        '''
        return self.items

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

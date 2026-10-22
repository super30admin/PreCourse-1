# Time Complexity: O(1) - append, O(1) - pop, O(1) - peek(), isempty and size
# Space Complexity: O(n) - for the list to save n elements where n is the capacity of the list

class StackFullError(Exception):
    """Exception raised when the stack is full"""
    pass

class myStack:
    def __init__(self, capacity: int):
        self.stack = []
        self.capacity = capacity

    def isEmpty(self):
        return len(self.stack) == 0
    
    
    def push(self, item):
        if self.size() >= self.capacity:
            raise StackFullError("Stack is Full") 
    
        self.stack.append(item)

        
    def pop(self):
        if self.isEmpty():
            raise IndexError("Stack is empty")
        
        return self.stack.pop()
            
    
    def peek(self):
        if self.isEmpty():
            raise IndexError("Stack is empty")

        return self.stack[-1]
    
    
    def size(self):
        return len(self.stack)
    
        
    def show(self) -> list: 
        return list(self.stack)



if __name__ == "__main__":
    s = myStack(5)
    try:
        s.pop()
        assert False, "expected IndexError"
    except IndexError:
        pass

    try:
        s.peek() 
        assert False, "expected IndexError"
    except IndexError:
        pass

    s.push('1')
    s.push('3')
    s.push('10')
    s.push('7')

    assert s.peek() == '7'
    s.push('8')
    
    assert s.pop() == '8'
    s.push('8')
    try:
        s.push('5')
        assert False, "expected StackFullError"
    except StackFullError:
        pass
    
    try:
        s.push('7')
        assert False, "expected StackFullError"
    except StackFullError:
        pass
    print(s.show())
    assert s.size() == 5



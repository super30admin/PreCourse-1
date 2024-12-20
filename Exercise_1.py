class myStack:
    def __init__(self):
        self.stk_arr = []
        
    def isEmpty(self):
        return len(self.stk_arr) == 0
        
    def push(self, item):
        self.stk_arr.append(item)
        
    def pop(self):
        if not self.isEmpty():
            return self.stk_arr.pop()
        else:
            return "Stack is empty"
        
    def peek(self):
        if not self.isEmpty():
            return self.stk_arr[-1]
        else:
            return "Stack is empty"

    def size(self):
        return len(self.stk_arr)
        
    def show(self):
        return self.stk_arr

# Example usage
s = myStack()
s.push('1')
s.push('2')
print(s.pop())  # Output: 2
print(s.show()) # Output: ['1']
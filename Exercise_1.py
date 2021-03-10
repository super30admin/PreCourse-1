# class myStack:
#      def __init__(self):
         
#      def isEmpty(self):
         
#      def push(self, item):
         
#      def pop(self):
        
        
#      def peek(self):
        
#      def size(self):
         
#      def show(self):
         

# s = myStack()
# s.push('1')
# s.push('2')
# print(s.pop())
# print(s.show())
class myStack:
    def __init__(self):
        self.stack = []
        
    def isEmpty(self):
        return len(self.stack) <= 0
    
    def push(self, item):
        self.stack.append(item)
        
    def pop(self):
        self.stack = self.stack[:-1]
        return self.stack[-1]
        # return self.stack.pop()
    
    def peek(self):
        return self.stack[-1]
    
    def size(self):
        return len(self.stack)
    
    def show(self):
        return self.stack
    
s = myStack()
print(s.size())
print(s.show())
s.push('1')
#print("len", len(s.stack))
#print(s.isEmpty())
s.push('2')

print(s.stack)
print("pop", s.pop())
print("show", s.show())

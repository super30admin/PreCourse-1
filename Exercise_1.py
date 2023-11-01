# - push: O(1) time, O(n) space (in the worst case)
    # - pop: O(1) time, O(1) space
    # - peek: O(1) time, O(1) space
    # - size: O(1) time, O(1) space
    # - show: O(n) time, O(1) space
class myStack:
    def __init__(self):
        self.items = []
         
    def isEmpty(self):
        if len(self.items) == 0:
            print("stack is empty")
        else:
            print("Stack is not empty") 
         
    def push(self, item):
        self.items.append(item)
          
    def pop(self):
        if len(self.items) > 0:
            popped_elements = self.items.pop()
            print("popped elements: ", popped_elements)
        else:
            print("stack is empty")
        
    def peek(self):
        if len(self.items) > 0:
            top_element = self.items[-1]
            print("topmost element of stack: ", top_element)
        else:
            print("stack is empty")
        
    def size(self):
        print("Size of stack:", len(self.items))
         
    def show(self):
        for elements in self.items:
            print(elements)
         

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
# print(s.pop())
# print(s.show())
s.pop()
s.peek()
s.size()
s.show()


"""
Time complexity: 
O(1) for push, pop, peek, isEmpty, size.
O(n) for show()

Space complexity: 
O(n) -> n is the number of elements in array
"""

class myStack:
     
     def __init__(self, cap):
         self.arr = [0]*cap
         self.capacity = cap
         self.top = -1      
         
     def isEmpty(self):
         return self.top == -1        
         
     def push(self, item):
         # check for stack overflow
         if self.top == self.capacity - 1:
             print("Stack overflow")
             return
         self.top += 1
         self.arr[self.top] = item        
         
     def pop(self):
         # check for stack underflow
         if self.top == -1:
             print("Stack underflow")
             return
         self.top -= 1
         return self.arr[self.top]       
        
     def peek(self):
         if self.isEmpty():
             print("Stack is empty")
             return
         return self.arr[self.top]
        
     def size(self):
         return self.top + 1     
         
     def show(self):
         print("Showing stack elements:")
         for i in range(self.top + 1):
             print(self.arr[i])
                
def main():
  s = myStack(5)
  s.push('1')
  s.push('2')
  print(s.pop())
  s.show()

if __name__ == "__main__":
    main()
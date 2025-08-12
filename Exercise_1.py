class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
      self.arr=[]
      self.size = 0
    def isEmpty(self):
      """Time complexity : O(1)
      """
      self.size == 0
       
         
    def push(self, item):
      """Time complexity : O(1)
      """
      self.arr.append(item)
      self.size+=1
         
    def pop(self):
      """Time complexity : O(1)
      """
      if self.isEmpty():
        return None
      self.size-=1
      return self.arr.pop()
        
    def peek(self):
      """Time complexity : O(1)
      """
      if self.isEmpty():
        return None
      return self.arr[-1]
      
        
    def size(self):
      """Time complexity : O(1)
      """
      return self.size
         
    def show(self):
      """Time complexity : O(n)
      """
      return self.arr[::-1]
      """Space Complexity: O(n) - for storing the n elements in the stack 
      """

s = myStack()
s.push('1')
s.push('2')
s.push('3')
print(s.pop())
print(s.show())

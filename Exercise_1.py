# isEmpty - O(1)
# push - O(1)
# pop - O(1)
# peek - O(1)
# size - O(1)
# show - O(n)

# space complexity - O(n)
class myStack:  
    def __init__(self, counter=-1):
      self.arr = ['']*10
      self.counter = counter
         
    def isEmpty(self):
      return self.counter == -1
    def push(self, item):
      if self.counter < len(self.arr):
        self.arr[self.counter+1] = item
        self.counter += 1
      else:
         print("stack overflow!!")
         
    def pop(self):
      top_ele =  self.arr[self.counter]
      self.counter -= 1
      return top_ele

        
    def peek(self):
      return self.arr[self.counter]
        
    def size(self):
      return self.counter+1
         
    def show(self):
      return self.arr[:self.counter+1]
         

if __name__ == "__main__":
  s = myStack()
  s.push('1')
  s.push('2')
  s.push('8')
  s.push('10')
  s.push('12')
  s.push('22')
  print(s.pop())
  print(s.show())
  print(s.size())
  print(s.peek())
  print(s.show())


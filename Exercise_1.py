#This problem is not on leetcode
#The time complexity for all operations is O(1)
# Space Complexity is O(n)


class myStack:

  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.arr=[]
      
  def isEmpty(self):
    if len(self.arr)==0:
      return True
    else:
      return False
  def push(self, item):
    self.arr.append(item)
      
  def pop(self):
    a=self.arr[::-1][0]
    self.arr.remove(self.arr[::-1][0])
    return a
  def peek(self):
    return self.arr[0]
  def size(self):
    return len(self.arr)
  def show(self):
    return self.arr
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

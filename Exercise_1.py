# Time Complexities
# isEmpty: O(1)
# push: O(1)
# pop: O(1)
# peek: O(1)
# size: O(1)
# show: O(n)


class myStack:

  def __init__(self):
    self.stack_obj = []
    
  def isEmpty(self):
    return self.size() == 0
         
  def push(self, item):
    self.stack_obj.append(item)
         
  def pop(self):
    return self.stack_obj.pop()
             
  def peek(self):
    return self.stack_obj[-1]
        
  def size(self):
    return len(self.stack_obj)
         
  def show(self):
    return self.stack_obj

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

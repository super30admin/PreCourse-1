class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.array=[]
       self.length=0
         
     def isEmpty(self):
       '''O(1) time complexity'''
       if self.length ==0:
         return True
       else:
         return False
         
     def push(self, item):
       '''O(1) best case O(n) worst case time complexity '''
       self.array.append(item)
       self.length=self.length+1
         
     def pop(self):
       '''O(1) time complexity'''
       if self.length==0:
         return 'stack is empty'
       popped_item=self.array[self.length-1]
       del self.array[self.length-1]
       self.length=self.length-1
       return popped_item
        
        
     def peek(self):
       '''O(1) time complexity'''
       return self.array[0]
       
        
     def size(self):
       '''O(1) time complexity'''
       return self.length
         
     def show(self):
       '''O(1) time complexity'''
       return self.array
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
print(s.pop())
print(s.isEmpty())
print(s.pop())
print(s.show())
s.push('2')
s.push('3')
s.push('4')
s.push('5')
s.push('6')
print(s.pop())
print(s.show())
print(s.size())

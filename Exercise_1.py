class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

  #Time complexity for all the funtion is 0(1) except show function which is O(n)
  #Space complexity is O(1) for all the function except push which is 0(n), n is the number of elements
     def __init__(self):
         self.arr1 = []
         self.count = 0

     def isEmpty(self):
      return self.count == 0
     def push(self, item):
      self.arr1.append(item)
      self.count +=1
      print("Data added to Stack")
      return
     def pop(self):
      if self.isEmpty():
        print("No data to pop")
        return 
      self.count -=1
      return self.arr1.pop()
        
        
     def peek(self):
      if self.isEmpty():
        print("No data to peek")
        return
      return self.arr1[-1]
     def size(self):
      return self.count
         
     def show(self):
      if self.isEmpty():
        print("No data to show")
        return
      return self.arr1

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.peek())

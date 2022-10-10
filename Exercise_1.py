# Time Complexity - O(1)
# Space Complexity - O(n) (Array to store n values)
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.arr = []

    def isEmpty(self): 
        if len(self.arr) == 0:
            return True
        else:
            return False

    def push(self, item):
        self.arr.append(item)
        print(self.arr)

    def pop(self):
        return self.arr.pop(len(self.arr)-1)
        
    def peek(self):
        return self.arr[len(self.arr)-1]

    def size(self):
        return len(self.arr)

    def show(self):
        return self.arr

s = myStack()
print(s.isEmpty())
s.push('1')
s.push('2')
print(s.pop())
print(s.peek())
print(s.size())
print(s.show())
print(s.isEmpty())
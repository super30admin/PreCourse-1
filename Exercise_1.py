class myStack:
    #initialize
     def __init__(self):
        self.s = [] #initialize Stack

     def isEmpty(self):
         return len(self.s)==0

     def push(self, item):
         self.s.append(item)

     def pop(self):

         if (self.isEmpty()):
             print("Stack Underflow")
         else:
            return self.s[len(self.s)-1]
            self.s = self.s[:len(self.s)-1]#remove the element at top of stack pop(0)


     def peek(self):
         if (self.isEmpty()):
             print("Stack Underflow")
         else:
            print(self.s[len(self.s)-1])

     def size(self):
         print(len(self.s))

     def show(self):
         return self.s


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

#Time complexity: O(N)
#Space complexity: O(N)

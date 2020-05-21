"""

     Student : Shahreen Shahjahan Psyche

"""

class myStack:
     """
          Run Time Complexities of each functions are as follows:

                    def isEmpty : O(1)
                    def push : O(1)
                    def pop : O(1)
                    def peek : O(1)
                    def size : O(1)
                    def show : O(N)

          Memory Complexity:

                    O(len(records)) or O(N)


          The code ran successfully!
     """
     def __init__(self):
          # Intialized the stack with a list.
          self.records = []
         
     def isEmpty(self):
          # Checking whether the size of the list is 0. Because if the size is 0 that means its empty.
          if len(self.records) == 0:
               return True
          else:
               return False

     def push(self, item):
          # Appending the new item in the list. It gets added the last.
          self.records.append(item)
         
     def pop(self):
          # Popping the last pushed value. Added an exception cause if the stack is empty then it will throw an error. To handle that case I have added the try
          # except block.
          try:
               return self.records.pop()
          except ValueError:
               print("The Stack Must Be Empty!")

     def peek(self):
          # Returning the last pushed value. Added an exception cause if the stack is empty then it will throw an error. To handle that case I have added the try
          # except block.
          try:
               val = self.records[len(self.records)-1]
               return val
          except ValueError:
               print("The Stack Must Be Empty!")

     def size(self):
          return len(self.records)
         
     def show(self):
          return self.records
         


# Test Cases
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

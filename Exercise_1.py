
'''

Runtime: 

    pushing element O(1)
    popping element O(1)

'''



class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):

        self.stack = []
         
     def isEmpty(self):

        if(len(self.stack) == 0):

            return None

        else:
    
            return 1    
         
     def push(self, item):

        self.stack.append(item)

        print(self.stack)

        return self.stack
         
     def pop(self):

        item = self.stack.pop()

        return self.stack
    
     def peek(self):

        return self.stack[-1]
        
     def size(self):

        print('Size of the stack'.format(len(self.stack)))
         
     def show(self):

        return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
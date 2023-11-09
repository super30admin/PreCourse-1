class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    
    def __init__(self):
        self.myArr=[]
        
        
    def isEmpty(self):
        if len(self.myArr)==0:
            return True
        else:
            return False
    
    def push(self,item):
        self.myArr.append(item)
    
    def pop(self):
        if not len(self.myArr)==0:
            self.myArr.pop()
        
    def peek(self):
        if not self.isEmpty():
            myArr[len(self.myArr)-1]
        
    def size(self):
        return len(self.myArr)
        
    def show(self):
        print(self.myArr)
        
        
    



s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
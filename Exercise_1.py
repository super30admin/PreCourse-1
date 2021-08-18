class myStack:
    def __init__(self):
            self.__data = list()
            self.__count = 0
            
    def isEmpty(self):
        return self.size() == 0
        
    def push(self, item):
        self.__data.append(item)
        self.__count += 1
         
    def pop(self):
        if self.isEmpty():
            print("Empty stack!")
            return
        
        self.__count -= 1
        return self.__data.pop()
        
    def peek(self):
        if self.isEmpty():
            print("Empty stack!")
            return
        
        return self.__data[-1]
        
    def size(self):
        return len(self.__data)
         
    def show(self):
        if self.isEmpty():
            print("Empty stack!")
            return
        
        return self.__data
        
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
